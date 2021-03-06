package com.okit.client;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attribute {

    @SerializedName("key")
    @Expose
    private String key;

    @SerializedName("label")
    @Expose
    private String label;

    @SerializedName("required")
    @Expose
    private String required;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("value")
    @Expose
    private String value;
    
    public Attribute() { }

    public Attribute(String key, String label, String required, String type, String value) {
        setKey(key);
        setLabel(label);
        setRequired(required);
        setType(type);
        setValue(value);
    }
    
    public Attribute(UserAttribute value) {
        setKey(value.key);
        setLabel(value.label);
        setRequired(Boolean.TRUE.toString());
        setType(value.type);    	
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
