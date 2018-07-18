package com.okit.client;

public enum UserAttribute {	
	
	NAME	("name", 		"Name", 			"NAME"), 
	ADDRESS	("address", 	"Address", 			"ADDRESS"), 
	PHONE	("phonenumber", "Phone number", 	"PHONENUMBER"), 
	EMAIL	("email", 		"Email address",	"EMAILADDRESS");

	public final String key;
	public final String label;
	public final String type;
	
	private UserAttribute(String key, String label, String type) {
		this.key = key;
		this.label = label;
		this.type = type;
	}	
}