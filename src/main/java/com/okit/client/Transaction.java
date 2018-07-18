
package com.okit.client;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Transaction extends Authorisation {

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

    @SerializedName("amount")
    @Expose
    private String amount;

    @SerializedName("billingType")
    @Expose
    private String billingType;

    @SerializedName("currency")
    @Expose
    private String currency;

    @SerializedName("lineItems")
    @Expose
    private List<LineItem> lineItems;

    @SerializedName("service")
    @Expose
    private String service;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("barcode")
    @Expose
    private String barcode;
    
    @SerializedName("description")
    @Expose
    private String description;
    
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

    public void setAmount(String amount) {
        this.amount = amount;
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

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
