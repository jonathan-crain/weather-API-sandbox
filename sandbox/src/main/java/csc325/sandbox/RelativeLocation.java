
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
    private PointsGeometry__1 geometry;
    @SerializedName("properties")
    @Expose
    private RelativeLocationProperties properties;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PointsGeometry__1 getGeometry() {
        return geometry;
    }

    public void setGeometry(PointsGeometry__1 geometry) {
        this.geometry = geometry;
    }

    public RelativeLocationProperties getProperties() {
        return properties;
    }

    public void setProperties(RelativeLocationProperties properties) {
        this.properties = properties;
    }

}
