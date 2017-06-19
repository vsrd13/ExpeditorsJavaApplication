package com.exam.household;

import java.util.List;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReadHouseholdData readHouseholdData = new ReadHouseholdData();
		List<Occupant> data = readHouseholdData.readData("data.txt");

		HouseHoldComparator houseHoldComparator = new HouseHoldComparator();
		Map<String, List<Occupant>> groupeddata = houseHoldComparator.groupData(data);
		Map<String, List<Occupant>> sorteddata = houseHoldComparator.sortData(groupeddata);

		houseHoldComparator.printData(sorteddata);
	}

}
