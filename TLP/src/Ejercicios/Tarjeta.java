package Ejercicios;

public class Tarjeta {
	private byte tarj;
	private float cant;
	public Tarjeta() {}
	public Tarjeta(byte tarj, float cant) {
		this.tarj=tarj;
		this.cant=cant;
	}
	public byte getTarj() {
		return tarj;
	}
	public float getCant() {
		return cant;
	}
	public void setTarj(byte tarj) {
		this.tarj = tarj;
	}
	public void setCant(float cant) {
		this.cant = cant;
	}
	@Override
	public String toString() {
		return "Tipo de tarjeta= " + tarj + "\n Monto de la tarjeta=" + Monto();
	}
	public double Monto() {
		double can=0.0;
		switch(tarj) {
		case 1:can=cant*0.25;can+=cant;break;
		case 2:can=cant*0.35;can+=cant;break;
		case 3:can=cant*0.40;can+=cant;break;
		default:can=cant*0.50;can+=cant;break;
		}
		return can;
	}
	public static Tarjeta MejorTarjeta(Tarjeta tarj1,Tarjeta tarj2) {
		return (tarj1.tarj>tarj2.tarj)?tarj1:tarj2;
	}
}
