package acceptance;
import skancom.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.*;

public class owneraddhouse {
	List<House> waitingList;
    House newHouse;
    boolean isHouseAdded;

    @Given("The owner wants to add a new house to the waiting list.")
    public void the_owner_wants_to_add_a_new_house_to_the_waiting_list() {
        waitingList = new ArrayList <House >();
    }

    @When("The owner provides all the necessary information \\(ID, location, number of floors, bedrooms, bathrooms, monthly rent, etc.).")
    public void the_owner_provides_all_the_necessary_information_id_location_number_of_floors_bedrooms_bathrooms_monthly_rent_etc() {
        newHouse = new House("owner_name", "2", "2", "3", "location", "2000");
    }

    @Then("The new house is successfully added to the waiting list, and the waiting list contains the new house.")
    public void the_new_house_is_successfully_added_to_the_waiting_list_and_the_waiting_list_contains_the_new_house() {
        isHouseAdded = addHouseToWaitingList(newHouse);
        Assert.assertTrue(isHouseAdded);
        Assert.assertTrue(waitingList.contains(newHouse));
    }

    private boolean addHouseToWaitingList(House house) {
        if (!waitingList.contains(house)) {
            waitingList.add(house);
            return true;
        }
        return false;
    }
    


    @Given("The owner wants to add multiple houses to the waiting list.")
    public void the_owner_wants_to_add_multiple_houses_to_the_waiting_list() {
        // No specific action needed in this step as it's just a description.
    	waitingList = new ArrayList <House >();
    }

    @When("The owner provides the information for each house \\(unique IDs, locations, number of floors, bedrooms, bathrooms, monthly rent, etc.).")
    public void the_owner_provides_the_information_for_each_house_unique_i_ds_locations_number_of_floors_bedrooms_bathrooms_monthly_rent_etc() {
        House house1 = new House( "owner1", "2", "2", "3", "location1", "2000");
        House house2 = new House( "owner2", "3", "3", "4", "location2", "2500");
        isHouseAdded = addHouseToWaitingList(house1);
        Assert.assertTrue(isHouseAdded);
        isHouseAdded = addHouseToWaitingList(house2);
        Assert.assertTrue(isHouseAdded);
    }

    @Then("Each new house is successfully added to the waiting list, and the waiting list contains all the new houses.")
    public void each_new_house_is_successfully_added_to_the_waiting_list_and_the_waiting_list_contains_all_the_new_houses() {
        
        Assert.assertEquals(2, waitingList.size());
    }

}