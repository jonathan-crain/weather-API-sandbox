
package csc325.sandbox;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class RelativeLocation {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("geometry")
    @Expose
    private Geometry__1 geometry;
    @SerializedName("properties")
    @Expose
    private Properties__1 properties;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Geometry__1 getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry__1 geometry) {
        this.geometry = geometry;
    }

    public Properties__1 getProperties() {
        return properties;
    }

    public void setProperties(Properties__1 properties) {
        this.properties = properties;
    }

}
