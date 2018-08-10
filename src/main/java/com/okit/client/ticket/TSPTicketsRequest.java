package com.okit.client.ticket;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TSPTicketsRequest {

    @SerializedName("token")
    @Expose
	private String token;

    @SerializedName("tickets")
    @Expose
	private List<TSPTicket> tickets;
}
