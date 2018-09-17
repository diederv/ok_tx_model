package com.okit.client;

public class SubItem {
	
	private String allowCampaigns = "false";
	
	private String excludedFromCampaigns = "false";	
	
	private String amount = "0";
	
	private String quantity = "0";
	
	private String totalAmount = "0";	
	
	private String campaignCode = "";
	
	private String campaignItemCode = "";
	
	private String currency = "";
	
	private String description = "";	
	
	private String externalId = "";
	
	private String id = "";
	
	private String totalCurrency = "";
	
	private String type = "";
	
	public SubItem() { }
	
	public SubItem(String allowCampaigns, String excludedFromCampaigns,
					String amount, String quantity, String totalAmount, String campaignCode,
					String campaignItemCode, String currency, String description,	
					String externalId, String id, String totalCurrency, String type) {
		this.allowCampaigns = allowCampaigns;			
		this.excludedFromCampaigns = excludedFromCampaigns;		
		setAmount(amount);
		setQuantity(quantity);
		setAmount(totalAmount);		
		this.campaignCode = campaignCode;
		this.campaignItemCode = campaignItemCode;
		this.currency = currency;	
		this.description = description;
		this.externalId = externalId;
		this.id = id;		
		this.totalCurrency = totalCurrency;
		this.type = type;
	}
	
	public String toString() {
		return "SubItem[allowCampaigns:" + allowCampaigns + ", excludedFromCampaigns:" + excludedFromCampaigns + ", amount:" + amount +
				", quantity:" + quantity + ", totalAmount:" + totalAmount + ", campaignCode:" + campaignCode + ", campaignItemCode:" + campaignItemCode +
				", currency:" + currency + ", description:" + description + ", externalId:" + externalId + ", id:" + id + ", totalCurrency:" + totalCurrency +
				", type:" + type + "]";
	}

	public boolean isAllowCampaigns() {
		return Boolean.parseBoolean(allowCampaigns);
	}

	public void setAllowCampaigns(boolean allowCampaigns) {
		this.allowCampaigns = Boolean.toString(allowCampaigns);
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCampaignCode() {
		return campaignCode;
	}

	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}

	public String getCampaignItemCode() {
		return campaignItemCode;
	}

	public void setCampaignItemCode(String campaignItemCode) {
		this.campaignItemCode = campaignItemCode;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isExcludedFromCampaigns() {
		return Boolean.parseBoolean(excludedFromCampaigns);
	}

	public void setExcludedFromCampaigns(boolean excludedFromCampaigns) {
		this.excludedFromCampaigns = Boolean.toString(excludedFromCampaigns);
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTotalCurrency() {
		return totalCurrency;
	}

	public void setTotalCurrency(String totalCurrency) {
		this.totalCurrency = totalCurrency;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
