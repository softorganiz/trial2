package acceptance;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import skancom.House;
import skancom.main;

public class adminacceptance {
	List <House> puphouses=new ArrayList < House>();
	List <House> unpuphouses=new ArrayList < House>();
boolean actual;
House h1,h2,h3;
String id;
	
	@Before
	public void createOutputFile() {
		
		h1=new House("photo","quds street","water","900$","sema","6thSep");
		h1.setTenant("muna");
		h1.setId("1");
		puphouses.add(h1);
		h2=new House("photo2","amman street","water","900$","sema","6thSep");
		h2.setId("2");
		unpuphouses.add(h2);
		h3=new House("photo3","najah street","water","500$","sema","5th november");
		h3.setId("3");
		unpuphouses.add(h3);
		
	}
	
	@Given("want to show waiting requests")
	public void want_to_show_waiting_requests() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("enter a valid id {string} house")
	public void enter_a_valid_id_house(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   id=string;
	}

	@When("he press {int}")
	public void he_press(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("the house request is published to tenants")
	public void the_house_request_is_published_to_tenants() {
	    // Write code here that turns the phrase above into concrete actions
	    puphouses.add(h1);
	}

	@Then("delete it from the waiting list")
	public void delete_it_from_the_waiting_list() {
	    // Write code here that turns the phrase above into concrete actions
		House.transferHouse(id, unpuphouses, puphouses);
	}

	@Then("the house request is deleted from the waiting list")
	public void the_house_request_is_deleted_from_the_waiting_list() {
	    // Write code here that turns the phrase above into concrete actions
	  for(int i=0;i<unpuphouses.size();i++)
	  {
		  if(unpuphouses.get(i).getId()==id)
			  actual=true;
		  else
			  actual=false;
	  }
	  assertTrue(actual==false);
	}

	@When("enter  unvalid id {string} house")
	public void enter_unvalid_id_house(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 for(int i=0;i<puphouses.size();i++)
	      {
	    	  if(puphouses.get(i).getId().equals(string))
	    		  actual=true;
	    	  else
	    		  actual=false;
	      }
	}

	@Then("give him a message that it is a false house id")
	public void give_him_a_message_that_it_is_a_false_house_id() {
	    // Write code here that turns the phrase above into concrete actions
	    assertTrue(actual==true);
	}

}