package menjacnica.interfejs;

import java.util.GregorianCalendar;

public interface MenjacnicaInterfejs {

	public void dodajKurs(double prodajniKurs, double kupovniKurs, 
			double srednjiKurs, GregorianCalendar datum);
	public void obrisiKurs(GregorianCalendar datum);
	public String vratiKurs(GregorianCalendar datum);
}
