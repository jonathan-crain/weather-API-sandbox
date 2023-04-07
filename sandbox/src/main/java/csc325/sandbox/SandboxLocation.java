package csc325.sandbox;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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
    double lat; //y-value returned by Census Geocoding
    double lon; //x-value returned by Census Geocoding
    //NWS grid points
    double gridX;
    double gridY;
    //Object which holds Census Bureau Geocoding API responses
    GeocodingResult geoResult;
    //Object which holds National Weather Service (Grid) Points responses.
    Points points;
    String userAgentNWS = "CSC 325 Capstone Project, craij3@farmingdale.edu";

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
        censusGeocodeFullAddressToObject();
        if (geoResult.getResult() == null || geoResult.getResult().getAddressMatches().isEmpty()){
            System.out.println("Could not geocode this location. Should replace this with proper error handling.");
        } else {
            //I'm not sure how to handle the fact that geocoding can return multiple results. I'm just taking the first result for the time being.
            lat = geoResult.getResult().getAddressMatches().get(0).getCoordinates().getY();
            lon = geoResult.getResult().getAddressMatches().get(0).getCoordinates().getX();
        }
        //getGridPoints();
        //System.out.println("GridX: " + points.getProperties().getGridX());
        //createForecasts(); //fetches forecasts and maps JSON to objects
    }
    
    //Should try to figure out how to add a user agent.
    private void getGridPoints(){
        String baseURL = "https://api.weather.gov/points/{latitude},{longitude}";
        points = Unirest.get(baseURL)
                .routeParam("latitude", String.valueOf(lat))
                .routeParam("longitude", String.valueOf(lon))
                .asObject(Points.class)
                .getBody()
                ;
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
    
    public void censusGeocodeZipToObject_v2(){
        String baseURL = "https://geocoding.geo.census.gov/geocoder/locations/address";
        String benchmark = "Public_AR_Current";
        String format = "json";
        String response = Unirest.get(baseURL)
                              .queryString("street", street)
                              .queryString("zip", zip)
                              .queryString("benchmark", benchmark)
                              .queryString("format", format)
                              .asString()
                              .getBody();
        Gson gson = new GsonBuilder().create();
        geoResult = gson.fromJson(response, GeocodingResult.class);
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
