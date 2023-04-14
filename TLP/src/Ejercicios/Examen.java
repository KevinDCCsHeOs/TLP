package Ejercicios;

import javax.swing.JOptionPane;

public class Examen {
public static void valores(int val1,int val2,String pro) {
		switch(pro) {
		case "+":JOptionPane.showMessageDialog(null, "La respuesta es="+(val1+val2));
			break;
		case "-":JOptionPane.showMessageDialog(null, "La respuesta es="+(val1-val2));
			break;
		case "*":JOptionPane.showMessageDialog(null, "La respuesta es="+(val1*val2));
			break;
		case "/":JOptionPane.showMessageDialog(null, "La respuesta es="+(val1/val2));
			break;
		case "%":JOptionPane.showMessageDialog(null, "La respuesta es="+(val1%val2));
			break;
		default:JOptionPane.showMessageDialog(null, "Solo puede poner +,-,*,/,%");
		}
}
public static void main(String[] args) {
	String con="";
	do {
		int val1=Integer.parseInt(JOptionPane.showInputDialog("Dame el primer valor:"));
		int val2=Integer.parseInt(JOptionPane.showInputDialog("Dame el segundo valor:"));
		String pro=JOptionPane.showInputDialog("Dame un operador: ");
		valores(val1,val2,pro);
		con=JOptionPane.showInputDialog("¿Desea continuar? si/no");
		switch(con) {
		case "si":JOptionPane.showMessageDialog(null, "Puedes continuar");
			break;
		case "no":JOptionPane.showMessageDialog(null, "Adios");
			break;
		}
	}while(!con.equalsIgnoreCase("no"));
}
}
