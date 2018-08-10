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
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getIssuedTo() {
		return issuedTo;
	}

	public void setIssuedTo(String issuedTo) {
		this.issuedTo = issuedTo;
	}

	public TicketState getState() {
		return state;
	}

	public void setState(TicketState state) {
		this.state = state;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUsed() {
		return used;
	}

	public void setUsed(Date used) {
		this.used = used;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public BarcodeType getBarcodeType() {
		return barcodeType;
	}

	public void setBarcodeType(BarcodeType barcodeType) {
		this.barcodeType = barcodeType;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}	
}
