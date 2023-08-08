package skancom;

public class Owner extends Person { 
	
	private String contactInfo;

	private House ownedHouse;

	
	public Owner(String name,String contactInfo)
	{
		super();
		this.setName(name);
		this.setContactInfo(contactInfo);
	}
public Owner() {
	super();
	this.setType("owner");
}

	public House getOwnedHouse() {
		return ownedHouse;
	}
	


	public void setOwneHouse(House owneHouse) {
		this.ownedHouse = owneHouse;
	}


	


	

	public String getContactInfo() {
		return contactInfo;
	}


	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	

}
