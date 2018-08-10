package com.okit.client.ticket;

import java.util.Calendar;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;

public class TSPCampaign {
	
    @SerializedName("externalId")
    @Expose
	private String externalId;

    @SerializedName("name")
    @Expose
	private String name;

    @SerializedName("description")
    @Expose
	private String description;

    @SerializedName("conditions")
    @Expose
	private String conditions;

    @SerializedName("end")
    @Expose
    @JsonAdapter(CalendarGsonAdapter.class)
	private Calendar guid;

    @SerializedName("start")
    @Expose
    @JsonAdapter(CalendarGsonAdapter.class)
	private Calendar start;

    @SerializedName("location")
    @Expose
	private String location;

    @SerializedName("venue")
    @Expose
	private String venue;
    
	@SerializedName("sponsorImageId")
    @Expose
	private Long sponsorImageId;

    public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getConditions() {
		return conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	public Calendar getGuid() {
		return guid;
	}

	public void setGuid(Calendar guid) {
		this.guid = guid;
	}

	public Calendar getStart() {
		return start;
	}

	public void setStart(Calendar start) {
		this.start = start;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public Long getSponsorImageId() {
		return sponsorImageId;
	}

	public void setSponsorImageId(Long sponsorImageId) {
		this.sponsorImageId = sponsorImageId;
	}    
    
}
