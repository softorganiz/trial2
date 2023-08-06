package acceptance;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import skancom.House;

public class allReservationTest {
	House h1,h2;
	boolean actual;
	boolean expected;
	int count=0;
	List <House> houses=new ArrayList < House>();
	@Before
	public void createOutputFile() {
		
		h1=new House("photo","quds street","water","900$","sema","6thSep");
		h1.setTenant("muna");
		houses.add(h1);
		h2=new House("photo2","amman street","water","900$","sema","6thSep");
		houses.add(h2);
		
	}
	
	@Given("i want to show all reservation no reservation")
	public void iWantToShowAllReservationNoReservation() {
	    // Write code here that turns the phrase above into concrete actions
	 actual=h1.isAvailable();
	}
	@Then("display all reservation")
	public void displayAllReservation() {
	    // Write code here that turns the phrase above into concrete actions
	    expected=false;
	    assertEquals(expected,actual);
	}


	@Given("i want to show all reservation2")
	public void iWantToShowAllReservation2() {
	    // Write code here that turns the phrase above into concrete actions
		for(int i=0;i<houses.size();i++)
		{
		if(houses.get(i).isAvailable())	
			count++;
		}
	 
	}
	@Then("display nothing")
	public void displayNothing() {
	    // Write code here that turns the phrase above into concrete actions
	    assertTrue(count==1);
	}



}