package Ejercicios;

public class Computadora {
	private String marca;
	private String modelo;
	private String so;
	private byte ram;
	private short rom;
	private String procesador;
	private String encendido;
	public Computadora() {}
	public Computadora(String marca, String modelo, String so, byte ram, short rom, String procesador, String encendido) {
		this.marca=marca;
		this.modelo=modelo;
		this.so=so;
		this.encendido=encendido;
		this.ram=ram;
		this.rom=rom;
		this.procesador=procesador;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getSo() {
		return so;
	}
	public void setSo(String so) {
		this.so = so;
	}
	public String getEncendido() {
		return encendido;
	}
	public byte getRam() {
		return ram;
	}
	public void setRam(byte ram) {
		this.ram = ram;
	}
	public short getRom() {
		return rom;
	}
	public void setRom(short rom) {
		this.rom = rom;
	}
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public void setEncendido(String encendido) {
		this.encendido=encendido;
	}
	public static String Encender(boolean encendido) {
		String t=encendido?"La computadora se esta encendiendo":"La computadora ya estaba encendida";
		return t;
	}
	public static String Apagar(boolean encendido) {
		String t=encendido?"La computadora se esta apagando":"La computadora ya estaba apagada";
		return t;
	}
	public static void caso(String encendido) {
		
	}
	public String toString() {
		return "Computadora [marca=" + marca + ", modelo=" + modelo + ", so=" + so + ", ram=" + ram + ", rom=" + rom
				+ ", procesador=" + procesador + "]";
	}
}
