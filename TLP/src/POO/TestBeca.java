package POO;

import javax.swing.JOptionPane;

import Ejercicios.EstudianteBeca;
import EntradaSalida.Tools;

public class TestBeca {
	public static String Desplegable(String menu) {
		String valores[]=menu.split(",");
		String res=(String)JOptionPane.showInputDialog(null,"¿Estas becado?","M E N U",
				JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return res;
	}
	public static String Desplegable2(String menu) {
		String valores[]=menu.split(",");
		String res=(String)JOptionPane.showInputDialog(null,"Selecciona tu area","M E N U",
				JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return res;
	}
	public static void CapturaEstudiantes() {
		String becado="", listado="Datos Capturados: \n\n";
		byte res;
		do {
			byte x;
			String s;
			EstudianteBeca es=new EstudianteBeca();
			es.setNom(Tools.leerString("Nombre: "));
			es.setId(Tools.leerLong("Numero de control: "));
			do {
				es.setSem(Tools.leerByte("Semestre: "));
				x=(byte) ((es.getSem()>0 && es.getSem()<=12)?1:0);
				if (x==0)
					Tools.imprimePantalla("El semestre solo puede ser entre 1 y 12");
			}while(x!=1);
			es.setBec(Desplegable("Si,No"));
			es.setArea(Desplegable2("Electrica,Electronica,Gestion Empresarial,"
					+ "Industrial,Informatica,Mecanica,Quimica,Sistemas Computacionales"));
			s=es.getBec();
			switch (s) {
			case "Si":
				EstudianteBeca.Beca(true);
				becado+=es.toString2()+"\n";
				break;
			case "No":
				EstudianteBeca.Beca(false);
				break;
			}
			listado+=es.toString()+"\n";
			res=(byte)Tools.seguirSino("¿Desea continuar?");
		}while(res!=1);
		Tools.imprimePantalla(listado+"\n\n\n Alumnos Con Beca Alimenticia\n\n"+becado);
	}
	public static void main(String[] args) {
		CapturaEstudiantes();
	}
}
