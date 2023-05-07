package POO;

import javax.swing.JOptionPane;
import Ejercicios.CatalogoDeCuentas;
import EntradaSalida.Tools;

public class TestCuentas {
	public static String Boton(String menu) {
		String valores[]=menu.split(",");
		int n;
		n=JOptionPane.showOptionDialog(null, "M E N U","Seleccione dando clic",JOptionPane.NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return valores[n];
	}
	public static void BuscaCuentas(String menu) {
		String sel="";
		do {
			sel=Boton(menu);
			switch(sel) {
			case "Buscar Cuenta": Tools.imprimePantalla(CatalogoDeCuentas.Cuenta(Tools.leerString("Escribe el codigo: "))); break;
			case "Salir":break;
			}
		}while(!sel.equalsIgnoreCase("Salir"));
	}
	public static void main(String[] args) {
		BuscaCuentas("Buscar Cuenta,Salir");
	}
}
