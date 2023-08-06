package skancom;

import java.util.ArrayList;
import java.util.List;
public class main {
	protected static final List<Person> persons=new ArrayList<Person>(); 
	
	protected static final List<House> Houses=new ArrayList<House>();
	protected static final List<tenant> tenants=new ArrayList<tenant>();
	protected static final List<Owner>owners=new ArrayList<Owner>();
	protected static final List<Furniture>furnit=new ArrayList<Furniture>();
	public static void setPersons() {
		
    Person admin=new Person("admin","Iamadmin","admin");
	Person owner1=new Person("sema","sema123","owner");
	Person owner2=new Person("ahmad","ahmad123","owner");
	Person tenant1=new Person("muna","muna123","tenant");
	persons.add(admin);
	persons.add(owner1);
	persons.add(tenant1 );
	persons.add(owner2 );
	}
	
public static void setHouse() {
	 House h1=new House("photo","rafedia","services","1000$","sema","5th August");
		
		House h2=new House("photo2","fisal street","services2","2000$","sema","6th August");
		h1.setnumbathrooms("2");
		h1.setnumbedrooms("3");
		h1.setnumfloors("1");
		h2.setnumbathrooms("1");
		h2.setnumbedrooms("2");
		h2.setnumfloors("3");
		House h3=new House("photo3","fisal street","services2","2000$","ahmad","10th Septemper");
		Houses.add(h1);
		Houses.add(h2);
		
	
}
public static void setTenant() {
	
	
	tenant tenant11=new tenant("muna","20","Computer Engineering","phone: 0598184653");
	tenants.add(tenant11);
}
public static void setOwner() {
	Owner owner11=new Owner("sema","Phone: 0598213954"); 
	owners.add(owner11);
}


}