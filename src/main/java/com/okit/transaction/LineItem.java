
package com.okit.transaction;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LineItem {

    @SerializedName("allowCampaigns")
    @Expose
    private String allowCampaigns;

    @SerializedName("amount")
    @Expose
    private String amount;

    @SerializedName("currency")
    @Expose
    private String currency = "EUR";

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("excludedFromCampaigns")
    @Expose
    private String excludedFromCampaigns;

    @SerializedName("externalId")
    @Expose
    private String externalId;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("quantity")
    @Expose
    private String quantity;

    @SerializedName("totalAmount")
    @Expose
    private String totalAmount;

    @SerializedName("totalCurrency")
    @Expose
    private String totalCurrency;

    @SerializedName("vat")
    @Expose
    private String vat = "21";

    @SerializedName("productCode")
    @Expose
    private String productCode;

    public String getAllowCampaigns() {
        return allowCampaigns;
    }

    public void setAllowCampaigns(String allowCampaigns) {
        this.allowCampaigns = allowCampaigns;
    }

    public String getAmount() {
        return amount;
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
}
