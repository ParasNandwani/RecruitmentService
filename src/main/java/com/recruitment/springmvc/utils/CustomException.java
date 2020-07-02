package com.recruitment.springmvc.utils;

public class CustomException extends RuntimeException{

	private static final long serialVersionUID = -6173672585239147421L;
	private String message;
	private String error;
	CustomException(){}
	
	public CustomException(String message, String error) {
		this.message = message;
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	@Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
	
	
}
