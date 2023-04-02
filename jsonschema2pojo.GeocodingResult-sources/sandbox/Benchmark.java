
package csc325.sandbox;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Benchmark {

    @SerializedName("isDefault")
    @Expose
    private Boolean isDefault;
    @SerializedName("benchmarkDescription")
    @Expose
    private String benchmarkDescription;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("benchmarkName")
    @Expose
    private String benchmarkName;

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getBenchmarkDescription() {
        return benchmarkDescription;
    }

    public void setBenchmarkDescription(String benchmarkDescription) {
        this.benchmarkDescription = benchmarkDescription;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBenchmarkName() {
        return benchmarkName;
    }

    public void setBenchmarkName(String benchmarkName) {
        this.benchmarkName = benchmarkName;
    }

}
