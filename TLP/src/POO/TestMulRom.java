package POO;

import EntradaSalida.Tools;

public class TestMulRom {
	public static void main(String[] args) {
		MultiRusa();
	}
	public static void MultiRusa() {
		int suma=0;
		MulRom objeto=new MulRom();
		objeto.setDiv(Tools.leerEntero("Dame el divisor:"));
		objeto.setMul(Tools.leerEntero("Dame el multiplicador:"));
		int div=objeto.getDiv();
		int mul=objeto.getMul();
		while(div!=1) {
			if(div%2==1) {
				suma+=mul;
			}
			div/=2;
			mul*=2;
		}
		Tools.imprimePantalla("La suma es= " + suma);
	}
}
