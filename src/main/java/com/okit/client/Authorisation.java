package com.okit.client;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Authorisation {
	
    @SerializedName("account")
    @Expose
    private String account;

    @SerializedName("action")
    @Expose
    private String guid;
    
    @SerializedName("guid")
    @Expose
    private String action;
    
    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("landingPageUrl")
    @Expose
    private String landingPageUrl;
    
    @SerializedName("redirectUrl")
    @Expose
    private String redirectUrl;
    
    @SerializedName("reference")
    @Expose
    private String reference;
    
    @SerializedName("state")
    @Expose
    private String state;

    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    
    @SerializedName("token")
    @Expose
    private String token;
    
    @SerializedName("permissions")
    @Expose
    private String permissions;
    
    @SerializedName("attributes")
    @Expose
    private List<Attribute> attributes = new ArrayList<Attribute>();
    
    @SerializedName("authorisationResult")
    @Expose
    private AuthorisationResult authorisationResult;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLandingPageUrl() {
		return landingPageUrl;
	}

	public void setLandingPageUrl(String landingPageUrl) {
		this.landingPageUrl = landingPageUrl;
	}

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getPermissions() {
		return permissions;
	}

	public void setPermissions(String permissions) {
		this.permissions = permissions;
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

	public AuthorisationResult getAuthorisationResult() {
		return authorisationResult;
	}

	public void setAuthorisationResult(AuthorisationResult authorisationResult) {
		this.authorisationResult = authorisationResult;
	}
}
