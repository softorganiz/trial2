package acceptance;
import skancom.House;
import skancom.Owner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class editinghouse {
	
	private House newHouse;
    private boolean isHouseUpdated;
    String houseid,photo,newP,newL,newS,newM,newC,location,service,rent,contact;
    boolean actual;
   Owner o;
   List<House> houses= new ArrayList <House>();
	@Before
	public void createOutputFile() {
		
	newHouse=new House("photo","quds street","water","900$","sema","6thSep");
	newHouse.setId("1");
	houses.add(newHouse);
		 o=new Owner();
		
	}

    @Given("The owner wants to update the photo of a house")
    public void the_owner_wants_to_update_the_photo_of_a_house() {
    	
    	// The implementation for this step is not needed as it is just a description of the scenario.
    
 		o.setLogged(1);
 		
    }

    @Given("The owner enters the house ID {string}")
    public void the_owner_enters_the_house_id(String houseId) {
        // Here you can set up the new house object with the given house ID.
houseid=houseId;
    	 
    }

    @When("The owner provides the new photo information {string}")
    public void the_owner_provides_the_new_photo_information(String newPhoto) {
        // Set the new photo for the new house.
    	 newP=newPhoto;
    	House.updatePhoto(houseid,newPhoto ,houses);
    }

    @Then("The photo of the house with ID {string} is updated successfully")
    public void the_photo_of_the_house_with_id_is_updated_successfully(String houseId) {
        // Here, you can implement the verification logic to check if the photo is updated successfully.
        // For example:
    	for(int i=0;i<houses.size();i++)
    	{
    		if(houses.get(i).getId().equals(houseId))
    		{
    			photo=houses.get(i).getPhoto();
    		}
    	}
    	assertTrue(photo.equals(newP));
     
    }

    @Given("The owner wants to update the location of a house")
    public void the_owner_wants_to_update_the_location_of_a_house() {
    	
    	// The implementation for this step is not needed as it is just a description of the scenario.
    		o.setLogged(1);
    }

    @When("The owner provides the new location information {string}")
    public void the_owner_provides_the_new_location_information(String newLocation) {
        // Set the new location for the new house.
    	 newL=newLocation;
    	House.updateloc(houseid,newLocation ,houses);
    }

    @Then("The location of the house with ID {string} is updated successfully")
    public void the_location_of_the_house_with_id_is_updated_successfully(String houseId) {
        // Here, you can implement the verification logic to check if the location is updated successfully.
        // For example:
    	for(int i=0;i<houses.size();i++)
    	{
    		if(houses.get(i).getId().equals(houseId))
    		{
    			location=houses.get(i).getLocation();
    		}
    	}
    	assertTrue(location.equals(newL));
      
    }

    @Given("The owner wants to update the available services of a house")
    public void the_owner_wants_to_update_the_available_services_of_a_house() {
    	
    	// The implementation for this step is not needed as it is just a description of the scenario.
    		o.setLogged(1);
    }

    @When("The owner provides the new available services information {string}")
    public void the_owner_provides_the_new_available_services_information(String newServices) {
        // Set the new available services for the new house.
    	//newHouse.setId("1");
    	 newS=newServices;
     	House.updateservices(houseid,newServices ,houses);
    	 
    }

    @Then("The available services of the house with ID {string} are updated successfully")
    public void the_available_services_of_the_house_with_id_are_updated_successfully(String houseId) {
        // Here, you can implement the verification logic to check if the available services are updated successfully.
        // For example:
    	for(int i=0;i<houses.size();i++)
    	{
    		if(houses.get(i).getId().equals(houseId))
    		{
    			service=houses.get(i).getServices();
    		}
    	}
    	assertTrue(service.equals(newS)); 
    }

    @Given("The owner wants to update the monthly rent of a house")
    public void the_owner_wants_to_update_the_monthly_rent_of_a_house() {
    	
    	// The implementation for this step is not needed as it is just a description of the scenario.
    	o.setLogged(1);
    }

    @When("The owner provides the new monthly rent information {string}")
    public void the_owner_provides_the_new_monthly_rent_information(String newMonthlyRent) {
        // Set the new monthly rent for the new house.
    	newM=newMonthlyRent;
     	House.updaterent(houseid,newMonthlyRent ,houses);
      
    }

    @Then("The monthly rent of the house with ID {string} is updated successfully")
    public void the_monthly_rent_of_the_house_with_id_is_updated_successfully(String houseId) {
        // Here, you can implement the verification logic to check if the monthly rent is updated successfully.
        // For example: 
    	for(int i=0;i<houses.size();i++)
    	{
    		if(houses.get(i).getId().equals(houseId))
    		{
    			rent=houses.get(i).getMonthlyRent();
    		}
    	}
    	assertTrue(rent.equals(newM)); 
        
    }

//    @Given("The owner wants to update the contact information of a house")
//    public void the_owner_wants_to_update_the_contact_information_of_a_house() {
//    	 throw new io.cucumber.java.PendingException();
//    	// The implementation for this step is not needed as it is just a description of the scenario.
//    }
//
//    @When("The owner provides the new contact information {string}")
//    public void the_owner_provides_the_new_contact_information(String newContactInfo) {
//        // Set the new contact information for the new house.
//    	 throw new io.cucumber.java.PendingException();
//    }
//
//    @Then("The contact information of the house with ID {string} is updated successfully")
//    public void the_contact_information_of_the_house_with_id_is_updated_successfully(String houseId) {
//        // Here, you can implement the verification logic to check if the contact information is updated successfully.
//        // For example:
//    	 throw new io.cucumber.java.PendingException(); 
//    }
//    
    @Given("There are existing houses in the system")
    public void there_are_existing_houses_in_the_system() {
        // Write code here that turns the phrase above into concrete actions
       
    }

    @When("The owner enters an invalid house ID {string}")
    public void the_owner_enters_an_invalid_house_id(String string) {
        // Write code here that turns the phrase above into concrete actions
    	
      for(int i=0;i<houses.size();i++)
      {
    	  if(houses.get(i).getId().equals(string))
    		  actual=true;
    	  else
    		  actual=false;
      }
    }

    @Then("The system displays an error message {string}")
    public void the_system_displays_an_error_message(String string) {
        // Write code here that turns the phrase above into concrete actions
      assertTrue(actual==false);
    }

}