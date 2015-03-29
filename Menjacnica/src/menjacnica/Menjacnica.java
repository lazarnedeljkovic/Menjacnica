package menjacnica;

import java.util.GregorianCalendar;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs{

	private Evro evro;
	
	public void dodajKurs(double prodajniKurs, double kupovniKurs,
			double srednjiKurs, GregorianCalendar datum) {
		if (datum!=null) {
			try {
				evro.setDatum(datum);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				evro.setProdajniKurs(prodajniKurs);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				evro.setKupovniKurs(kupovniKurs);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				evro.setSrednjiKurs(srednjiKurs);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void obrisiKurs(GregorianCalendar datum) {
		
	}

	public String vratiKurs(GregorianCalendar datum) {
		
		return null;
	}
}
