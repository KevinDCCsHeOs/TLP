package POO;

import javax.swing.JOptionPane;

import Ejercicios.Computadora;
import EntradaSalida.Tools;

public class TestComputadora {
	public static String Boton(String menu) {
		String valores[]=menu.split(",");
		int n;
		n=JOptionPane.showOptionDialog(null, "Seleccione dando clic","Menu de figuras",JOptionPane.NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return valores[n];
	}
	public static String Desplegable(String menu) {
		String valores[]=menu.split(",");
		String res=(String)JOptionPane.showInputDialog(null,"M E N U","SELECCIONA TU ENTIDAD: ",
				JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return res;
	}
	public static void CapturaDatosComputadora(String menu) {
		String sel="";
		do {
			sel=Boton(menu);
			switch(sel) {
			case "Computadora":
				Computadora com=new Computadora();
				com.setMarca(Tools.leerString("Marca:"));
				com.setModelo(Tools.leerString("Modelo:"));
				com.setSo(Tools.leerString("Sistema Operativo:"));
				com.setRam(Tools.leerByte("Ram:"));
				com.setRom(Tools.leerShort("Rom:"));
				com.setProcesador(Tools.leerString("Procesador:"));
				com.setEncendido(Desplegable("Encendido,Apagada"));;
				switch(com.getEncendido()) {
				
				}
			}
		}while(!sel.equalsIgnoreCase("salir"));
	}
}
