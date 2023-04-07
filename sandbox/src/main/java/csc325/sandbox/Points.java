
package csc325.sandbox;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Points {

    @SerializedName("@context")
    @Expose
    private List<String> context;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("geometry")
    @Expose
    private PointsGeometry geometry;
    @SerializedName("properties")
    @Expose
    private PointsProperties properties;

    public List<String> getContext() {
        return context;
    }

    public void setContext(List<String> context) {
        this.context = context;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PointsGeometry getGeometry() {
        return geometry;
    }

    public void setGeometry(PointsGeometry geometry) {
        this.geometry = geometry;
    }

    public PointsProperties getProperties() {
        return properties;
    }

    public void setProperties(PointsProperties properties) {
        this.properties = properties;
    }

}
