package acceptance;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import skancom.House;
import skancom.Person;
import skancom.main;
import skancom.tenant;

public class ownerResTest {
	House h1;
	tenant t;
	String id,location,services,monthlyRent,tenannt,contactInfo;
List <House> houses=new ArrayList<House>();
List <tenant> tenants=new ArrayList<tenant>();
	@Before
	public void createOutputFile() {
	t=new tenant("muna","23","doctor","0598184562");
	h1=new House("https://nhs-dynamic.secure.footprint.net/Images/Homes/NVRInc/32459580-191221.jpg","university street","water","1500$","sema","1th November");
	h1.setnumbathrooms("2");
	h1.setnumfloors("1");
	h1.setnumbedrooms("3");
	h1.setId("1");
	houses.add(h1);
	tenants.add(t);
	
		
	}
	
	

	@Given("{string} want to see my housing reservation thier is no reservation")
	public void iWantToSeeMyHousingReservationThierIsNoReservation(String string) {
	    // Write code here that turns the phrase above into concrete actions
		for(int i=0;i<houses.size();i++) {
			if(houses.get(i).getTenant()!=null&&houses.get(i).getOwner().equals("sema"))
			{
				id=houses.get(i).getId();
				location=houses.get(i).getLocation();
				monthlyRent=houses.get(i).getMonthlyRent();
				services=houses.get(i).getServices();
				tenannt=houses.get(i).getTenant();
				int s=tenant.findByName(houses.get(i).getTenant());
				contactInfo=tenants.get(s).getContactInfo();
				
			}}	
	}
	@Then("display  nothing")
	public void displayNothing() {
	    // Write code here that turns the phrase above into concrete actions
	  assertTrue(id==null);
	  assertTrue(location==null);
	  assertTrue(monthlyRent==null);
	  assertTrue(services==null);
	  assertTrue(tenannt==null);
	  assertTrue(contactInfo==null);
	  
	}

	
	@Given("{string} want to see my housing reservation")
	public void iWantToSeeMyHousingReservation(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  h1.setTenant("muna");
	  for(int i=0;i<houses.size();i++) {
			if(houses.get(i).getTenant()!=null&&houses.get(i).getOwner().equals("sema"))
			{
				id=houses.get(i).getId();
				location=houses.get(i).getLocation();
				monthlyRent=houses.get(i).getMonthlyRent();
				services=houses.get(i).getServices();
				tenannt=houses.get(i).getTenant();
				int s=tenant.findByName(houses.get(i).getTenant());
				contactInfo=tenants.get(s).getContactInfo();
				
			}}	
	}
	@Then("display the owner housing reservation information")
	public void displayTheOwnerHousingReservationInformation() {
	    // Write code here that turns the phrase above into concrete actions
	   assertTrue(id.equals("1"));
	   assertTrue(location.equals("university street"));
	   assertTrue(services.equals("water"));
	   assertTrue(monthlyRent.equals("1500$"));
	   assertTrue(tenannt.equals("muna"));
	   assertTrue(contactInfo.equals("0598184562"));
	}




}