package com.io;

import java.util.List;

import com.pojo.Person;

public interface PersonIo {
	
	List<Person> getPersons();
	
	Person findById(int id,List<Person> persons);
	
	boolean removePerson(int id,List<Person> persons);
	
	Person updatePerson(List<Person> persons,int id, String name);
	
	void displayPersons(List<Person> persons);
	
	List<Person> addPerson(List<Person> persons, Person person);
	

}
