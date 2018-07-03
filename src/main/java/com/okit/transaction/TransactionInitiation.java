package com.okit.transaction;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class TransactionInitiation  {
	
    @SerializedName("amount")
    @Expose
    public String amount = "0";

    @SerializedName("reference")
    @Expose
    public String reference;
    
    @SerializedName("lineItems")
    @Expose
    List<LineItems> lineItems = new ArrayList<LineItems>();

    @SerializedName("attributes")
    @Expose
    List<Attributes> attributes = new ArrayList<Attributes>();

    @SerializedName("redirectUrl")
    @Expose
    String redirectUrl = "https://i.ytimg.com/vi/MM9-fJgoL4A/maxresdefault.jpg";


    public TransactionInitiation() { }

    public TransactionInitiation(String reference) {        
        this.reference = reference;
        attributes.add(new Attributes("email", 			"Email address", 	"true", "EMAILADDRESS"));
        attributes.add(new Attributes("phoneNumber", 	"Phone number", 	"true", "PHONENUMBER"));
        attributes.add(new Attributes("name", 			"Name", 			"true", "NAME"));
        attributes.add(new Attributes("address", 		"Address", 			"true", "ADDRESS"));

    }

    public void addLineItem(int quantity, String description, int amount, String productCode) {
        LineItems item = new LineItems();
        item.setQuantity(Integer.toString(quantity));
        item.setDescription(description);
        item.setAmount(Integer.toString(amount));
        int totalAmount = quantity * amount;
        item.setTotalAmount(Integer.toString(totalAmount));
        this.amount = Integer.toString(Integer.parseInt(this.amount) + totalAmount);
        item.setProductCode(productCode);
        lineItems.add(item);
    }

}
