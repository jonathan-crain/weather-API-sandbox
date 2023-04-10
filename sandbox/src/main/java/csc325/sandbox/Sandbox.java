package csc325.sandbox;

import java.util.List;

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
        
        System.out.println("Latiude: " + farmingdale.getLat() + " Longitude: " + farmingdale.getLon());
        
        //The ToFile() methods seem to work. Example results are in the root folder of the project.
        //farmingdale.censusGeocodeZipToFile();
        //farmingdale.censusGeocodeCityStateToFile();
        //farmingdale.censusGeocodeFullAddressToFile();
        
        //The ToObject() methods are now working. Hooray! Commenting out all but one, so that further testing can be done with the next stages (getting gridpoints and a forecast).
        /*
        farmingdale.censusGeocodeZipToObject();
        if (farmingdale.getGeoResult() != null){
            int numAddressMatches = farmingdale.getGeoResult().getResult().getAddressMatches().size();
            System.out.printf("%d addresses matched\n", numAddressMatches);

            List<AddressMatch> addressMatches = farmingdale.getGeoResult().getResult().getAddressMatches();
            for (AddressMatch m : addressMatches){
                System.out.printf("city: %s x-coord: %f y-coord: %f\n", m.getAddressComponents().getCity(), m.getCoordinates().getX(), m.getCoordinates().getY());
            }
        }
        
        System.out.println("");
        
        farmingdale.censusGeocodeCityStateToObject();
        if (farmingdale.getGeoResult() != null){
            int numAddressMatches = farmingdale.getGeoResult().getResult().getAddressMatches().size();
            System.out.printf("%d addresses matched\n", numAddressMatches);

            List<AddressMatch> addressMatches = farmingdale.getGeoResult().getResult().getAddressMatches();
            for (AddressMatch m : addressMatches){
                System.out.printf("city: %s x-coord: %f y-coord: %f\n", m.getAddressComponents().getCity(), m.getCoordinates().getX(), m.getCoordinates().getY());
            }
            
        }
        
        System.out.println("");
        
        farmingdale.censusGeocodeZipToObject_v2();
        if (farmingdale.getGeoResult() != null){
            int numAddressMatches = farmingdale.getGeoResult().getResult().getAddressMatches().size();
            System.out.printf("%d addresses matched\n", numAddressMatches);

            List<AddressMatch> addressMatches = farmingdale.getGeoResult().getResult().getAddressMatches();
            for (AddressMatch m : addressMatches){
                System.out.printf("city: %s x-coord: %f y-coord: %f\n", m.getAddressComponents().getCity(), m.getCoordinates().getX(), m.getCoordinates().getY());
            }
            
        }
        
        
        farmingdale.censusGeocodeFullAddressToObject();
        if (farmingdale.getGeoResult() != null){
            int numAddressMatches = farmingdale.getGeoResult().getResult().getAddressMatches().size();
            System.out.printf("%d addresses matched\n", numAddressMatches);

            List<AddressMatch> addressMatches = farmingdale.getGeoResult().getResult().getAddressMatches();
            for (AddressMatch m : addressMatches){
                System.out.printf("city: %s x-coord: %f y-coord: %f\n", m.getAddressComponents().getCity(), m.getCoordinates().getX(), m.getCoordinates().getY());
            }
            
        }
        System.out.println("");
        */
        
        System.out.printf("Farmingdale lat: %f Farmingdale long: %f", farmingdale.getLat(), farmingdale.getLon());
    }
}
