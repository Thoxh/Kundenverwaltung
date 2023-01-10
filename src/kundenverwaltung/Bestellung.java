package kundenverwaltung;

import java.time.LocalDateTime;

public class Bestellung {
	private String artikel;
	private double preis;
	private LocalDateTime date;
	private int anzahl;
	private int id;
	
	public Bestellung(String artikel, double preis, LocalDateTime date, int anzahl, int id) {
		this.artikel = artikel;
		this.preis = preis;
		this.date = date;
		this.anzahl = anzahl;
		this.id = id;
	}

	public String getArtikel() {
		return artikel;
	}
	
	public double getPreis() {
		return preis;
	}
	
	public LocalDateTime getDate() {
		return date;
	}
	
	public int getAnzahl() {
		return anzahl;
	}
	
	public int getId() {
		return id;
	}
	
	public double getSumme() {
		double summe = preis*anzahl;
		return summe;
	}
	
	public void viewBestellung() {
		System.out.println("Artikel: " + getArtikel());
		System.out.println("Preis pro Stück: " + getPreis());
		System.out.println("Datum: " + getDate());
		System.out.println("Anzahl: " + getAnzahl());
		System.out.println("Gesamtsumme: " + getSumme());
		System.out.println("-------------");
	}
}
