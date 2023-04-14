package Ejercicios;

public class EjemploVariableDeInstancia {
	private String nom;
	private byte edad;
	public EjemploVariableDeInstancia() {}
	public EjemploVariableDeInstancia(String nom, byte edad) {
		this.nom=nom;
		this.edad=edad;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public byte getEdad() {
		return edad;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}
}
