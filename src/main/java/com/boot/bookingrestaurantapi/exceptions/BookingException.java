package com.boot.bookingrestaurantapi.exceptions;

import java.util.ArrayList;
import java.util.List;

import com.boot.bookingrestaurantapi.dtos.ErrorDto;

public class BookingException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final String code;
	private final int responseCode;
	private final List<ErrorDto> errroList = new ArrayList<>();
	
	public BookingException(String code, int responseCode, String message) {
		super(message);
		this.code = code;
		this.responseCode = responseCode;
	}
	
	
	public BookingException(String code, int responseCode, String message, List<ErrorDto> errroList) {
		super(message);
		this.code = code;
		this.responseCode = responseCode;
		this.errroList.addAll(errroList);
	}


	public String getCode() {
		return code;
	}


	public int getResponseCode() {
		return responseCode;
	}


	public List<ErrorDto> getErrroList() {
		return errroList;
	}
	
	
	
	

}
