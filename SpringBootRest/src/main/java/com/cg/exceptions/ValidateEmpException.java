package com.cg.exceptions;

import java.util.List;

import org.springframework.validation.FieldError;

public class ValidateEmpException extends Exception{
	private List<FieldError> errors ;

	public ValidateEmpException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ValidateEmpException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	public ValidateEmpException(List<FieldError> errors) {
		this.errors=errors;
	}

	public List<FieldError> getErrors() {
		return errors;
	}
	

}
