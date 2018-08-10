package com.okit.client.ticket;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TSPTicket {
	
    @SerializedName("externalId")
    @Expose
	private String externalId;

	@SerializedName("data")
    @Expose
	private String data;

    @SerializedName("barcode")
    @Expose
	private String barcode;

    @SerializedName("barcodeType")
    @Expose
	private BarcodeType barcodeType;

    @SerializedName("event")
    @Expose
	private TSPCampaign event;
    
    public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public BarcodeType getBarcodeType() {
		return barcodeType;
	}

	public void setBarcodeType(BarcodeType barcodeType) {
		this.barcodeType = barcodeType;
	}

	public TSPCampaign getEvent() {
		return event;
	}

	public void setEvent(TSPCampaign event) {
		this.event = event;
	}
}
