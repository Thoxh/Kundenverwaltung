package kundenverwaltung;

import java.util.ArrayList;

public class JuristischePerson extends Person {
	private Boolean istKapitalgesellschaft;
	private String rechtsform;
	
	public JuristischePerson(String name, String adresse, ArrayList<Bestellung> bestellungen, Boolean lieferePostanschrift, Boolean istKapitalgesellschaft, String rechtsform) {
		super(name, adresse, bestellungen, lieferePostanschrift);
		this.istKapitalgesellschaft = istKapitalgesellschaft;
		this.rechtsform = rechtsform;
		
	}
	
	public Boolean getKapitalgesellschaft() {
		return istKapitalgesellschaft;
	}
	
	public String getRechtsform() {
		return rechtsform;
	}
	
}
