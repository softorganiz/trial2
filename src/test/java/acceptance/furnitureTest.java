package acceptance;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import skancom.Furniture;
import skancom.House;
import skancom.tenant;

public class furnitureTest {
	List <Furniture> furs=new ArrayList<Furniture>();
	tenant t;
	Furniture f;
	String type,desc,tenant,price;
	
	@Before
	public void createOutputFile() {
		t=new tenant("muna","19","engineer","0592364813");
		f=new Furniture("dining table","100$","muna");
	}
	
	
	@Given("user logged in as tenant")
	public void userLoggedInAsTenant() {
	    // Write code here that turns the phrase above into concrete actions
	   t.setType("tenant");
	   type=t.getType();
	}
	@When("tenant want to sell his used furniture")
	public void tenantWantToSellHisUsedFurniture() {
	    // Write code here that turns the phrase above into concrete actions
	  desc=f.getDescription();
	  price=f.getPrice();
	  tenant=f.getTenant();
	}
	@Then("offer furniture  for sell")
	public void offerFurnitureForSell() {
	    // Write code here that turns the phrase above into concrete actions
	   assertTrue(desc.equals("dining table"));
	   assertTrue(price.equals("100$"));
	   assertTrue(tenant.equals("muna"));
	}



}
