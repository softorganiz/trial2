package skancom;

import skancom.Person;
public class tenant extends Person{
	private String age;
	private String major;

	private String contactInfo;
	
	public tenant(String name,String age, String major,String contactInfo) {
		super();
		this.setName(name);
		this.age=age;
		this.major=major;
		this.contactInfo=contactInfo;
	}

	public tenant()
	{
		super();
		this.setType("tenant");
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	public static int findByName(String name) {
		int s=0;
		for(int i=0;i<main.tenants.size();i++)
		{
			if(main.tenants.get(i).getName().equals(name))
				 s=i;
		}
		return s;
		
	}
	

}
