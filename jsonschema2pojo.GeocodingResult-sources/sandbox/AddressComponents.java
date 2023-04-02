
package csc325.sandbox;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class AddressComponents {

    @SerializedName("zip")
    @Expose
    private String zip;
    @SerializedName("streetName")
    @Expose
    private String streetName;
    @SerializedName("preType")
    @Expose
    private String preType;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("preDirection")
    @Expose
    private String preDirection;
    @SerializedName("suffixDirection")
    @Expose
    private String suffixDirection;
    @SerializedName("fromAddress")
    @Expose
    private String fromAddress;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("suffixType")
    @Expose
    private String suffixType;
    @SerializedName("toAddress")
    @Expose
    private String toAddress;
    @SerializedName("suffixQualifier")
    @Expose
    private String suffixQualifier;
    @SerializedName("preQualifier")
    @Expose
    private String preQualifier;

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getPreType() {
        return preType;
    }

    public void setPreType(String preType) {
        this.preType = preType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPreDirection() {
        return preDirection;
    }

    public void setPreDirection(String preDirection) {
        this.preDirection = preDirection;
    }

    public String getSuffixDirection() {
        return suffixDirection;
    }

    public void setSuffixDirection(String suffixDirection) {
        this.suffixDirection = suffixDirection;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSuffixType() {
        return suffixType;
    }

    public void setSuffixType(String suffixType) {
        this.suffixType = suffixType;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getSuffixQualifier() {
        return suffixQualifier;
    }

    public void setSuffixQualifier(String suffixQualifier) {
        this.suffixQualifier = suffixQualifier;
    }

    public String getPreQualifier() {
        return preQualifier;
    }

    public void setPreQualifier(String preQualifier) {
        this.preQualifier = preQualifier;
    }

}
