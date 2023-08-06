package acceptance;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;


import skancom.Person;
import skancom.Admin;
public class login_steps {
	
	Person user;
	boolean actual;
	boolean expected;
	String status;
	String actualType;
	private static ArrayList<Person> persons = new ArrayList<Person>();

	@Before
	public void createOutputFile() {
		user = new Person();
		Person adm1 = new Person("admin", "IamAdmin", "admin");
		adm1.setType("admin");

		Admin admin = new Admin(adm1);
		admin.isStatus();
		
		Person tenant1 = new Person("sema", "sema123", "owner");
		tenant1.setType("owner");

		Person owner1 = new Person("muna", "muna123", "tenant");
		owner1.setType("tenant");

		if (!Person.isExist("admin", persons) && !Person.isExist("sema", persons) && !Person.isExist("muna", persons)) {
			persons.add(owner1);
			persons.add(tenant1);
			persons.add(adm1);

		}

	}

	@Given("that user is not logged in")
	public void that_user_is_not_logged_in() {
		// Write code here that turns the phrase above into concrete actions
		user.setLogged(0);/*flag*/
		user.getLogged();

	}

	@When("username is {string} which type is admin")
	public void username_is_which_type_is_admin(String name) {
		status = persons.get(Person.getIndex(name, persons)).getType();
		user.setName(name);
	
	}

	@When("password is correct {string}")
	public void password_is_correct(String pass) {
		// Write code here that turns the phrase above into concrete actions
		actual = (persons.get(Person.getIndex(user.getName(), persons)).getPassword().equals(pass));
	}

	@Then("logged inn successfully")
	public void logged_insuccessfully() {
		expected = true;
		user.setLogged(1);
		assertEquals(actual, expected);
	}

	@When("password iss false {string}")
	public void password_is_false(String pass) {
		// Write code here that turns the phrase above into concrete actions

		actualType = Admin.login(user.getName(), "123", persons);
	}

	@Then("logg in faild")
	public void log_in_faild() {
		// Write code here that turns the phrase above into concrete actions
		expected = false;
		user.setLogged(0);
		assertEquals("false", actualType);
	}


	@Given("that user is nott logged in")
	public void thatUserIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
	    user.setLogged(0);
	    user.getLogged();
	}
	@When("username is {string} which type is tenant")
	public void usernameIsWhichTypeIsTenant(String name) {
	    // Write code here that turns the phrase above into concrete actions
		status = persons.get(Person.getIndex(name, persons)).getType();
		user.setName(name);
	}
	@When("password is correctt {string}")
	public void passwordIsCorrect(String pass) {
	    // Write code here that turns the phrase above into concrete actions
		actual = (persons.get(Person.getIndex(user.getName(), persons)).getPassword().equals(pass));}
	@Then("logged in successfullyy")
	public void loggedInSuccessfully() {
	    // Write code here that turns the phrase above into concrete actions
	    user.setLogged(1);
	    expected=true;
	    assertEquals(actual,expected);
	}
	

	
	
	
	@When("password is false {string}")
	public void passwordIsFalse(String pass) {
	    // Write code here that turns the phrase above into concrete actions
		actualType = Admin.login(user.getName(), "123", persons);
	}
	@Then("log inn faild")
	public void logInFaild() {
	    // Write code here that turns the phrase above into concrete actions
		expected = false;
		user.setLogged(0);
		assertEquals("false", actualType);
	}







	

	
	@When("username is {string} which type is owner")
	public void usernameIsWhichTypeIsOwner(String name) {
	    // Write code here that turns the phrase above into concrete actions
		status = persons.get(Person.getIndex(name, persons)).getType();
		user.setName(name);
	}
	@When("password iss correct {string}")
	public void password_Is_Correct(String pass) {
	    // Write code here that turns the phrase above into concrete actions
		actual = (persons.get(Person.getIndex(user.getName(), persons)).getPassword().equals(pass));
	}
	@Then("logged in successfully")
	public void logged_In_Successfully() {
	    // Write code here that turns the phrase above into concrete actions
		 user.setLogged(1);
		    expected=true;
		    assertEquals(actual,expected);
	}
	
	

	
	
	@When("password is falsee {string}")
	public void password_IsFalse(String string) {
	    // Write code here that turns the phrase above into concrete actions
		actualType = Admin.login(user.getName(), "123", persons);	}
	@Then("log in faild")
	public void logIn_Faild() {
	    // Write code here that turns the phrase above into concrete actions
		expected = false;
		user.setLogged(0);
		assertEquals("false", actualType);
	}







	@Given("that admin is logged")
	public void thatAdminIsLogged() {
		user.setType("admin");
		user.setName("admin");
		user.setPassword("IamAdmin");
	}
	
	@Then("type is admin")
	public void typeIsAdmin() {
		assertTrue("admin".equalsIgnoreCase(Admin.login(user.getName(), "IamAdmin", persons)));
	}

	@Given("that owner is logged")
	public void thatOwnerIsLogged() {
		user.setType("owner");
		user.setName("owner");
		user.setPassword("123");
		persons.add(user);

	}
	
	@Then("type is owner")
	public void typeIsOwner() {
		assertTrue("owner".equalsIgnoreCase(Admin.login(user.getName(), "123", persons)));

	}

	@Given("that tenant is logged")
	public void thatTenantIsLogged() {
		user.setType("tenant");
		user.setName("owner");
		user.setPassword("123");
		persons.add(user);
	}
	
	@Then("type is tenant")
	public void typeIstenant() {
		assertTrue("owner".equalsIgnoreCase(Admin.login(user.getName(), "123", persons)));
	}

	

}
