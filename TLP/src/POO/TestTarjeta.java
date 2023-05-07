package POO;

import javax.swing.JOptionPane;
import Ejercicios.Tarjeta;
import EntradaSalida.Tools;

public class TestTarjeta {
	public static String Boton(String menu) {
		String valores[]=menu.split(",");
		int n;
		n=JOptionPane.showOptionDialog(null, "M E N U","Seleccione dando clic",JOptionPane.NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return valores[n];
	}
	public static void CapturaObjetos() {
		String cad="";
		Tarjeta obj=new Tarjeta();
		obj.setTarj(Tools.leerByte("Tipo de tarjeta:"));
		obj.setCant(Tools.leerFloat("Moto de la targeta:"));
		Tools.imprimePantalla(obj.toString());
		cad=Tools.leerString("¿Tiene otra tarjeta?: Si/No");
		switch (cad) {
		case "Si":
			Tarjeta obj2=new Tarjeta();
			obj2.setTarj(Tools.leerByte("Tipo de tarjeta:"));
			obj2.setCant(Tools.leerFloat("Monto de la tarjeta: "));
			Tarjeta obj3=new Tarjeta();
			cad=Tools.leerString("¿Quiere escoger la tarjeta a utilizar? Si/No");
			switch (cad) {
			case "Si":
				cad=Boton("Tarjeta 1,Tarjeta 2");
				switch (cad) {
				case "Tarjeta 1":obj3=obj;Tools.imprimePantalla(obj3.toString());break;
				case "Tarjeta 2":obj3=obj2;Tools.imprimePantalla(obj3.toString());break;
				}
				break;
			case "No":
				obj3=Tarjeta.MejorTarjeta(obj, obj2);
				Tools.imprimePantalla(obj3.toString());
				break;
			}
			break;
		}
	}
	public static void main(String[] args) {
		CapturaObjetos();
	}
}
