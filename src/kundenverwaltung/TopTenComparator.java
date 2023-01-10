package kundenverwaltung;

import java.util.Comparator;

public class TopTenComparator implements Comparator<Person>{
	public int compare(Person a, Person b) {
		if (a.getImportance() < b.getImportance()) return 1; 
		if (a.getImportance() > b.getImportance()) return -1;
		return 0;
	}

}
