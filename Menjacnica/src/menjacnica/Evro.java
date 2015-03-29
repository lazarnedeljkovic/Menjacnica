package menjacnica;

import java.util.GregorianCalendar;

public class Evro {

	private String naziv = "EUR";
	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs;
	private GregorianCalendar datum;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		
		this.naziv = naziv;
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		
		this.prodajniKurs = prodajniKurs;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		
		this.kupovniKurs = kupovniKurs;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		
		this.srednjiKurs = srednjiKurs;
	}
	
	public GregorianCalendar getDatum() {
		return datum;
	}
	
	public void setDatum(GregorianCalendar datum) {
		
		this.datum = datum;
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evro other = (Evro) obj;
		if (Double.doubleToLongBits(kupovniKurs) != Double
				.doubleToLongBits(other.kupovniKurs))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (Double.doubleToLongBits(prodajniKurs) != Double
				.doubleToLongBits(other.prodajniKurs))
			return false;
		if (Double.doubleToLongBits(srednjiKurs) != Double
				.doubleToLongBits(other.srednjiKurs))
			return false;
		return true;
	}
	public String toString() {
		return "Naziv: " + naziv + ",  Prodajni kurs: " + prodajniKurs
				+ ",  Kupovni kurs: " + kupovniKurs + ",  Srednji kurs: "
				+ srednjiKurs + ",  Datum: " + datum;
	}
}
