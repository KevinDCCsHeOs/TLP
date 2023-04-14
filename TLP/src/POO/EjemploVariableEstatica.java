package POO;

import EntradaSalida.Tools;

public class EjemploVariableEstatica {
	public static int contador = 0;
    
    public EjemploVariableEstatica() {
        contador++;
    }
    
    public static void main(String[] args) {
        EjemploVariableEstatica objeto1 = new EjemploVariableEstatica();
        EjemploVariableEstatica objeto2 = new EjemploVariableEstatica();
        EjemploVariableEstatica objeto3 = new EjemploVariableEstatica();
        Tools.imprimePantalla("El número de objetos creados es: " + contador);
    }
}
