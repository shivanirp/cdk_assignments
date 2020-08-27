package com.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.acl.Permission;
import java.util.ArrayList;
import java.util.List;

import com.exception.PersonNotFoundException;

import com.io.PersonIo;

import com.pojo.Person;

public class PersonIoImpl implements PersonIo {

	@Override
	public List<Person> getPersons() {
		// TODO Auto-generated method stub
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		List<Person> persons = new ArrayList<Person>();
		int id, flag;
		String con, name;
		try {
			do{
				
				System.out.println("Enter id : ");
				id=Integer.parseInt(reader.readLine());
				System.out.println("Enter name");
				name=reader.readLine();
				persons.add(new Person(id,name));
				
				System.out.println("Do you want to add more?(1/0)");
				flag=Integer.parseInt(reader.readLine());

			}while(flag==1);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return persons;
	}

	@Override
	public Person findById(int id, List<Person> persons) {
		// TODO Auto-generated method stub
		
		for(Person p : persons)
		{
			if(p.getpId()==id)
			{
				return p;
			}
		}
			try{
				throw new PersonNotFoundException("Person not Found....");
			}
			catch (PersonNotFoundException e) {
				e.printStackTrace();
			}
		
		return null;
	}

	@Override
	public boolean removePerson(int id, List<Person> persons) {
		// TODO Auto-generated method stub
		for(Person p: persons)
		{
			if(p.getpId()==id)
			{
				
				persons.remove(p);
				return true;
			}
		}
		try{
			throw new PersonNotFoundException("Person not Found....");
		}
		catch (PersonNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Person updatePerson(List<Person> persons, int id, String name) {
		// TODO Auto-generated method stub
		Person p=findById( id,persons);
		if(p!=null)
		{
			p.setpName(name);
			return p;
		}
		return null;
	}

	@Override
	public void displayPersons(List<Person> persons) {
		// TODO Auto-generated method stub
		
		for(Person p: persons)
		{
			System.out.println(p.getpId()+ "\t"+p.getpName());
		}
		
	}

	@Override
	public List<Person> addPerson(List<Person> persons, Person person) {
		// TODO Auto-generated method stub
		
		persons.add(person);
		
		return persons;
	}
	
	

}
