package com.ty.person_address.dto;

public class Address {
	private int aid;
	private String street;
	private String door_num;
	private String city;
	private String pin;
	private int pid;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDoor_num() {
		return door_num;
	}

	public void setDoor_num(String door_num) {
		this.door_num = door_num;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", street=" + street + ", door_num=" + door_num + ", city=" + city + ", pin="
				+ pin + ", pid=" + pid + ", getAid()=" + getAid() + ", getStreet()=" + getStreet() + ", getDoor_num()="
				+ getDoor_num() + ", getCity()=" + getCity() + ", getPin()=" + getPin() + ", getPid()=" + getPid()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
