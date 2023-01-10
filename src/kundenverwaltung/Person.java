package kundenverwaltung;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Person {
	private String name;
	private String adresse;
	private ArrayList<Bestellung> bestellungen;
	private Boolean lieferePostanschrift;
	private double importance;
	
	public Person(String name, String adresse, ArrayList<Bestellung> bestellungen, Boolean lieferePostanschrift) {
		this.name = name;
		this.adresse = adresse;
		this.bestellungen = bestellungen;
		this.lieferePostanschrift = lieferePostanschrift;
		this.importance = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public ArrayList<Bestellung> getBestellungen() {
		return bestellungen;
	}
	
	public void viewBestellungen() {
		if (!bestellungen.isEmpty()) {
			for (Bestellung b : bestellungen) {
				System.out.println("Artikel: " + b.getArtikel());
				System.out.println("Preis pro Stück: " + b.getPreis());
				System.out.println("Datum: " + b.getDate());
				System.out.println("Anzahl: " + b.getAnzahl());
				System.out.println("Gesamtsumme: " + b.getSumme());
				System.out.println("-------------");
			}
		} else {
			System.out.println("Es sind keine Bestellungen vorhanden.");
		}

	}
	
	
	public int anzahlBestellungen() {
		return bestellungen.size();
	}
	
	public Boolean lieferePostanschrift() {
		return lieferePostanschrift;
	}
	
	public double getImportance() {
		return importance;
	}
	
	public void setImportance(double i) {
		importance = i;
	}
	
	public void ergaenzeBestellung(String artikel, double preis, LocalDateTime date, int anzahl, int id) {
		Bestellung b = new Bestellung(artikel, preis, date, anzahl, id);
		bestellungen.add(b);
	}
	
	/**
	 * Liegt eine nat�rliche Person vor, so wird diese Funktion �berschrieben und eine Retoure ist trotzdem m�glich.
	 */
	public void retoure(int i) {
		System.out.println("Es sind keine Retouren f�r Juristische Personen m�glich.");
	}
	
	public double bisherigesBestellvolumen() {
		double volumen = 0;
		for (Bestellung b : bestellungen) {
			volumen = volumen + b.getSumme();
		}
		return volumen;
	}
	
	/**
	 * Liegt eine nat�rliche Person vor, so wird diese Funktion �berschrieben. Entsprechend gelten andere Regeln.
	 * Bei Juristischen Personen ist die Anzahl der bestellten Artikel wichtiger, als die Anzahl aller Bestellungen.
	 */
	public Boolean istPremiumkunde() {
		double anzahl = 0;
		for (Bestellung b : bestellungen) {
			anzahl = anzahl + b.getAnzahl();
		}
		double qualifyPremiumInzidenz = anzahl * 2 + bestellungen.size();
		if (qualifyPremiumInzidenz >= 10) {
			return true;
		} else {
			return false;
		}
		
	}
	
}
