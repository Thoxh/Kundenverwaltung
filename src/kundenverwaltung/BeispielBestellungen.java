package kundenverwaltung;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class BeispielBestellungen {
	public static ArrayList<Bestellung> erzeugeBestellung1() {
		ArrayList<Bestellung> bestellungen = new ArrayList<Bestellung>();
		bestellungen.add(new Bestellung("iPhone XS max", 678.29, LocalDateTime.of(2022, 05, 10, 14, 14), 2, 1234));
		bestellungen.add(new Bestellung("iPhone X", 534.23, LocalDateTime.of(2022, 05, 10, 14, 14), 4, 12333));
		bestellungen.add(new Bestellung("iPhone 13", 778.29, LocalDateTime.of(2022, 05, 10, 14, 14), 2, 12536));
		bestellungen.add(new Bestellung("iPhone 12 max", 578.56, LocalDateTime.of(2022, 05, 10, 14, 14), 10, 167865));
		bestellungen.add(new Bestellung("iPhone 12 mini", 512.23, LocalDateTime.of(2022, 05, 10, 14, 14), 12, 1456456));
		bestellungen.add(new Bestellung("iPhone XR max", 400.99, LocalDateTime.of(2022, 05, 10, 14, 14), 23, 178945));
		bestellungen.add(new Bestellung("iPhone XR", 350.21, LocalDateTime.of(2022, 05, 10, 14, 14), 2, 157644));
		bestellungen.add(new Bestellung("iPhone 6", 200.10, LocalDateTime.of(2022, 05, 10, 14, 14), 5, 15677));
		bestellungen.add(new Bestellung("iPhone 13 Pro", 1202.29, LocalDateTime.of(2022, 05, 10, 14, 14), 2, 1345787));
		bestellungen.add(new Bestellung("iPhone 11 Pro", 923.29, LocalDateTime.of(2022, 05, 10, 14, 14), 3, 1345236));
		return bestellungen;
	}
	
	public static ArrayList<Bestellung> erzeugeBestellung2() {
		ArrayList<Bestellung> bestellungen = new ArrayList<Bestellung>();
		bestellungen.add(new Bestellung("iPhone XS max", 678.29, LocalDateTime.of(2022, 05, 10, 14, 14), 10, 1234));
		bestellungen.add(new Bestellung("iPhone 12 max", 578.56, LocalDateTime.of(2022, 05, 10, 14, 14), 10, 167865));
		bestellungen.add(new Bestellung("iPhone 12 mini", 512.23, LocalDateTime.of(2022, 05, 10, 14, 14), 12, 1456456));
		bestellungen.add(new Bestellung("iPhone XR max", 400.99, LocalDateTime.of(2022, 05, 10, 14, 14), 23, 178945));
		bestellungen.add(new Bestellung("iPhone XR", 350.21, LocalDateTime.of(2022, 05, 10, 14, 14), 2, 157644));
		bestellungen.add(new Bestellung("iPhone 6", 200.10, LocalDateTime.of(2022, 05, 10, 14, 14), 5, 15677));
		bestellungen.add(new Bestellung("iPhone 13 Pro", 1202.29, LocalDateTime.of(2022, 05, 10, 14, 14), 2, 1345787));
		bestellungen.add(new Bestellung("iPhone 11 Pro", 923.29, LocalDateTime.of(2022, 05, 10, 14, 14), 3, 1345236));
		return bestellungen;
	}
	
	public static ArrayList<Bestellung> erzeugeBestellung3() {
		ArrayList<Bestellung> bestellungen = new ArrayList<Bestellung>();
		bestellungen.add(new Bestellung("iPhone XS max", 678.29, LocalDateTime.of(2022, 05, 10, 14, 14), 2, 1234));
		bestellungen.add(new Bestellung("iPhone 12 max", 578.56, LocalDateTime.of(2022, 05, 10, 14, 14), 10, 167865));
		return bestellungen;
	}
	
	public static ArrayList<Bestellung> erzeugeBestellung4() {
		ArrayList<Bestellung> bestellungen = new ArrayList<Bestellung>();
		bestellungen.add(new Bestellung("iPhone 12 max", 578.56, LocalDateTime.of(2022, 05, 10, 14, 14), 3, 167865));
		return bestellungen;
	}
	
	public static ArrayList<Bestellung> erzeugeBestellung5() {
		ArrayList<Bestellung> bestellungen = new ArrayList<Bestellung>();
		bestellungen.add(new Bestellung("iPhone 12 max", 578.56, LocalDateTime.of(2022, 05, 10, 14, 14), 7, 167865));
		return bestellungen;
	}
	
	public static ArrayList<Bestellung> erzeugeBestellung6() {
		ArrayList<Bestellung> bestellungen = new ArrayList<Bestellung>();
		bestellungen.add(new Bestellung("iPhone 12 max", 578.56, LocalDateTime.of(2022, 05, 10, 14, 14), 12, 167865));
		return bestellungen;
	}
	
	public static ArrayList<Bestellung> erzeugeBestellung7() {
		ArrayList<Bestellung> bestellungen = new ArrayList<Bestellung>();
		bestellungen.add(new Bestellung("iPhone XS max", 678.29, LocalDateTime.of(2022, 05, 10, 14, 14), 2, 1234));
		bestellungen.add(new Bestellung("iPhone X", 534.23, LocalDateTime.of(2022, 05, 10, 14, 14), 4, 12333));
		bestellungen.add(new Bestellung("iPhone 11 Pro", 923.29, LocalDateTime.of(2022, 05, 10, 14, 14), 3, 1345236));
		return bestellungen;
	}
	
	public static ArrayList<Bestellung> erzeugeBestellung8() {
		ArrayList<Bestellung> bestellungen = new ArrayList<Bestellung>();
		bestellungen.add(new Bestellung("iPhone 6", 200.10, LocalDateTime.of(2022, 05, 10, 14, 14), 2, 15677755));
		return bestellungen;
	}
	
	public static ArrayList<Bestellung> erzeugeBestellung9() {
		ArrayList<Bestellung> bestellungen = new ArrayList<Bestellung>();
		bestellungen.add(new Bestellung("iPhone XS max", 678.29, LocalDateTime.of(2022, 05, 10, 14, 14), 2, 1576576));
		bestellungen.add(new Bestellung("iPhone 6", 200.10, LocalDateTime.of(2022, 05, 10, 14, 14), 2, 15677755));
		bestellungen.add(new Bestellung("iPhone 13 Pro", 1202.29, LocalDateTime.of(2022, 05, 10, 14, 14), 1, 168786));
		bestellungen.add(new Bestellung("iPhone 11 Pro", 923.29, LocalDateTime.of(2022, 05, 10, 14, 14), 1, 156767));
		return bestellungen;
	}
	
	public static ArrayList<Bestellung> erzeugeBestellung10() {
		ArrayList<Bestellung> bestellungen = new ArrayList<Bestellung>();
		bestellungen.add(new Bestellung("iPhone XS max", 678.29, LocalDateTime.of(2022, 05, 10, 14, 14), 2, 12));
		return bestellungen;
	}
	
	public static ArrayList<Bestellung> erzeugeBestellung11() {
		ArrayList<Bestellung> bestellungen = new ArrayList<Bestellung>();
		bestellungen.add(new Bestellung("iPhone XS max", 678.29, LocalDateTime.of(2022, 05, 10, 14, 14), 1, 12));
		return bestellungen;
	}
	
	public static ArrayList<Bestellung> erzeugeBestellung12() {
		ArrayList<Bestellung> bestellungen = new ArrayList<Bestellung>();
		bestellungen.add(new Bestellung("iPhone XS max", 678.29, LocalDateTime.of(2022, 05, 10, 14, 14), 33, 12));
		return bestellungen;
	}
}
