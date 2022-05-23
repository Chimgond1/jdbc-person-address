package com.ty.person_address.controller;

import java.util.List;

import com.ty.person_address.dao.GetAddressDao;
import com.ty.person_address.dto.Address;

public class TestGetaddress {
	public static void main(String[] args) {
		GetAddressDao getAddressDao=new GetAddressDao();
		List<Address> li=getAddressDao.getAddress(1);
		System.out.println(li);
		
	}

}
