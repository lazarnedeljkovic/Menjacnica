package menjacnica;

import java.util.GregorianCalendar;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs{
	
	private Evro evro;

	public void dodajKurs(double prodajniKurs, double kupovniKurs,
			double srednjiKurs, GregorianCalendar datum) {
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
		try {
			evro.setDatum(datum);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void obrisiKurs(GregorianCalendar datum) {
		if (evro.getDatum().equals(datum)) {
			try {
				evro.setProdajniKurs(0);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				evro.setKupovniKurs(0);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				evro.setSrednjiKurs(0);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public String vratiKurs(GregorianCalendar datum) {
		if (evro.getDatum().equals(datum)) {
			return "Prodajni kurs: "+evro.getProdajniKurs()+",  Kupovni kurs: "+
					evro.getKupovniKurs()+",  Srednji kurs: "+evro.getSrednjiKurs();
		}
		
		return null;
	}

	
}
