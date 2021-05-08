package com.cg.exception;

public class SpeedInvalidException extends Exception{
	public SpeedInvalidException() {
		super();
	}
	public SpeedInvalidException(String message) {
		super(message);
	}
	
	public String toString() {
		return "SpeedInvalid Exception";
		
	}

}
