package csc325.sandbox;

import java.io.File;
import kong.unirest.Unirest;

/**
 *
 * @author Jonathan Crain
 */
public class SandboxLocation {

    String name;
    String street;
    String city;
    String state;
    String zip;
    //Latitude and longitude (decimal degrees)
    double lat;
    double lon;
    //NWS grid points
    double gridX;
    double gridY;

    /**
     * Default (no arg) constructor.
     */
    public SandboxLocation() {
    }

    /*User enters location in GUI. Upon pressing button, triggers method to parse string and pass information to this class to construct the location.
    Should create several overloaded methods to handle different combinations of location information (since user may e.g., only enter city and state).*/
    public SandboxLocation(String name, String street, String city, String state, String zip) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        //TODO - complete this constructor
        //fetchCoordinates();
        //createForecasts(); //fetches forecasts and maps JSON to objects
    }
    
    public void censusGeocodeZipToFile(){
        String baseURL = "https://geocoding.geo.census.gov/geocoder/locations/address";
        String benchmark = "Public_AR_Current";
        String format = "json";
        File result = Unirest.get(baseURL)
                              .queryString("street", street)
                              .queryString("zip", zip)
                              .queryString("benchmark", benchmark)
                              .queryString("format", format)
                              .asFile("./censusGeocodeZipResult.json")
                              .getBody();
    }
    
    public void censusGeocodeCityStateToFile(){
        String baseURL = "https://geocoding.geo.census.gov/geocoder/locations/address";
        String benchmark = "Public_AR_Current";
        String format = "json";
        File result = Unirest.get(baseURL)
                              .queryString("street", street)
                              .queryString("city", city)
                              .queryString("state", state)
                              .queryString("benchmark", benchmark)
                              .queryString("format", format)
                              .asFile("./censusGeocodeCityStateResult.json")
                              .getBody();
    }
    
    public void censusGeocodeFullAddressToFile(){
        String baseURL = "https://geocoding.geo.census.gov/geocoder/locations/address";
        String benchmark = "Public_AR_Current";
        String format = "json";
        File result = Unirest.get(baseURL)
                              .queryString("street", street)
                              .queryString("city", city)
                              .queryString("state", state)
                              .queryString("zip", zip)
                              .queryString("benchmark", benchmark)
                              .queryString("format", format)
                              .asFile("./censusGeocodeFullAddressResult.json")
                              .getBody();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    @Override
    public String toString() {
        return "Location{" + "name=" + name + ", street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + ", lat=" + lat + ", lon=" + lon + ", gridX=" + gridX + ", gridY=" + gridY + '}';
    }

}
