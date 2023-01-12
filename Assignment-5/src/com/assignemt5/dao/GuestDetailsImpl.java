package com.assignemt5.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.assignemt5.model.Guest;
import com.assignment5.dbconnection.DatabaseConnection;

public class GuestDetailsImpl implements GuestDetails {
	DatabaseConnection connection =new DatabaseConnection();
	Connection myConn = null;
	PreparedStatement myStmt = null;
	ResultSet myRs = null;
	
	@Override
	public List<Guest> getAllGuests() throws SQLException {
		List<Guest> guests =new ArrayList<>();
		myConn =connection.getConnection();
		String selectQuery = "SELECT * FROM GUESTS";
		myStmt = myConn.prepareStatement(selectQuery);
		myRs = myStmt.executeQuery();

		// 4. Process the result set
		while (myRs.next()) {
			Guest guest =new Guest();
			guest.setId(myRs.getInt("ID"));
			guest.setName(myRs.getString("NAME"));
			guest.setTown(myRs.getString("TOWN"));
			guests.add(guest);
		}
		return guests;
	}

	@Override
	public void getGuestsByName() throws SQLException {
//		Guest guest2 =new Guest();
//		guest2.setId(101);
//		guest2.setName("SIVA");
//		guest2.setTown("Hyderabad");
//		Guest guest1 =new Guest();
//		guest1.setId(102);
//		guest1.setName("SANKAR");
//		guest1.setTown("Hyderabad111");
		List<Guest> guestList = this.getAllGuests();
//		List<Guest> guestList = new ArrayList<>();
//		guestList.add(guest1);
//		guestList.add(guest2);
		guestList.stream().map(guest -> guest.getName()).forEach(System.out::println);
		
	}

}
