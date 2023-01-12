package com.assignemt5.dao;

import java.sql.SQLException;
import java.util.List;

import com.assignemt5.model.Guest;

public interface GuestDetails {
	public List<Guest> getAllGuests()  throws SQLException ;
	public void getGuestsByName() throws SQLException;

}
