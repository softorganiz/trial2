package acceptance;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import skancom.House;
import skancom.Owner;
import skancom.main;
import skancom.tenant;

public class afterBookTest {
	List <House> houses=new ArrayList<House>();
	List <tenant> tenants=new ArrayList<tenant>();
	List <Owner> owners=new ArrayList<Owner>();
	House h1,h2;
	tenant t;
	String type;
	String name,age,major,paidTime,contact,owner;
	int s;
	Owner o=new Owner("sema","0592381344");
	@Before
	public void createOutputFile() {
		
		h1=new House("photo","quds street","water","900$","sema","6thSep");
	t=new tenant("muna","26","nurse","0592132489");
		houses.add(h1);
		h2=new House("photo2","amman street","water","900$","sema","6thSep");
		houses.add(h2);
		tenants.add(t);
		owners.add(o);
		
	}
	

	@Given("user logged in as a tenant")
	public void userLoggedInAsATenant() {
	    // Write code here that turns the phrase above into concrete actions
		t.setType("tenant");
		 type=t.getType();
		   name=t.getName();
		   age=t.getAge();
		   major=t.getMajor();
		   paidTime=h1.getPaidTime();
		   owner=h1.getOwner();
		  
				   
				    s=tenant.findByName(h1.getOwner());
			 contact=owners.get(s).getContactInfo();
	}
	@When("tenant booked a house")
	public void tenantBookedAHouse() {
	    // Write code here that turns the phrase above into concrete actions
	   h1.setTenant("muna");
	  
	}
	@Then("display house info and owner contact info")
	public void displayHouseInfoAndOwnerContactInfo() {
	    // Write code here that turns the phrase above into concrete actions
	   assertTrue(type.equals("tenant"));
	   assertTrue(name.equals("muna"));
	   assertTrue(age.equals("26"));
	   assertTrue(major.equals("nurse"));
	   assertTrue(paidTime.equals("6thSep"));
	   assertTrue(owner.equals("sema"));
	   assertTrue(contact.equals("0592381344"));
	}




}