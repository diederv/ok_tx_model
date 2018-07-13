package com.okit.client;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class TransactionRequest  {
	
    @SerializedName("amount")
    @Expose
    private String amount = "0";
    
    @SerializedName("reference")
    @Expose
    private String reference = null;
    
    @SerializedName("redirectUrl")
    @Expose
    private String redirectUrl = null;
    
    @SerializedName("lineItems")
    @Expose
	private List<LineItem> lineItems = new ArrayList<LineItem>();
    
    @SerializedName("attributes")
    @Expose
    private List<Attribute> attributes = new ArrayList<Attribute>();

    public TransactionRequest() { }

    public TransactionRequest(String reference, UserAttribute... attributes) {        
        this.reference = reference;
        for (UserAttribute attribute : attributes) {
        	this.attributes.add(new Attribute(attribute));
        }
    }
    
    public void setRedirectUrl(String url) {
    	redirectUrl = url;
    }
    
    public void addLineItem(LineItem item) {
    	lineItems.add(item);
    }

    public void addLineItem(int quantity, String description, int amount, String productCode, String currency, String vat) {
        LineItem item = new LineItem();
        item.setQuantity(Integer.toString(quantity));
        item.setDescription(description);
        item.setAmount(Integer.toString(amount));
        int totalAmount = quantity * amount;
        item.setTotalAmount(Integer.toString(totalAmount));
        this.amount = Integer.toString(Integer.parseInt(this.amount) + totalAmount);
        item.setProductCode(productCode);
        if (currency != null) {
        	item.setCurrency(currency);
        }
        if (vat != null) {
        	item.setVat(vat);
        }
        lineItems.add(item);    	
    }
    
    public void addLineItem(int quantity, String description, int amount, String productCode) {
    	addLineItem(quantity, description, amount, productCode, null, null);
    }

    @SerializedName("amount")    
	public String getAmount() {
		return amount;
	}

    @SerializedName("reference")    
	public String getReference() {
		return reference;
	}

    @SerializedName("lineItems")    
	public List<LineItem> getLineItems() {
		return lineItems;
	}

    @SerializedName("attributes")    
	public List<Attribute> getAttributes() {
		return attributes;
	}
    
    @SerializedName("redirectUrl")    
	public String getRedirectUrl() {
		return redirectUrl;
	}
    
    public void setAmount(String amount) {
		this.amount = amount;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public void setLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
	}

	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

}
