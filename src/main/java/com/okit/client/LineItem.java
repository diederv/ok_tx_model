
package com.okit.client;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LineItem {

    @SerializedName("allowCampaigns")
    @Expose
    private String allowCampaigns = "false";

    @SerializedName("amount")
    @Expose
    private String amount = "0";

    @SerializedName("currency")
    @Expose
    private String currency = "EUR";

    @SerializedName("description")
    @Expose
    private String description = "";

    @SerializedName("excludedFromCampaigns")
    @Expose
    private String excludedFromCampaigns = "false";

    @SerializedName("externalId")
    @Expose
    private String externalId = "";

    @SerializedName("id")
    @Expose
    private String id = "";

    @SerializedName("quantity")
    @Expose
    private String quantity = "0";

    @SerializedName("totalAmount")
    @Expose
    private String totalAmount = "0";

    @SerializedName("totalCurrency")
    @Expose
    private String totalCurrency = "0";

    @SerializedName("vat")
    @Expose
    private String vat = "21";

    @SerializedName("productCode")
    @Expose
    private String productCode = "";

    @SerializedName("subItems")
    @Expose
    private List<SubItem> subItems;
    
    public LineItem() { }

    public String toString() {
    	String subItemsStr = "";
    	if (subItems != null) {
    		for (SubItem si : subItems) {
    			subItemsStr += si.toString();
    		}
    	}
    	return "LineItem[allowCampaigns:" + allowCampaigns + ", amount:" + amount + ", currency:" + currency + ", description:" + description +
    			"excludedFromCampaigns:" + excludedFromCampaigns + ", externalId:" + externalId + ", id:" + id + ", quantity:" + quantity +
    			", totalAmount:" + totalAmount + ", totalCurrency:" + totalCurrency + ", vast:" + vat + ", productCode:" + productCode +
    			", subItems:" + subItemsStr + "]";
    			
    }
    
    public String getAllowCampaigns() {
        return allowCampaigns;
    }

    public void setAllowCampaigns(String allowCampaigns) {
        this.allowCampaigns = allowCampaigns;
    }

    public int getAmount() {
        return Integer.parseInt(amount);
    }

    public void setAmount(String amount) {
        this.amount = amount;
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

    public String getExcludedFromCampaigns() {
        return excludedFromCampaigns;
    }

    public void setExcludedFromCampaigns(String excludedFromCampaigns) {
        this.excludedFromCampaigns = excludedFromCampaigns;
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

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

	public List<SubItem> getSubItems() {
		return subItems;
	}

	public void setSubItems(List<SubItem> subItems) {
		this.subItems = subItems;
	}
}
