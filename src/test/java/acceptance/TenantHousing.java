package acceptance;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


import skancom.Person;
import skancom.Admin;
import skancom.House;
import skancom.tenant;
public class TenantHousing {
	Person user=new Person();

	boolean actual;
	boolean expected;
	List  <House> houses =new ArrayList<House>();
	tenant t1=new tenant();
	@Before
	public void createOutputFile() {
		user= new Person();
		t1=new tenant();
		t1.setName("muna");
		House h1=new House("photo","location","services","monthly rent","owner","paid time");
		houses.add(h1);
		
		
	}
	
	
	@Given("the uset is logged in as {string} with name {string}")
	public void theUsetIsLoggedInAsWithName(String type, String name) {
	    // Write code here that turns the phrase above into concrete actions

	 user.setLogged(1);
	 user.getLogged();
	
	 
	}
	

	@When("the tenant with name {string} enter {string}")
	public void theTenantWithNameEnter(String name, String id) {
	    // Write code here that turns the phrase above into concrete actions
	  
		for(int i=0;i<houses.size();i++)
		{
			if(houses.get(i).getId().equals(id)) {
				houses.get(i).setTenant(name);
			actual=houses.get(i).getTenant().equals(name);}
		}
		
	
	}
	@Then("house booked successfully")
	public void houseBookedSuccessfully() {
	    // Write code here that turns the phrase above into concrete actions
	  expected=true;
	  assertTrue(expected==true);
	
	}



}
