package com.assignemt5;

import java.sql.SQLException;
import java.util.List;

import com.assignemt5.dao.GuestDetails;
import com.assignemt5.dao.GuestDetailsImpl;
import com.assignemt5.model.Guest;

public class HotelGuestDetails {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		GuestDetails guestDetails =new GuestDetailsImpl();
		List<Guest> list =guestDetails.getAllGuests();
		guestDetails.getGuestsByName();
	}

}
