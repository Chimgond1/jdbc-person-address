package com.ty.person_address.controller;

import java.util.Scanner;

import com.ty.person_address.dao.AddressDao;
import com.ty.person_address.dto.Address;

public class TestSaveAddress {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter ur choice");
		int id=scanner.nextInt();
		Address address=new Address();
		address.setAid(3);
		address.setStreet("jalahalli cross");
		address.setDoor_num("96b");
		address.setCity("bangalore");
		address.setPin("580022");
		//address.setPid(id);
		AddressDao addressDao=new AddressDao();
		int result=addressDao.saveAddress(id,address);
		if(result>0) {
			System.out.println("data inserted");
		}
		else {
			System.out.println("data is not inserted");
		}
		}

}
