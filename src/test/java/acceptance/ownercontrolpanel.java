package acceptance;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import skancom.House;
import skancom.Owner;

public class ownercontrolpanel {
	Owner o;
	 List<House> unpuphouses= new ArrayList <House>();
	 List<House>puphouses= new ArrayList <House>();
	 House h1,h2;
	 String id,floors,bathrooms,bedrooms,location,name,owner,rent;
	@Before
	public void createOutputFile() {
		
		h1=new House("1","sema","2","3","2","najah street","1000$");
		h1.setTenant("muna");
		h1.setId("1");
		unpuphouses.add(h1);
		h2=new House("2","sema","1","2","1","quds street","900$");
		h2.setId("1");
		puphouses.add(h2);
		o=new Owner();
		
		o.setName("sema");
	}
	@Given("the owner is logged in")
	public void the_owner_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	  o.setLogged(1);
	}

	@When("enter number {int}")
	public void enter_number(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@Then("check that are related to the owner")
	public void check_that_are_related_to_the_owner() {
	    // Write code here that turns the phrase above into concrete actions
	   name=o.getName();
	  owner= h1.getOwner();
	  assertTrue(owner.equals(name));
	}


	@Then("show all unpuplished houses")
	public void show_all_unpuplished_houses() {
	    // Write code here that turns the phrase above into concrete actions
	    id=unpuphouses.get(0).getId();
	    floors=unpuphouses.get(0).getnumfloors();
	    bathrooms=unpuphouses.get(0).getnumbathrooms();
	    bedrooms=unpuphouses.get(0).getnumbedrooms();
	    location=unpuphouses.get(0).getLocation();
	    rent=unpuphouses.get(0).getMonthlyRent();
	    assertTrue(id.equals("1"));
	    assertTrue(floors.equals("2"));
	    assertTrue(bathrooms.equals("3"));
	    assertTrue(bedrooms.equals("2"));
	    assertTrue(location.equals("najah street"));
	    assertTrue(rent.equals("1000$"));
	    
	}

	
	@Then("show all puplished houses")
	public void show_all_puplished_houses() {
	    // Write code here that turns the phrase above into concrete actions
		 id=puphouses.get(0).getId();
		    floors=puphouses.get(0).getnumfloors();
		    bathrooms=puphouses.get(0).getnumbathrooms();
		    bedrooms=puphouses.get(0).getnumbedrooms();
		    location=puphouses.get(0).getLocation();
		    rent=puphouses.get(0).getMonthlyRent();
		    assertTrue(id.equals("1"));
		    assertTrue(floors.equals("1"));
		    assertTrue(bathrooms.equals("2"));
		    assertTrue(bedrooms.equals("1"));
		    assertTrue(location.equals("quds street"));
		    assertTrue(rent.equals("900$"));
	   
	}

}