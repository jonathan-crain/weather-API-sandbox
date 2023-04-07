
package csc325.sandbox;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class AddressMatch {

    @SerializedName("tigerLine")
    @Expose
    
    private TigerLine tigerLine;
    @SerializedName("coordinates")
    @Expose
    
    private Coordinates coordinates;
    @SerializedName("addressComponents")
    @Expose
    
    private AddressComponents addressComponents;
    @SerializedName("matchedAddress")
    @Expose
    private String matchedAddress;

    public TigerLine getTigerLine() {
        return tigerLine;
    }

    public void setTigerLine(TigerLine tigerLine) {
        this.tigerLine = tigerLine;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public AddressComponents getAddressComponents() {
        return addressComponents;
    }

    public void setAddressComponents(AddressComponents addressComponents) {
        this.addressComponents = addressComponents;
    }

    public String getMatchedAddress() {
        return matchedAddress;
    }

    public void setMatchedAddress(String matchedAddress) {
        this.matchedAddress = matchedAddress;
    }

}
