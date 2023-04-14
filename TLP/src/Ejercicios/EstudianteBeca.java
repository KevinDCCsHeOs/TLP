package Ejercicios;

public class EstudianteBeca {
	private String nom;
	private long id;
	private byte sem;
	private String bec;
	private String area;
	public EstudianteBeca() {}
	public EstudianteBeca(String nom, long id, byte sem, String bec, String area) {
		this.nom=nom;
		this.id=id;
		this.sem=sem;
		this.bec=bec;
		this.area=area;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public byte getSem() {
		return sem;
	}
	public void setSem(byte sem) {
		this.sem = sem;
	}
	public String getBec() {
		return bec;
	}
	public void setBec(String bec) {
		this.bec = bec;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public static boolean Beca(boolean bec) {
		return bec;
	}
	public String toString() {
		return "[Nombre=" + nom + ", Numero de control=" + id + ", sem=" + sem + ", bec=" + bec + ", area=" + area + "]";
	}
	public String toString2() {
		return "[Nombre="+ nom+", Numero de control="+id;
	}
}
