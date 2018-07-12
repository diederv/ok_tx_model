package com.okit.transaction;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class AuthorisationResult {
	
    @SerializedName("amount")
    @Expose
    private int amount;
    
    @SerializedName("reference")
    @Expose
    private String reference;
    
    @SerializedName("result")    
    @Expose
    private String result;
    
    @SerializedName("timestamp")    
    @Expose
    private String timestamp;
    
    @SerializedName("location")
    @Expose
    private Location location;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
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
