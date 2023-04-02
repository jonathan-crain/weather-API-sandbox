
package csc325.sandbox;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class TigerLine {

    @SerializedName("side")
    @Expose
    private String side;
    @SerializedName("tigerLineId")
    @Expose
    private String tigerLineId;

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getTigerLineId() {
        return tigerLineId;
    }

    public void setTigerLineId(String tigerLineId) {
        this.tigerLineId = tigerLineId;
    }

}
