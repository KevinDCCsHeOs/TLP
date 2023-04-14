package POO;

import javax.swing.JOptionPane;

import Ejercicios.Curp;
import EntradaSalida.Tools;

public class TestCurp {
	public static String Boton(String menu) {
		String valores[]=menu.split(",");
		int n;
		n=JOptionPane.showOptionDialog(null, "M E N U","Seleccione dando clic",JOptionPane.NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return valores[n];
	}
	public static String Desplegable(String menu) {
		String valores[]=menu.split(",");
		String res=(String)JOptionPane.showInputDialog(null,"M E N U","SELECCIONA TU ENTIDAD: ",
				JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return res;
	}
	public static void MenuCurp(String menu) {
		String sel="";
		byte si=0;
		do {
			sel=Boton(menu);
			switch(sel) {
			case "CURP":
				Curp curp=new Curp();
				curp.setNom(Tools.leerString("NOMBRE:"));
				curp.setApe1(Tools.leerString("PRIMER APELLIDO"));
				curp.setApe2(Tools.leerString("SEGUNDO APELLIDO"));
				curp.setDia(Tools.leerByte("DIA"));
				curp.setMes(Tools.leerByte("MES"));
				curp.setAño(Tools.leerShort("Año"));
				do {
					curp.setGenero(Tools.leerChar("GENERO: [H]ombre [M]ujer"));
					si=(byte) ((curp.getGenero()=='H'||curp.getGenero()=='M')?1:0);
				}while(si!=1);
				curp.setEntidad(Desplegable("AGUASCALIENTES,BAJA CALIFORNIA,"
						+ "BAJA CALIFORNIA SUR,CAMPECHE,CHIAPAS,CHIHUAHUA,COAHUILA,"
						+ "COLIMA,DISTRITO FEDERAL,DURANGO,GUANAJUATO,GUERRERO,HIDALGO,"
						+ "JALISCO,MEXICO,MICHOACAN,MORELOS,NAYARIT,NUEVO LEON,OAXACA,"
						+ "PUEBLA,QUERETARO,QUINTANAROO,SAN LUIS POTOSI,SINALOA,SONORA,"
						+ "TABASCO,TAMAULIPAS,TLAXCALA,VERACRUZ,YUCATAN,ZACATECAS"));
				Tools.imprimePantalla("Su CURP es: \n"+Curp.generaCurp(curp.getApe1(), curp.getApe2(), 
						curp.getNom(), curp.getDia(), curp.getMes(), curp.getAño(), 
						curp.getGenero(), curp.getEntidad()));
				break;
			case "Salir":
				Tools.imprimePantalla("Adios");
				break;
			}
		}while(!sel.equalsIgnoreCase("Salir"));
	}
	public static void main(String[] args) {
		MenuCurp("CURP,Salir");
	}
}
