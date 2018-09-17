package com.okit.client;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class AuthorisationResult {
	    
    @Expose
    private String amount;
    
    @Expose
    private String reference;
    
    @Expose
    private String result;
    
    @Expose
    private String timestamp;
    
    @Expose
    private Location location;

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	public boolean isSuccessful() {
		return "ok".equalsIgnoreCase(getResult());
	}

}
