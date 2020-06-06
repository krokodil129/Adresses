package data;

public class clAddress {
	String vorname;
	String nachname;
	String ort;
	int plz;
	String strasse;

	public String getVorname() {
		return vorname;
	}
	public void setVorname(String newVorname) {
		this.vorname=newVorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String newNachname) {
		this.nachname=newNachname;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String newOrt) {
		this.ort=newOrt;
	}
	public int getPlz() {
		return plz;
	}
	public void setPlz(int newPlz) {
		this.plz=newPlz;
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String newStrasse) {
		this.strasse=newStrasse;
	}

}
