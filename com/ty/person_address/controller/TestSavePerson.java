package com.ty.person_address.controller;

import com.ty.person_address.dao.PersonDao;
import com.ty.person_address.dto.Person;

public class TestSavePerson {
	public static void main(String[] args) {
		Person person=new Person();
		person.setPid(5);
		person.setName("keshava");
		person.setEmail("keshava@gmail.com");
		person.setPhone("5522334455");
		PersonDao personDao=new PersonDao();
		personDao.savePerson(person);
		if(person!=null) {
			System.out.println("data inserted");
		}
		else {
			System.out.println("data not inserted");
		}
	}

}
