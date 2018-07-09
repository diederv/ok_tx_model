
package com.okit.transaction;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class SingleLineItemTransaction {
	
	@SerializedName("-xmlns:ns2")
    @Expose
    private String xmlnsNs2;

    @SerializedName("-xmlns:ns3")
    @Expose
    private String xmlnsNs3;

    @SerializedName("-xmlns:ns4")
    @Expose
    private String xmlnsNs4;

    @SerializedName("-xmlns:ns5")
    @Expose
    private String xmlnsNs5;

    @SerializedName("account")
    @Expose
    private String account;

    @SerializedName("amount")
    @Expose
    private String amount;

    @SerializedName("attributes")
    @Expose
    private List<Attribute> attributes;

    @SerializedName("billingType")
    @Expose
    private String billingType;

    @SerializedName("currency")
    @Expose
    private String currency;

    @SerializedName("guid")
    @Expose
    private String guid;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("landingPageUrl")
    @Expose
    private String landingPageUrl;

    @SerializedName("lineItems")
    @Expose
    private LineItem lineItems;

    @SerializedName("reference")
    @Expose
    private String reference;

    @SerializedName("service")
    @Expose
    private String service;

    @SerializedName("state")
    @Expose
    private String state;

    @SerializedName("timestamp")
    @Expose
    private String timestamp;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("permissions")
    @Expose
    private String permissions;
    
    public Transaction convert() {
    	Transaction result = new Transaction();
    	result.setXmlnsNs2(xmlnsNs2);
    	result.setXmlnsNs3(xmlnsNs3);
    	result.setXmlnsNs4(xmlnsNs4);
    	result.setXmlnsNs5(xmlnsNs5);
    	result.setAccount(account);
    	result.setAmount(amount);
    	result.setAttributes(attributes);
    	result.setBillingType(billingType);
    	result.setCurrency(currency);
    	result.setGuid(guid);
    	result.setId(id);
    	result.setReference(reference);
    	result.setService(service);
    	result.setState(state);
    	result.setTimestamp(timestamp);
    	result.setType(type);
    	result.setPermissions(permissions);
    	
    	result.setLandingPageUrl(landingPageUrl);
    	List<LineItem> lineItemList = new ArrayList<LineItem>();
    	lineItemList.add(lineItems);
    	result.setLineItems(lineItemList);
    	
    	return result;
    }

    public String getXmlnsNs2() {
        return xmlnsNs2;
    }

    public void setXmlnsNs2(String xmlnsNs2) {
        this.xmlnsNs2 = xmlnsNs2;
    }

    public String getXmlnsNs3() {
        return xmlnsNs3;
    }

    public void setXmlnsNs3(String xmlnsNs3) {
        this.xmlnsNs3 = xmlnsNs3;
    }

    public String getXmlnsNs4() {
        return xmlnsNs4;
    }

    public void setXmlnsNs4(String xmlnsNs4) {
        this.xmlnsNs4 = xmlnsNs4;
    }

    public String getXmlnsNs5() {
        return xmlnsNs5;
    }

    public void setXmlnsNs5(String xmlnsNs5) {
        this.xmlnsNs5 = xmlnsNs5;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public String getBillingType() {
        return billingType;
    }

    public void setBillingType(String billingType) {
        this.billingType = billingType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
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

    public LineItem getLineItems() {
        return lineItems;
    }

    public void setLineItems(LineItem lineItems) {
        this.lineItems = lineItems;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }
}