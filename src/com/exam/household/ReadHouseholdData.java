package com.exam.household;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadHouseholdData {

	public String stripQuotes(String input) {
		return input.replaceAll("\"", "").trim();
	}

	public List<Occupant> readData(String filepath) {

		List<Occupant> list = new ArrayList<>();
		BufferedReader br = null;
		String line = "";
		String delimiter = "\",\"";
		try {
			br = new BufferedReader(new FileReader(filepath));
			while ((line = br.readLine()) != null) {

				if(line.trim().equals(""))
					continue;
				String[] occupartArray = line.split(delimiter);
				String firstName = stripQuotes(occupartArray[0]);
				String lastName = stripQuotes(occupartArray[1]);
				String addressline = stripQuotes(occupartArray[2]);
				String city = stripQuotes(occupartArray[3]);
				String state = stripQuotes(occupartArray[4]);
				int age = Integer.parseInt(stripQuotes(occupartArray[5]));

				HouseholdAddress householdAddress = new HouseholdAddress(addressline, city, state);
				Occupant occupant = new Occupant(firstName, lastName, householdAddress, age);
				list.add(occupant);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}

}
