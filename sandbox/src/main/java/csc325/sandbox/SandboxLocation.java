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
    GeocodingResult geoResult;

    public double getGridX() {
        return gridX;
    }

    public double getGridY() {
        return gridY;
    }

    public GeocodingResult getGeoResult() {
        return geoResult;
    }

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
    
    /**
     * Queries the US Census Bureau Geocoding API using the street and ZIP code.
     * Result is saved to a file in the root directory.
     */
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
    
    /**
     * Queries the US Census Bureau Geocoding API using the street and ZIP code.
     * Result is mapped to an object (not currently working).
     */
    public void censusGeocodeZipToObject(){
        String baseURL = "https://geocoding.geo.census.gov/geocoder/locations/address";
        String benchmark = "Public_AR_Current";
        String format = "json";
        geoResult = Unirest.get(baseURL)
                              .queryString("street", street)
                              .queryString("zip", zip)
                              .queryString("benchmark", benchmark)
                              .queryString("format", format)
                              .asObject(GeocodingResult.class)
                              .getBody();
    }
    
    /**
     * Queries the US Census Bureau Geocoding API using the street, city, and state (but no ZIP).
     * Result is saved to a file in the root directory..
     */
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
    
    /**
     * Queries the US Census Bureau Geocoding API using the street, city, and state (but no ZIP).
     * Result is mapped to an object (not currently working).
     */
    public void censusGeocodeCityStateToObject(){
        String baseURL = "https://geocoding.geo.census.gov/geocoder/locations/address";
        String benchmark = "Public_AR_Current";
        String format = "json";
        geoResult = Unirest.get(baseURL)
                              .queryString("street", street)
                              .queryString("city", city)
                              .queryString("state", state)
                              .queryString("benchmark", benchmark)
                              .queryString("format", format)
                              .asObject(GeocodingResult.class)
                              .getBody();
    }
    
    /**
     * Queries the US Census Bureau Geocoding API using the full address.
     * Result is saved to a file..
     */
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

    /**
     * Queries the US Census Bureau Geocoding API using the full address.
     * Result is mapped to an object (not currently working).
     */
    public void censusGeocodeFullAddressToObject(){
        String baseURL = "https://geocoding.geo.census.gov/geocoder/locations/address";
        String benchmark = "Public_AR_Current";
        String format = "json";
        geoResult = Unirest.get(baseURL)
                              .queryString("street", street)
                              .queryString("city", city)
                              .queryString("state", state)
                              .queryString("zip", zip)
                              .queryString("benchmark", benchmark)
                              .queryString("format", format)
                              .asObject(GeocodingResult.class)
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
