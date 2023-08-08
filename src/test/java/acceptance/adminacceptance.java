package acceptance;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
//import io.cucumber.core.logging.Logger;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import skancom.Admin;
import skancom.House;

public class adminacceptance {
	List <House> puphouses=new ArrayList < House>();
	List <House> unpuphouses=new ArrayList < House>();
boolean actual;
House h1,h2,h3;
String id;
Admin a;

	
	@Before
	public void createOutputFile() {
		a=new Admin();
		
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
	    // Write code here that turns the phrase above into concrete actionsssssss
	    
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
		House.deleteHouseFromWaitingList(id);
	  for(int i=0;i<unpuphouses.size();i++)
	  {
		  if(unpuphouses.get(i).getId()==id)
			  actual=true;
		  else
			  actual=false;
	  }
	  assertEquals(false,actual);
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
	    assertEquals(true,actual);
	}
	
//	@BeforeClass
//    public void setUp() {
//        System.setOut(new PrintStream(outputStream));
//    }
//
//    @Given("the waiting list of houses is empty.")
//    public void testPrintAllWaitingList_EmptyList() {
//        List<House> waitingHouses = new ArrayList<>();
//        House.setWaitingHouses(waitingHouses);
//    }
//    @When("the printallWaitingList\\() method is called.")
//    public void thePrintWaitingListMethodIsCalled() {
//        House.printallWaitingList();
//    }
//    @Then("the method should log the message {string}.")
//    public void theMethodSouldLogTheMessage(String string){
//        String expectedOutput = "\t\t\t\t\t\t\t\t\t Waiting list is empty.";
//       assertEquals(expectedOutput, outputStream.toString().trim());
//
//        // Reset the output stream
//        outputStream.reset();
//    
//    }
//
//    @Test
//    public void testPrintAllWaitingList_WithHouses() {
//        List<House> waitingHouses = new ArrayList<>();
//        waitingHouses.add(new House("photo", "Location X", "Service A", "1000","sema","3th august"));
//        waitingHouses.add(new House("photo2", "Location Y", "Service B", "2000","sema","4th august"));
//        House.setWaitingHouses(waitingHouses);
//    
//    
//        House.printallWaitingList();
//
//        String expectedOutput = "\t\t\t\t\t\t\t\t\t House Attributes :\n" +
//                                "\t\t\t\t\t\t\t\t\t ID: 1\n" +
//                                "\t\t\t\t\t\t\t\t\t Services: Service A\n" +
//                                "\t\t\t\t\t\t\t\t\t Location: Location X\n" +
//                                "\t\t\t\t\t\t\t\t\t Monthly Rent: 1000\n" +
//                                "\t\t\t\t\t\t\t\t\t House Attributes :\n" +
//                                "\t\t\t\t\t\t\t\t\t ID: 2\n" +
//                                "\t\t\t\t\t\t\t\t\t Services: Service B\n" +
//                                "\t\t\t\t\t\t\t\t\t Location: Location Y\n" +
//                                "\t\t\t\t\t\t\t\t\t Monthly Rent: 2000";
//      assertEquals(expectedOutput, outputStream.toString().trim());
//
//        // Reset the output stream
//        outputStream.reset();
//    }
//
//    @Test
//    public void testPrintAllWaitingList_OnlyNullElements() {
//        List<House> waitingHouses = new ArrayList<>();
//        waitingHouses.add(null);
//        waitingHouses.add(null);
//        waitingHouses.add(null);
//        House.setWaitingHouses(waitingHouses);
//
//        House.printallWaitingList();
//
//        String expectedOutput = "Waiting list contains only null elements.";
//      assertEquals(expectedOutput, outputStream.toString().trim());
//
//        // Reset the output stream
//        outputStream.reset();
//    }
//
//    // Add other test cases as needed
//
//    @AfterClass
//    public void tearDown() {
//        System.setOut(originalOut);
//    }

}