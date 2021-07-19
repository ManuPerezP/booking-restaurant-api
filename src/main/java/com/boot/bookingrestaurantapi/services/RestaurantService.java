package com.boot.bookingrestaurantapi.services;

import java.util.List;

import com.boot.bookingrestaurantapi.exceptions.BookingException;
import com.boot.bookingrestaurantapi.jsons.RestaurantRest;

public interface RestaurantService{

	RestaurantRest getRestaurantById(Long RestaurantId) throws BookingException;
	
	public List<RestaurantRest> getRestaurants() throws BookingException;
}
