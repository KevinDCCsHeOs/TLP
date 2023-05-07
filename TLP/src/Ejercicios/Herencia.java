package Ejercicios;

import EntradaSalida.Tools;

public class Herencia {
	private String nom;
	private String cue;
	private double sal;
	private double tipo;
	public Herencia(String nom, String cue, double sal, double tipo){
		this.nom=nom;
		this.cue=cue;
		this.sal=sal;
		this.tipo=tipo;
	}
	public class subClase extends Herencia{
		private double cuotaMantenimiento;
		public subClase(String nom, String cue, double sal, double tipo, double mante) {
			super(nom, cue, sal, tipo);
			AsignarCuotaMantenimiento(mante);
		}
		public void AsignarCuotaMantenimiento(double cant) {
			if (cant<0) Tools.salidaError("Error... Cantidad negativa");return;
			//cuotaMantenimiento=cant;
		}
		public double obtenerCuotaManten() {
			return cuotaMantenimiento;
		}
	}
}

