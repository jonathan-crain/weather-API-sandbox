package csc325.sandbox;

/**
 *
 * @author Jonathan Crain
 */
public class Sandbox {

    public static void main(String[] args) {
        //Make a location to play with. Must be in the US. 
        String name = "Farmingdale State College";
        String street = "2350 Broadhollow Rd";
        String city = "Farmingdale";
        String state = "NY";
        String zip = "11735";      
        SandboxLocation farmingdale = new SandboxLocation(name, street, city, state, zip);
        
        //Test the methods.
        //farmingdale.censusGeocodeZipToFile();
        //farmingdale.censusGeocodeCityStateToFile();
        //farmingdale.censusGeocodeFullAddressToFile();
        farmingdale.censusGeocodeZipToObject();
    }
}
