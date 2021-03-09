package com.bk.example;

import java.util.ArrayList;
import java.util.List;

public class PersonRepo {

	private List<Person> persons = new ArrayList<>(
			List.of(new Person(1, "Tony", "Stark"), new Person(2, "Bruce", "Banner"), new Person(3, "Sam", "Wilson"),
					new Person(4, "Monica", "Rambeau"), new Person(5, "Wanda", "Maximoff")));

	public List<Person> getAllPersons() {
		return persons;
	}
}
