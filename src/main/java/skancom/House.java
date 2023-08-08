package skancom;


import java.util.ArrayList;
import java.util.List;


import java.util.logging.Level;
import java.util.logging.Logger;




public class House {
	private String photo;
	private String location;
	private String services;
	private String monthlyRent;
	private String owner;
	private String idhouse;
	private static int currentId=0;
	private String tenant;
	private String paidTime;
	private String numfloors;
	private String bedrooms;
	private String bathrooms;
	private String contactinfo;
	protected static final List<House> Waitinghouses = new ArrayList<>();
	
	private static final Logger loger = Logger.getLogger(House.class.getSimpleName());
	public House()
	{
		this.idhouse=String.valueOf(++currentId);
	}
	
	public House(String photo, String location, String services, String monthlyRent,String owner,String paidTime) {
		this.photo=photo;
		this.location=location;
		this.services=services;
		this.monthlyRent=monthlyRent;
		this.setOwner(owner);
		this.idhouse=String.valueOf(++currentId);
		this.paidTime=paidTime;
	}
	public House(String id, String owner,String numfloors,String bathrooms,String bedrooms,String location,String monthlyRent) {
		this.location=location;
		this.monthlyRent=monthlyRent;
        this.idhouse=String.valueOf(++currentId);	
		this.numfloors= numfloors;
		this.bathrooms=bathrooms;
		this.bedrooms=bedrooms;
		this.setOwner(owner);
		id =String.valueOf(id);
		
	}
	
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}
	public String getMonthlyRent() {
		return monthlyRent;
	}
	public void setMonthlyRent(String monthlyRent) {
		this.monthlyRent = monthlyRent;
	}
	

	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getTenant() {
		return tenant;
	}

	public void setTenant(String tenant) {
		this.tenant = tenant;
	}
	public void setId(String s)
	{
		this.idhouse=s;
	}

	public String getId() {
		return idhouse;
	}

	public String getPaidTime() {
		return paidTime;
	}
	public void setPaidTime(String Paid) {
		this.paidTime=Paid;
	}

	public boolean isAvailable()
	{   boolean ret;
		if(this.getTenant()==null)
			ret= true;
		else {ret= false;}
		return ret;
	}
	
	public String getnumfloors() {
		return numfloors;
	}
	public void setnumfloors(String numfloors) {
		this.numfloors = numfloors;
	}
	
	
	public String getnumbedrooms() {
		return bedrooms;
	}
	public void setnumbedrooms(String numbedrooms) {
		this.bedrooms = numbedrooms;
	}
	
	
	public String getnumbathrooms() {
		return bathrooms;
	}
	public void setnumbathrooms(String numbathrooms) {
		this.bathrooms = numbathrooms;
	}
	public String getContactinfo() {
		return contactinfo;
	}

	public void setContactinfo(String contactinfo) {
		this.contactinfo = contactinfo;
	}

	public void createHouse(House ex, List<House> waiting) {
		waiting.add(ex);
		
	}
	
	public static int getIndexx(String id, List<House> ex) {
		int index = -1;

		for (int i = 0; i < ex.size(); i++) {
			if (ex.get(i).getId().equalsIgnoreCase(id)) {
				return i;
			}
		}

		return index;
	}

	public static boolean isExistHouse(String id2, List<House> we) {

		return (getIndexx(id2, we) != -1);
	}
	
	public static void updatePhoto(String id2, String newPhoto, List<House> tr) {
		int index = House.getIndexx(id2, tr);
		tr.get(index).setPhoto(newPhoto);

	}
	public static void updateloc(String id22, String newloc, List<House> tr1) {
		int index = House.getIndexx(id22, tr1);
		tr1.get(index).setLocation(newloc);

	}
	
	public static void updateservices(String id11, String newserv, List<House> tr2) {
		int index = House.getIndexx(id11, tr2);
		tr2.get(index).setServices(newserv);

	}
	public static void updaterent(String id10, String newrent, List<House> tr3) {
		int index = House.getIndexx(id10, tr3);
		tr3.get(index).setMonthlyRent(newrent);

	}
	public static void updatecontactinfo(String id15, String newinfo, List<House> tr4) {
		int index = House.getIndexx(id15, tr4);
		tr4.get(index).setContactinfo(newinfo);

	}

	public static boolean checkIsExist1(String code, List <House> cu) {
		
		return (House.getIndexx(code, cu) != -1);
	}
	
	
	

	public static void printHouse(String houseId, List<House> waitingList) {
        boolean found = false;
        for (House house : waitingList) {
            if (house.getId().equalsIgnoreCase(houseId)) {
                found = true;
              
             
                loger.log(Level.SEVERE, () -> "\t\t\t\t\t\t\t\t\t House Attributes for ID:  " +houseId );
              
                loger.log(Level.SEVERE, () -> "\t\t\t\t\t\t\t\t\t ID: " + house.getId());
                loger.log(Level.SEVERE, () -> "\t\t\t\t\t\t\t\t\t Location: " + house.getLocation());
                loger.log(Level.SEVERE, () -> "\t\t\t\t\t\t\t\t\t Services: " + house.getServices());
                loger.log(Level.SEVERE, () -> "\t\t\t\t\t\t\t\t\t Monthly Rent: " + house.getMonthlyRent());
                loger.log(Level.SEVERE, () -> "\t\t\t\t\t\t\t\t\t Owner :  " + house.getOwner());
                loger.log(Level.SEVERE, () -> "\t\t\t\t\t\t\t\t\t photo :  " + house.getPhoto());
                loger.log(Level.SEVERE, () -> "\t\t\t\t\t\t\t\t\t number of floors :  " + house.getnumfloors());
                loger.log(Level.SEVERE, () -> "\t\t\t\t\t\t\t\t\t number of bedrooms :  " + house.getnumbedrooms());
                loger.log(Level.SEVERE, () -> "\t\t\t\t\t\t\t\t\t number of bathrooms : " + house.getnumbathrooms());


                break;
            }
        }

        if (!found) {
            loger.log(Level.SEVERE, () -> "\t\t\t\t\t\t\t\t\t House with ID : %s not found in the waiting list. " + houseId );
        }
    }
	
	  public static void deleteHouseFromWaitingList(String houseId) {
	        for (House house : Waitinghouses) {
	            if (house.getId().equalsIgnoreCase(houseId)) {
	                Waitinghouses.remove(house);
	                return;
	            }
	        }

	        Logger logger = Logger.getLogger(House.class.getSimpleName());
	        logger.log(Level.SEVERE, () -> "\t\t\t\t\t\t\t\t\t House with ID :%s is rejected from the waiting list." + houseId );
	    }
	  
	  public static void transferHouse(String houseId, List<House> sourceList, List<House> destinationList) {
		    // Find the house with the given ID in the sourceList
		    House houseToTransfer = null;
		    for (House house : sourceList) {
		        if (house.getId().equalsIgnoreCase(houseId)) {
		            houseToTransfer = house;
		            break;
		        }
		    }

		    if (houseToTransfer != null) {
		        // Remove the house from the source list and add it to the destination list
		        sourceList.remove(houseToTransfer);
		        destinationList.add(houseToTransfer);
		        loger.log(Level.SEVERE, () -> "\t\t\t\t\t\t\t\t\t House with ID :%s transferred successfully." + houseId);

		    } else {
		        loger.log(Level.SEVERE, () -> "\t\t\t\t\t\t\t\t\t House with ID :%s not found . " + houseId );

		    }
		    }
	  
		
		public static void printallWaitingList() {
	        if (Waitinghouses.isEmpty()) {
	            Logger logger = Logger.getLogger(House.class.getSimpleName());
	            logger.log(Level.SEVERE, () ->  "\t\t\t\t\t\t\t\t\t Waiting list is empty.");
	        } else {
	            int countNonNull = 0;
	            for (House house : Waitinghouses) {
	                if (house != null) {
	                    countNonNull++;
	                    loger.log(Level.SEVERE, () -> "\t\t\t\t\t\t\t\t\t House Attributes :");
	                    loger.log(Level.SEVERE, () -> "\t\t\t\t\t\t\t\t\t ID: " + house.getId());
		                loger.log(Level.SEVERE, () -> "\t\t\t\t\t\t\t\t\t Services: " + house.getServices());
		                loger.log(Level.SEVERE, () -> "\t\t\t\t\t\t\t\t\t Location: " + house.getLocation());
		                loger.log(Level.SEVERE, () -> "\t\t\t\t\t\t\t\t\t Monthly Rent: " + house.getMonthlyRent());
	              
	                
	                }
	            }

	            if (countNonNull == 0) {
	                Logger logger = Logger.getLogger(House.class.getSimpleName());
	                logger.log(Level.SEVERE, () -> "\t\t\t\t\t\t\t\t\t Waiting list contains only null elements.");
	            }
	        }
	    }
		
		
			
			
			public static void printHousesByOwner(String ownerName, List<House> houseList) {
		        boolean foundOwner = false;
		        Logger loger = Logger.getLogger(House.class.getSimpleName());

		        for (House house : houseList) {
		            if (house != null && house.getOwner().equals(ownerName)) {
		                foundOwner = true;
		                loger.log(Level.SEVERE, () -> "\t\t\t\t\t\t\t\t\t House Attributes for Owner: " + ownerName);
	                    loger.log(Level.SEVERE, () ->  "\t\t\t\t\t\t\t\t\t ID: " + house.getId());

		                loger.log(Level.SEVERE, () -> "\t\t\t\t\t\t\t\t\t number of floors:" + house.getnumfloors());
		                loger.log(Level.SEVERE, () -> "\t\t\t\t\t\t\t\t\t number of bathrooms: " + house.getnumbathrooms());
		                loger.log(Level.SEVERE, () -> "\t\t\t\t\t\t\t\t\t number of bedrooms: " + house.getnumbedrooms());
		                loger.log(Level.SEVERE, () -> "\t\t\t\t\t\t\t\t\t number of locations: " + house.getLocation());

		            }
		        }

		        if (!foundOwner) {
		            loger.log(Level.SEVERE, () -> "\t\t\t\t\t\t\t\t\t No houses found for owner:%s " + ownerName);
		        }
		    }

			
			
			
		
			
		
		
	
}