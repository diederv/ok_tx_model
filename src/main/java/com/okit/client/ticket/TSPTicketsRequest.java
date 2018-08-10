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

    public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public List<TSPTicket> getTickets() {
		return tickets;
	}

	public void setTickets(List<TSPTicket> tickets) {
		this.tickets = tickets;
	}
}
