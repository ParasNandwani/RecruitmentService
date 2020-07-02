package com.recruitment.springmvc.utils;

public enum ApplicationStatus {
	APPLIED(1), INVITED(2), REJECTED(3), HIRED(4);
	 private final int value;

	 ApplicationStatus(final int newValue) {
        value = newValue;
    }

    public int getValue() { return value; }
}
