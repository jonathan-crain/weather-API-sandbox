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
        
        //Test the methods.
        //All methods except the one currently being tested are commented out.
        
        //The ToFile() methods seem to work. Example results are in the root folder of the project.
        //farmingdale.censusGeocodeZipToFile();
        //farmingdale.censusGeocodeCityStateToFile();
        //farmingdale.censusGeocodeFullAddressToFile();
        
        //The ToObject() methods are not working. An object is generated (we pass the != null condition), but we crash because the AddressMatches list is null.
        /*
        farmingdale.censusGeocodeZipToObject();
        if (farmingdale.getGeoResult() != null){
            int numAddressMatches = farmingdale.getGeoResult().getAddressMatches().size();
            System.out.printf("%d addresses matched\n", numAddressMatches);

            List<AddressMatch> addressMatches = farmingdale.getGeoResult().getAddressMatches();
            for (AddressMatch m : addressMatches){
                System.out.printf("city: %s x-coord: %f y-coord: %f\n", m.getAddressComponents().getCity(), m.getCoordinates().getX(), m.getCoordinates().getY());
            }
            
        }
        */
        
        /*
        farmingdale.censusGeocodeCityStateToObject();
        if (farmingdale.getGeoResult() != null){
            int numAddressMatches = farmingdale.getGeoResult().getAddressMatches().size();
            System.out.printf("%d addresses matched\n", numAddressMatches);

            List<AddressMatch> addressMatches = farmingdale.getGeoResult().getAddressMatches();
            for (AddressMatch m : addressMatches){
                System.out.printf("city: %s x-coord: %f y-coord: %f\n", m.getAddressComponents().getCity(), m.getCoordinates().getX(), m.getCoordinates().getY());
            }
            
        }
        */ 
        
        farmingdale.censusGeocodeFullAddressToObject();
        if (farmingdale.getGeoResult() != null){
            int numAddressMatches = farmingdale.getGeoResult().getAddressMatches().size();
            System.out.printf("%d addresses matched\n", numAddressMatches);

            List<AddressMatch> addressMatches = farmingdale.getGeoResult().getAddressMatches();
            for (AddressMatch m : addressMatches){
                System.out.printf("city: %s x-coord: %f y-coord: %f\n", m.getAddressComponents().getCity(), m.getCoordinates().getX(), m.getCoordinates().getY());
            }
            
        }
        
    }
}
