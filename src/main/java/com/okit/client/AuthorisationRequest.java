package com.okit.client;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AuthorisationRequest {
	
	public final static String SIGNUP_ACTION = "Signup"; 

    @Expose
    private String action = null;

	@Expose
	private String reference = null;
	
    @Expose
    private String redirectUrl = null;
    
    @Expose
    private String token = null;
    
    @Expose
    private List<Attribute> attributes = new ArrayList<Attribute>();
    
    private AuthorisationRequest() { 
    	setAction(SIGNUP_ACTION);
    }

    public AuthorisationRequest(String reference, UserAttribute... attributes) {
    	this();
        this.reference = reference;        
        for (UserAttribute attribute : attributes) {
        	this.attributes.add(new Attribute(attribute));
        }
    }

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public List<Attribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
