package com.okit.client.ticket;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class Ticket {
	
	@SerializedName("id")
	private long id;
	
	@SerializedName("guid")
	private String guid;
	
	@SerializedName("issuedTo")
	private String issuedTo;	
	
	@SerializedName("state")
	private TicketState state;
	
	@SerializedName("externalId")
	private String externalId;
	
	@SerializedName("barcode")
	private String barcode;
	
	@SerializedName("created")
	private Date created;
	
	@SerializedName("used")
	private Date used;
	
	@SerializedName("data")
	private String data;
	
	@SerializedName("barcodeType")
	private BarcodeType barcodeType;
	
	@SerializedName("campaign")
	private Campaign campaign;
	
}
