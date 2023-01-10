package kundenverwaltung;

import java.util.ArrayList;
import java.util.Iterator;

public class NatuerlichePerson extends Person {
	private String anrede;
	private String geschlecht;
	
	public NatuerlichePerson(String name, String adresse, ArrayList<Bestellung> bestellungen, Boolean lieferePostanschrift, String anrede, String geschlecht) {
		super(name, adresse, bestellungen, lieferePostanschrift);
		this.anrede = anrede;
		this.geschlecht = geschlecht;
		
	}
	
	public String getAnrede() {
		return anrede;
	}
	
	public String getGeschlecht() {
		return geschlecht;
	}
	
	/**
	 * Überschreibung der Methode aus dem Parent
	 * Bestellungsliste wird nach der Bestellung mit der passenden ID durchsucht.
	 */
	public void retoure(int id) {
		Iterator<Bestellung> iter = super.getBestellungen().iterator();
		while (iter.hasNext()) {
			Bestellung b = iter.next();
			if (b.getId() == id) {
				System.out.println("Folgende Bestellung wird retourniert:");
				b.viewBestellung();
				iter.remove();
				return;
			}
		}
		System.out.println("Die Bestellung mit der ID: " + id + " wurde nicht gefunden.");
	}
	
	/**
	 * Überschreibung der Methode aus dem Parent
	 * Bei Natürlichen Personen ist die Anzahl aller Bestellungen wichtiger, als die Anzahl aller bestellten Artikel.
	 */
	public Boolean istPremiumkunde() {
		double anzahl = 0;
		for (Bestellung b : super.getBestellungen()) {
			anzahl = anzahl + b.getAnzahl();
		}
		double qualifyPremiumInzidenz = anzahl + super.getBestellungen().size()*2;
		if (qualifyPremiumInzidenz >= 10) {
			return true;
		} else {
			return false;
		}
		
	}
}
