package POO;

import Ejercicios.EjemploVariableDeInstancia;
import EntradaSalida.Tools;

public class TestEjemploVariableDeInstancia {
	public static void main(String[] args) {
		EjemploVariableDeInstancia obj=new EjemploVariableDeInstancia();
		obj.setNom(Tools.leerString("Nombre: "));
		obj.setEdad(Tools.leerByte("Edad: "));
		Tools.imprimePantalla("Persona"+obj);
	}
}
