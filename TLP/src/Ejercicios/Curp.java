package Ejercicios;

public class Curp {
	private String ape1;
	private String ape2;
	private String nom;
	private byte dia;
	private byte mes;
	private short año;
	private char genero;
	private String entidad;
	//Constructor vacio
	public Curp() {}
	//Constructor Parametrizado
	public Curp(String ape1, String ape2, String nom, byte dia, byte mes, short año, char genero, String entidad) {
		this.ape1=ape1;
		this.ape2=ape2;
		this.nom=nom;
		this.dia=dia;
		this.mes=mes;
		this.año=año;
		this.genero=genero;
		this.entidad=entidad;
	}
	//Setters y Getters
	public String getApe1() {
		return ape1;
	}
	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}
	public String getApe2() {
		return ape2;
	}
	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public byte getDia() {
		return dia;
	}
	public void setDia(byte dia) {
		this.dia = dia;
	}
	public byte getMes() {
		return mes;
	}
	public void setMes(byte mes) {
		this.mes = mes;
	}
	public short getAño() {
		return año;
	}
	public void setAño(short año) {
		this.año = año;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public String getEntidad() {
		return entidad;
	}
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}
	//Metodo que genera la curp
	public static String generaCurp(String ape1, String ape2, String nom, byte dia, byte mes, short año, char genero, String entidad) {
		ape1=ape1.toUpperCase();
		ape2=ape2.toUpperCase();
		nom=nom.toUpperCase();
		String curp="";
		curp=ape1.substring(0, 2);//HE
		curp+=ape2.substring(0, 1);//HEH
		curp+=nom.substring(0, 1);//HEHK
		curp+=(año%100>0&&año%100<10)?"0"+(año%100):año%100;//HEHK04
		curp+= (mes>0 && mes<10)? "0"+mes:mes;//HEHK0404
		curp+= (dia>0 && dia<10)? "0"+dia:dia;//HEHK040414
		curp+=genero;//HEHK040414H
		switch (entidad) {
		case "AGUASCALIENTES":
			curp+="AS";
			break;
		case "BAJA CALIFORNIA":
			curp+="BC";
			break;
		case "BAJA CALIFORNIA SUR":
			curp+="BS";
			break;
		case "CAMPECHE":
			curp+="CC";
			break;
		case "CHIAPAS":
			curp+="CS";
			break;
		case "CHIHUAHUA":
			curp+="CH";
			break;
		case "COAHUILA":
			curp+="CL";
			break;
		case "COLIMA":
			curp+="CM";
			break;
		case "DISTRITO FEDERAL":
			curp+="DF";
			break;
		case "DURANGO":
			curp+="DG";
			break;
		case "GUANAJUATO":
			curp+="GT";
			break;
		case "GUERRERO":
			curp+="GR";
			break;
		case "HIDALGO":
			curp+="HG";
			break;
		case "JALISCO":
			curp+="JC";
			break;
		case "MEXICO":
			curp+="MC";
			break;
		case "MICHOACAN":
			curp+="MN";
			break;
		case "MORELOS":
			curp+="MS";
			break;
		case "NAYARIT":
			curp+="NT";
			break;
		case "NUEVO LEON":
			curp+="NL";
			break;
		case "OAXACA":
			curp+="OC";
			break;
		case "PUEBLA":
			curp+="PL";
			break;
		case "QUERETARO":
			curp+="QT";
			break;
		case "QUINTANAROO":
			curp+="QR";
			break;
		case "SAN LUIS POTOSI":
			curp+="SP";
			break;
		case "SINALOA":
			curp+="SL";
			break;
		case "SONORA":
			curp+="SR";
			break;
		case "TABASCO":
			curp+="TC";
			break;
		case "TAMAULIPAS":
			curp+="TS";
			break;
		case "TLAXCALA":
			curp+="TL";
			break;
		case "VERACRUZ":
			curp+="VZ";
			break;
		case "YUCATAN":
			curp+="YN";
			break;
		case "ZACATECAS":
			curp+="ZS";
			break;
		}//HEHK040414HVZ
		for (byte i=1;i<6;i++) {
			char let=ape1.charAt(i);
			if (let!='A' && let!='E' && let!='I' && let!='O' && let!='U') {
				curp+=let;
				break;
			}
		}//HEHK040414HVZR
		for (byte i=1;i<6;i++) {
			char let2=ape2.charAt(i);
			if (let2!='A' && let2!='E' && let2!='I' && let2!='O' && let2!='U') {
				curp+=let2;
				break;
			}
		}//HEHK040414HVZRR
		for (byte i=1;i<6;i++) {
			char let3=nom.charAt(i);
			if (let3!='A' && let3!='E' && let3!='I' && let3!='O' && let3!='U') {
				curp+=let3;
				break;
			}
		}//HEHK040414HVZRRV
		String chars="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789";
		byte tamaño=(byte)chars.length();
		curp+=chars.charAt((char)(Math.random()*tamaño));//HEHK040414HVZRRVA
		String nums="0123456789";
		tamaño=(byte)nums.length();
		curp+=nums.charAt((char)(Math.random()*tamaño));//HEHK040414HVZRRVA8
		return curp;
	}
}
