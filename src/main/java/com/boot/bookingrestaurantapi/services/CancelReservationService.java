package com.boot.bookingrestaurantapi.services;

import com.boot.bookingrestaurantapi.exceptions.BookingException;

public interface CancelReservationService {

	public String deleteResertation(String locator) throws BookingException;
}
