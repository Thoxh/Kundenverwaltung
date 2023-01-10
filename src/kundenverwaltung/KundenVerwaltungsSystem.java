package kundenverwaltung;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class KundenVerwaltungsSystem {

	private Eingabeleser leser;
	private HashMap<String, String> antwortMap;
	private ArrayList<Person> personen;

	public KundenVerwaltungsSystem() {
		leser = new Eingabeleser();
		antwortMap = new HashMap<String, String>();
		personen = new ArrayList<Person>();
	}

	public void starten() {
		antwortMap.put("auflisten", "1");
		antwortMap.put("zeige", "2");
		antwortMap.put("top10", "3");
		boolean fertig = false;
		while (!fertig) {
			HashSet<String> eingabe = leser.gibEingabe();

			if (eingabe.contains("exit")) {
				fertig = true;
			} else {
				for (String input : eingabe) {
					String operation = antwortMap.get(input);
					if (operation != null) {
						Person p = new Person("Nicht gefunden", "Nicht gefunden",
								BeispielBestellungen.erzeugeBestellung1(), false);
						// Ich habe leider keine Idee mehr, wie ich durch die zusätzlichen Argumente das
						// dazugehörige PersonenObjekt finde.
						if (eingabe.size() >= 2) {
							Map<String, Person> map = new HashMap<>();
							personen.forEach(
									(n) -> {
										map.put(n.getName(), n);
									});
							for (String otherInputs : eingabe) {
								Person person = map.get(otherInputs);
								if (person != null) {
									p = person;
								}
							}

						}
						operationProvider(operation, p);
					}

				}
			}
		}
	}

	private void operationProvider(String operation, Person p) {
		switch (operation) {
			case "1":
				auflisten();
				break;
			case "2":
				System.out.println(p.getName());
				System.out.println(p.getAdresse());
				System.out.println(p.bisherigesBestellvolumen());
				System.out.println(p.anzahlBestellungen());
				System.out.println(p.istPremiumkunde());
				System.out.println(p.lieferePostanschrift());
				break;
			case "3":
				viewTopTenlist(this.personen);
				break;
			default:
				System.out.println("Ein Fehler ist aufgetreten.");

		}
	}

	public void auflisten() {
		System.out.println("Folgende Kunden sind vorhanden:");
		for (Person p : this.personen) {
			System.out.println(p.getName());
		}
	}

	public void zeige(Person p) {
		System.out.println(p.getName());
		System.out.println(p.getAdresse());
		System.out.println(p.getImportance());
		System.out.println(p.anzahlBestellungen());
		System.out.println(p.bisherigesBestellvolumen());
		System.out.println(p.istPremiumkunde());
		System.out.println(p.lieferePostanschrift());
	}

	/**
	 * Generiert die Wichtigkeit für jede Person anhand vom Bestellvolumen,
	 * istPremium und jur. Person.
	 */
	public List<Person> getTopTenlist(ArrayList<Person> kunden) {
		for (Person p : kunden) {
			double volume = p.bisherigesBestellvolumen();
			boolean isPremium = p.istPremiumkunde();
			boolean isJurPerson = p instanceof JuristischePerson;

			double importance = volume;
			if (isPremium && isJurPerson) {
				importance += 1500;
			} else if (isPremium) {
				importance += 1000;
			} else if (isJurPerson) {
				importance += 500;
			}
			p.setImportance(importance);
		}

		Set<Person> sortedSet = new TreeSet<Person>(new TopTenComparator());
		sortedSet.addAll(kunden);
		List<Person> topTenList = sortedSet.stream().limit(10).collect(Collectors.toList());

		return topTenList;
	}

	public void viewTopTenlist(ArrayList<Person> kunden) {
		List<Person> topTen = getTopTenlist(kunden);
		System.out.println("----Top10----");
		for (Person p : topTen) {
			System.out.println("Name: " + p.getName());
			System.out.println("Wichtigkeit: " + p.getImportance());
			System.out.println("-------------");
		}
	}

	public void erzeugePersonen() {
		ArrayList<Person> personen = new ArrayList<Person>();
		personen.add(new NatuerlichePerson("Max Zboralski", "Am alten Gutshof 5, 14772 Brandenburg",
				BeispielBestellungen.erzeugeBestellung1(), false, "Frau", "weiblich"));
		personen.add(new JuristischePerson("Test GmbH", "Irgendwo im Nirgendwo 23, 12332 Nirgendwo",
				BeispielBestellungen.erzeugeBestellung2(), true, false, "Privat"));
		personen.add(new NatuerlichePerson("Tim Siebert", "Kolonie 9, 14798 Havelsee",
				BeispielBestellungen.erzeugeBestellung3(), true, "Herr", "m�nnlich"));
		personen.add(new JuristischePerson("Toxic Industry", "Irgendwo im Nirgendwo 23, 12332 Nirgendwo",
				BeispielBestellungen.erzeugeBestellung4(), false, true, "�ffentlich"));
		personen.add(new NatuerlichePerson("Rick Pfennigschmidt", "Irgendwo im Nirgendwo 23, 12332 Nirgendwo",
				BeispielBestellungen.erzeugeBestellung5(), true, "Herr", "m�nnlich"));
		personen.add(new JuristischePerson("PineApple", "Irgendwo im Nirgendwo 23, 12332 Nirgendwo",
				BeispielBestellungen.erzeugeBestellung6(), false, true, "Privat"));
		personen.add(new NatuerlichePerson("Mama Lauda", "Irgendwo im Nirgendwo 23, 12332 Nirgendwo",
				BeispielBestellungen.erzeugeBestellung7(), false, "Frau", "weiblich"));
		personen.add(new JuristischePerson("Amazonas", "Irgendwo im Nirgendwo 23, 12332 Nirgendwo",
				BeispielBestellungen.erzeugeBestellung8(), true, true, "Privat"));
		personen.add(new NatuerlichePerson("Elon Musk", "Irgendwo im Nirgendwo 23, 12332 Nirgendwo",
				BeispielBestellungen.erzeugeBestellung9(), false, "Herr", "m�nnlich"));
		personen.add(new JuristischePerson("Landesparlament XY", "Irgendwo im Nirgendwo 23, 12332 Nirgendwo",
				BeispielBestellungen.erzeugeBestellung10(), true, true, "�ffentlich"));
		personen.add(new NatuerlichePerson("Morty Smith", "Irgendwo im Nirgendwo 23, 12332 Nirgendwo",
				BeispielBestellungen.erzeugeBestellung11(), true, "Herr", "m�nnlich"));
		personen.add(new JuristischePerson("Dooodle", "Irgendwo im Nirgendwo 23, 12332 Nirgendwo",
				BeispielBestellungen.erzeugeBestellung12(), false, false, "Privat"));
		this.personen = personen;
	}

	public static void main(String[] args) {
		KundenVerwaltungsSystem system = new KundenVerwaltungsSystem();
		system.erzeugePersonen();
		System.out.println(system.personen.get(0).anzahlBestellungen());
		system.personen.get(0).anzahlBestellungen();
		system.personen.get(1).retoure(123422);
		system.personen.get(10).viewBestellungen();
		system.personen.get(10).ergaenzeBestellung("Test", 12.45, LocalDateTime.now(), 1, 234);
		system.personen.get(10).viewBestellungen();
		system.personen.get(10).retoure(234);
		System.out.println(system.personen.get(1).istPremiumkunde());
		system.viewTopTenlist(system.personen);
		System.out.println("--------------------------------------");

	}
}
