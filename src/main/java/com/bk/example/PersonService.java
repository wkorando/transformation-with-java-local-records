package com.bk.example;

public class PersonService {

	private PersonRepo repo = new PersonRepo();

public void printPersons() {
	record PersonView(String firstName, String lastName) {
		@Override
		public String toString(){
			return firstName + " " + lastName;
		}
	}
	repo.getAllPersons().stream().map(p -> new PersonView(p.firstName(), p.lastName())).forEach(pv -> System.out.println(pv.toString()));
}
}


