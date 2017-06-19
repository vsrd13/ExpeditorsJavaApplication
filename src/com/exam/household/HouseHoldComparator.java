package com.exam.household;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HouseHoldComparator {

	public Map<String, List<Occupant>> groupData(List<Occupant> data) {

		HashMap<String, List<Occupant>> hashMap = new HashMap<String, List<Occupant>>();
		for (Occupant occupant : data) {
			String householdGroupId = occupant.getHouseholdAddress().getAddressline() + " "
					+ occupant.getHouseholdAddress().getCity() + " " + occupant.getHouseholdAddress().getState();
			householdGroupId = householdGroupId.toUpperCase();
			if (!hashMap.containsKey(householdGroupId)) {
				List<Occupant> list = new ArrayList<Occupant>();
				list.add(occupant);
				hashMap.put(householdGroupId, list);
			} else {
				hashMap.get(householdGroupId).add(occupant);
			}
		}
		return hashMap;
	}

	public Map<String, List<Occupant>> sortData(Map<String, List<Occupant>> data) {

		for (Map.Entry<String, List<Occupant>> entry : data.entrySet()) {
			List<Occupant> value = entry.getValue();
			Collections.sort(value, new Sorter());

		}
		return data;
	}

	public void printData(Map<String, List<Occupant>> data) {

		for (Map.Entry<String, List<Occupant>> entry : data.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue().size());

			List<Occupant> values = entry.getValue();
			if (values.size() > 0)
				System.out.println("First Name    Last Name   	Address\t\t\t\t\t\tAge\n");

			for (Occupant occupant : values) {

				if (occupant.getAge() >= 19) {
					System.out.println(occupant.getFirstName() + "		" + occupant.getLastName() + "	 	"
							+ occupant.getHouseholdAddress().getAddressline() + " "
							+ occupant.getHouseholdAddress().getCity() + " 		"
							+ occupant.getHouseholdAddress().getState() + " 		" + occupant.getAge());
				}
			}
			System.out.println("\n\n");
		}
	}

	public class Sorter implements Comparator<Occupant> {
		public int compare(Occupant occupant1, Occupant occupant2) {

			int firstNameResult = occupant1.getFirstName().compareTo(occupant2.getFirstName());
			if (firstNameResult != 0) {
				return firstNameResult;
			}

			return occupant1.getLastName().compareTo(occupant2.getLastName());
		}
	}
}
