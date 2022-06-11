package com.example.aldama;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidRequest extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String DEFAULT_MESSAGE = "Bad request";
	
	public InvalidRequest(String message) 		{
			super(message);		
		}	
	
	public InvalidRequest() 		{
		super(DEFAULT_MESSAGE);
	}	
	
}
