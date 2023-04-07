
package csc325.sandbox;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

@Generated("jsonschema2pojo")
public class Result {

    @SerializedName("input")
    @Expose
  
    private Input input;
    @SerializedName("addressMatches")
    @Expose
   
    private ArrayList<AddressMatch> addressMatches;

    public Input getInput() {
        return input;
    }

    public void setInput(Input input) {
        this.input = input;
    }

    public ArrayList<AddressMatch> getAddressMatches() {
        return addressMatches;
    }

    public void setAddressMatches(ArrayList<AddressMatch> addressMatches) {
        this.addressMatches = addressMatches;
    }

}
