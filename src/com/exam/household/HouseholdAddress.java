package com.exam.household;

public class HouseholdAddress {

	private String addressline;
	private String city;
	private String state;

	public HouseholdAddress() {
		super();
	}

	public HouseholdAddress(String addressline, String city, String state) {
		super();
		this.addressline = addressline;
		this.city = city;
		this.state = state;
	}

	public String getAddressline() {
		return addressline;
	}

	public void setAddressline(String addressline) {
		this.addressline = addressline;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
