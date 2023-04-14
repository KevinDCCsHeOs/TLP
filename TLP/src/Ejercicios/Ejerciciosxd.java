package Ejercicios;

import javax.swing.JOptionPane;

public class Ejerciciosxd {
	public static void main(String[] args) {
		int max = 0 , min = 0 , num = 0 , sum = 0;
		for(byte i=1;i<=25;i++) {
			num=Integer.parseInt(JOptionPane.showInputDialog("Dame un entero:"));
			if(num>max) {
				max=num;
			}
			if(num<min) {
				min=num;
			}
			sum+=num;
		}
		JOptionPane.showMessageDialog(null,"El promedio es: "+sum/25+"\n"+"El numero maximo es: "+max+"\n"+
		"El numero minimo es: "+min);
	}
}
