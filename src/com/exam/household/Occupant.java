package com.exam.household;

public class Occupant {

	private String firstName;
	private String lastName;
	private HouseholdAddress householdAddress;
	private int age;

	public Occupant() {
		super();
	}

	public Occupant(String firstName, String lastName, HouseholdAddress householdAddress, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.householdAddress = householdAddress;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public HouseholdAddress getHouseholdAddress() {
		return householdAddress;
	}

	public void setHouseholdAddress(HouseholdAddress householdAddress) {
		this.householdAddress = householdAddress;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
