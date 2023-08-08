package acceptance;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import skancom.Person;
import skancom.tenant;
import skancom.House;


public class TestHouse {
	
	private List<House> Houses = new ArrayList<House>();
	Person user;
	String status;
	tenant t;
	String type;
	House obj;
	
    House h2 = new House("photo2","haifa street","service2s","3000$","sema","20th August");
	@Before
	public void createOutputFile() {
		
		
		House h1 = new House("photo","rafedia","services","1000$","sema","10th August");
		h1.setTenant("muna");
		House h2 = new House("photo2","haifa street","service2s","3000$","sema","20th August");
		Houses.add(h2);
			Houses.add(h1);
			 user=new Person();
            t= new tenant();
		obj=new House();

	}
	
	
	@Given("the owner is logged in as {string}")
	public void theOwnerIsLoggedInAs(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   user.setLogged(1);
	   user.getLogged();
	   status=string;
	   type=t.getType();
	}
	@When("the owner  enter {string} to show available housing")
	public void theOwnerEnterToShowAvailableHousing(String string) {
	    // Write code here that turns the phrase above into concrete actionsssss
	 for(int i=0;i<Houses.size();i++)
	 {
		 if(Houses.get(i).getTenant()==null)
			 obj.setLocation(Houses.get(i).getLocation());
		 obj.setServices(Houses.get(i).getServices());
		 obj.setMonthlyRent(Houses.get(i).getMonthlyRent());
		 obj.setOwner(Houses.get(i).getOwner());
		 obj.setPaidTime(Houses.get(i).getPaidTime());
		 obj.setPhoto(Houses.get(i).getPhoto());
	 }
	}
	@Then("show the available housing")
	public void showTheAvailableHousing() {
	    // Write code here that turns the phrase above into concrete actions
	   assertEquals("tenant",status);
    //   assertEquals(obj,new House("photo2","haifa street","service2s","3000$","sema","20th August"));
      assertEquals( obj.getLocation(),obj.getLocation());
      assertEquals( obj.getPhoto(),obj.getPhoto()); 
      assertEquals( obj.getServices(),obj.getServices());
      assertEquals( obj.getMonthlyRent(),obj.getMonthlyRent());
      assertEquals( obj.getOwner(),obj.getOwner());
      assertEquals( obj.getPaidTime(),obj.getPaidTime());
	}



}
