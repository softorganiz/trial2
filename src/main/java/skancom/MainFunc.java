package skancom;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
public class MainFunc {
	static Person user =new Person();

	public static void main(String[] args) {

		
		int x;
		int y;
		String in;
		
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String id;
		String name;
		String password;
		int logged = 0;/*flag*/
		String stat;/*type*/
		Logger logger = Logger.getLogger(MainFunc.class.getSimpleName());
		
		Main.setPersons();
		Main.setHouse();
		Main.setOwner();
		Main.setTenant();

		logger.log(Level.INFO,String.format("\n"));

		logger.log(Level.INFO,
				String.format("|\t\t\t\t\t\t\t\t\t\t\t\t\tWelcome to  skancom foundation\t\t\t\t\t\t\t\t\t\t\t\t|"));
		logger.log(Level.INFO,String.format("\n"));

		while (logged == 0) {
			logger.log(Level.INFO,String.format("")); 
			logger.log(Level.INFO, String.format("|\t\t\t\t\t\t\t\t\t\t\t\tEnter your username\t\t\t\t\t\t\t\t\t\t\t\t\t|"));
			logger.log(Level.INFO,String.format(
					"|_______________________________________________________________________________________________________________________________|"));
			
			name = input.nextLine();
			logger.log(Level.INFO, String.format("|\t\t\t\t\t\t\t\t\t\t\t\tEnter your password\t\t\t\t\t\t\t\t\t\t\t\t\t|"));
			password = input.nextLine();
		   
			stat = Admin.login(name, password,Main.persons);
			if (stat.equals("false")) {
				logged = 0;
				logger.log(Level.INFO,
						String.format("|\t\t\t\t\t\t\t\t\t\t\t\tLogin faild\t\t\t\t\t\t\t\t\t\t\t\t|"));

			} else {
				logged = 1;
				user = Main.persons.get(Person.getIndex(name, Main.persons));
				
				logger.log(Level.INFO,String.format(
						"|______________________________________________________________________________________________________________________________|"));
				logger.log(Level.INFO,
						String.format("|\t\t\t\t\t\t\t\t\t\t\t\t Welcome Back %s ",user.getName()));
				logger.log(Level.INFO, "\n");
				logger.log(Level.INFO, "\n");
				logger.log(Level.INFO, "\n");
			}
			if (stat.equalsIgnoreCase("owner")) {
				while (logged == 1) {
					logger.log(Level.INFO,String.format( "|\t\t\t\t\t\t\t\t\t press 1. To add new house\t\t\t\t\t\t\t\t\t\t\t\t\t|"));
					logger.log(Level.INFO,String.format( "|\t\t\t\t\t\t\t\t\t       2. To update puplished info\t\t\t\t\t\t\t\t\t\t\t\t\t|"));
					logger.log(Level.INFO,String.format("|\t\t\t\t\t\t\t\t\t       3. To update unpuplished info\t\t\t\t\t\t\t\t\t\t\t\t\t|"));
					logger.log(Level.INFO,String.format( "|\t\t\t\t\t\t\t\t\t       4. To view your published housing\t\t\t\t\t\t\t\t\t\t\t\t\t|"));
					logger.log(Level.INFO,String.format( "|\t\t\t\t\t\t\t\t\t       5. To view your unpublished housing\t\t\t\t\t\t\t\t\t\t\t\t\t|"));
					logger.log(Level.INFO,String.format( "|\t\t\t\t\t\t\t\t\t       6. To view your booked housing\t\t\t\t\t\t\t\t\t\t\t\t\t|"));
					logger.log(Level.INFO,String.format( "|\t\t\t\t\t\t\t\t\t       0. log out\t\t\t\t\t\t\t\t\t\t\t\t\t|"));
					x = input.nextInt();
					
					if (x == 1) {

						House ex=new House();
					
						logger.log(Level.INFO,String.format( "|\t\t\t\t\t\t\t\t\t Enter Information for house ID : %s ", ex.getId()));

							ex.setOwner(name);

							
							logger.log(Level.INFO,String.format( "\t\t\t\t\t\t\t\t\t Location"));
							in = input.nextLine();
							ex.setLocation(in);

							logger.log(Level.INFO,String.format( "\t\t\t\t\t\t\t\t\t number of floors"));
							in = input.nextLine();
							ex.setnumfloors(in);

							logger.log(Level.INFO,String.format( "\t\t\t\t\t\t\t\t\t number of bedrooms"));
							in = input.nextLine();
							ex.setnumbedrooms(in);

							logger.log(Level.INFO,String.format( "\t\t\t\t\t\t\t\t\t number of bathrooms"));
							in = input.nextLine();
							ex.setnumbathrooms(in);
							
							logger.log(Level.INFO, String.format("\t\t\t\t\t\t\t\t\t number of monthlyrent"));
							in = input.nextLine();
							ex.setMonthlyRent(in);
							
							logger.log(Level.INFO,String.format( "\t\t\t\t\t\t\t\t\t available services"));
							in = input.nextLine();
							ex.setServices(in);
							
							ex.createHouse(ex, House.Waitinghouses);
							logger.log(Level.INFO, String.format("\t\t\t\t\t\t\t\t\t\t  Added successfully to the waiting list"));

				

					}
					
					else if (x == 2 || x == 3) {
						List <House> testt = new ArrayList<>();
						if (x== 2) {testt = Main.Houses;}  
						else {testt = House.Waitinghouses;}
						logger.log(Level.INFO,String.format( "|\t\t\t\t\t\t\t\t\t press 1. To update the photo \t\t\t\t\t\t\t\t\t\t\t\t\t|"));
						logger.log(Level.INFO,String.format("|\t\t\t\t\t\t\t\t\t       2. To update the location \t\t\t\t\t\t\t\t\t\t\t\t\t|"));
						logger.log(Level.INFO,String.format("|\t\t\t\t\t\t\t\t\t       3. To update the available services \t\t\t\t\t\t\t\t\t\t\t\t\t|"));
						logger.log(Level.INFO,String.format( "|\t\t\t\t\t\t\t\t\t       4. To update the monthlyrent \t\t\t\t\t\t\t\t\t\t\t\t\t|"));
						logger.log(Level.INFO,String.format( "|\t\t\t\t\t\t\t\t\t       5. To update the contact information \t\t\t\t\t\t\t\t\t\t\t\t\t|"));
						String Id;
						x = input.nextInt();
						
						if (x == 1) {
								logger.log(Level.INFO,String.format( "\t\t\t\t\t\t\t\t\t What house id do you want to update"));
						
						
							Id = input.nextLine();
							if (!House.checkIsExist1(Id, testt)) {
							logger.log(Level.INFO, String.format("\t\t\t\t\t\t\t\t\t No house with this id"));
							logger.log(Level.INFO, String.format("\n"));
							logger.log(Level.INFO, String.format("\n"));
						} else {
								logger.log(Level.INFO,String.format( "\t\t\t\t\t\t\t\t\t new photo: "));
								in = input.nextLine();
								House.updatePhoto(Id, in,testt );
								logger.log(Level.INFO,String.format( "\t\t\t\t\t\t\t\t\t Update photo successfully"));
							}
						}
						else if(x == 2) {
							
							logger.log(Level.INFO,String.format( "\t\t\t\t\t\t\t\t\t What house id do you want to update"));
						Id = input.nextLine();
					

						if (!House.isExistHouse(Id,testt)) {
						logger.log(Level.INFO, String.format("\t\t\t\t\t\t\t\t\t No house with this id"));
						logger.log(Level.INFO, String.format("\n"));
						logger.log(Level.INFO, String.format("\n"));
					} else {
							logger.log(Level.INFO, String.format("\t\t\t\t\t\t\t\t\t new location: "));
							in = input.nextLine();
							House.updateloc(Id,in, testt);
							logger.log(Level.INFO,String.format( "\t\t\t\t\t\t\t\t\t Update Location successfully"));
						}
					}
						else if(x == 3) {
							
							logger.log(Level.INFO, String.format("\t\t\t\t\t\t\t\t\t What house id do you want to update"));
						Id = input.nextLine();
					
					
						if (!House.isExistHouse(Id, testt)) {
							logger.log(Level.INFO,String.format( "\t\t\t\t\t\t\t\t\t No house with this id"));
						logger.log(Level.INFO, String.format("\n"));
						logger.log(Level.INFO, String.format("\n"));
					} else {
							logger.log(Level.INFO, String.format("\t\t\t\t\t\t\t\t\t new available services: "));
							in = input.nextLine();
							House.updateservices(Id, in, testt);
							logger.log(Level.INFO, String.format("\t\t\t\t\t\t\t\t\t Update services successfully"));
						}
					}
                        else if(x == 4) {
							
							logger.log(Level.INFO,String.format( "\t\t\t\t\t\t\t\t\t What house id do you want to update"));
						Id = input.nextLine();	
					

						if (!House.isExistHouse(Id, testt)) {
							logger.log(Level.INFO,String.format( "\t\t\t\t\t\t\t\t\t No house with this id"));
						logger.log(Level.INFO, "\n");
						logger.log(Level.INFO, "\n");
					} else {
							logger.log(Level.INFO, String.format("\t\t\t\t\t\t\t\t\t new monthlyrent: "));
							in = input.nextLine();
							House.updaterent(Id, in, testt);
							logger.log(Level.INFO,String.format( "\t\t\t\t\t\t\t\t\t Update monthlyrent successfully"));
						}
					}
						
                        else if(x == 5) {
							
							logger.log(Level.INFO,String.format( "\t\t\t\t\t\t\t\t\t What house id do you want to update"));
						Id = input.nextLine();	
					

						if (!House.isExistHouse(Id, testt)) {
							logger.log(Level.INFO,String.format( "\t\t\t\t\t\t\t\t\t No house with this id"));
						logger.log(Level.INFO,String.format("\n"));
						logger.log(Level.INFO,String.format("\n"));
					} else {
							logger.log(Level.INFO, String.format("\t\t\t\t\t\t\t\t\t new contact info: "));
							in = input.nextLine();
							House.updatecontactinfo(Id, in, testt);
							logger.log(Level.INFO,String.format( "\t\t\t\t\t\t\t\t\t Update contact info successfully"));
						}
					}
						
						
					}

					else if (x==4 || x==5) { //done
						
						if (x == 4) {

						House.printHousesByOwner(name,Main.Houses);}  
						else if (x ==5 ) { 
							House.printHousesByOwner(name,House.Waitinghouses);
							}
						}
				
					else if(x == 6){
						for(int i=0;i<Main.Houses.size();i++) {
							if(Main.Houses.get(i).getTenant()!=null&&Main.Houses.get(i).getOwner().equals(name))
							{
								logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\tId:"+Main.Houses.get(i).getId());
								logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\tLocation:"+Main.Houses.get(i).getLocation());
								logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\tMonthly rent:"+Main.Houses.get(i).getMonthlyRent());
								logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\tServices:"+Main.Houses.get(i).getServices());
								logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\tTenant:"+Main.Houses.get(i).getTenant());}
							
							}
					} 
					else if(x==0) {
						logged=0;
					}
					else {
							logger.log(Level.INFO, String.format("Enter valid number"));
							logger.log(Level.INFO,String.format("\n"));
						}	
					
				}}
			if (stat.equalsIgnoreCase("tenant")) {
				while (logged == 1) {
					logger.log(Level.INFO, String.format("\t\t\t\t\t\t\t\t\tTo see the available housing enter 1"));
					logger.log(Level.INFO, String.format("\t\t\t\t\t\t\t\t\tIo advertise your own used furniture for sale enter2"));
					logger.log(Level.INFO, String.format("\t\t\t\t\t\t\t\t\tEnter 0 to log out"));
					
					x = input.nextInt();
					if (x == 1) {
						for(int i=0;i<Main.Houses.size();i++) {
						if(Main.Houses.get(i).getTenant()==null)
						{
							logger.log(Level.INFO,String.format("House %s", Main.Houses.get(i).getId()));
							
						}}
						
						logger.log(Level.INFO,String.format("\t\t\t\t\t\t\t\t\tenter the House id to show more information"));
						id=input.next();
						for(int i=0;i<Main.Houses.size();i++) {
							if(Main.Houses.get(i).getId().equals(id)) {
								logger.log(Level.INFO,String.format("\t\t\t\t\t\t\t\t\t Photo: %s" ,Main.Houses.get(i).getPhoto()));
								logger.log(Level.INFO,String.format("\t\t\t\t\t\t\t\t\t Location: %s" ,Main.Houses.get(i).getLocation()));
								logger.log(Level.INFO,String.format("\t\t\t\t\t\t\t\t\t Monthly rent:%s" ,Main.Houses.get(i).getMonthlyRent()));
								logger.log(Level.INFO,String.format("\t\t\t\t\t\t\t\t\t Services: %s" ,Main.Houses.get(i).getServices()));
								logger.log(Level.INFO,String.format("\t\t\t\t\t\t\t\t\t Bedrooms number: %s" ,Main.Houses.get(i).getnumbedrooms()));
								logger.log(Level.INFO,String.format("\t\t\t\t\t\t\t\t\t Floors : %s" ,Main.Houses.get(i).getnumfloors()));
								logger.log(Level.INFO,String.format("\t\t\t\t\t\t\t\t\t bathrooms: %s" ,Main.Houses.get(i).getnumbathrooms()));
							
							logger.log(Level.INFO,String.format( "\t\t\t\t\t\t\t\t\tTo book this house enter 1"));
							logger.log(Level.INFO,String.format( "t\t\t\t\t\t\t\t\t\tTo go back inter 2"));
							y=input.nextInt();
							if(y==1)
							{
							Main.Houses.get(i).setTenant(name);
							logger.log(Level.INFO,String.format( "\t\t\t\t\t\t\t\t\tyou booked the house successfully"));
							for(int j=0;j<Main.tenants.size();j++) {
								if(Main.tenants.get(j).getName().equals(name))	{
								
									logger.log(Level.INFO,String.format("\t\t\t\t\t\t\t\t\tyour name is:%s ",Main.tenants.get(j).getName()));
									logger.log(Level.INFO,String.format("\t\t\t\t\t\t\t\t\tyour age is: %s " ,Main.tenants.get(j).getAge()));
									logger.log(Level.INFO,String.format("\t\t\t\t\t\t\t\t\tyour major is: %s ",Main.tenants.get(j).getMajor()));
								
								}
							}
							
								
							
							for(int s=0;s<Main.Houses.size();s++) {
								if(Main.Houses.get(s).getTenant().equals(name)) {
									logger.log(Level.INFO,String.format("\t\t\t\t\t\t\t\t\tpaid time:%s ",Main.Houses.get(s).getPaidTime()));	
								}
							}
							for(int t=0;t<Main.Houses.size();t++) {
								if(Main.Houses.get(t).getId().equals(id)) {
									logger.log(Level.INFO,String.format("\t\t\t\t\t\t\t\ttthe owner name is: %s ",Main.Houses.get(t).getOwner()));
									int s=Tenant.findByName(Main.Houses.get(t).getOwner());
									logger.log(Level.INFO,String.format("\t\t\t\t\t\t\t\t\tthe owner Phone number is:%s  " ,Main.owners.get(s).getContactInfo()));
								}
									
								}
							}
							
				
							
							
							}
						}
					
					}
					else if(x==2)
					{
						logger.log(Level.INFO,String.format("\t\t\t\t\t\t\t\t\twrite a description about your furniture"));
						String desc=input.next();
						logger.log(Level.INFO,String.format("enter the price"));
						String price=input.next();
						Furniture f=new Furniture(desc,price,name);
						Main.furnit.add(f);
						logger.log(Level.INFO,String.format("\t\t\t\t\t\t\t\t\t you advertise your own used furniture for sale successfully"));
					}
					else if(x==0) {
						logged=0;
					}
					else {
							logger.log(Level.INFO,String.format("enter valid number"));
							logger.log(Level.INFO,String.format( "\n"));
						}	
					
				}
				
				
			}
			else if(stat.equalsIgnoreCase("admin")) {
				while (logged == 1) {
					logger.log(Level.INFO,  String.format("|\t\t\t\t\t\t\t\t\t press 1. To watch all reservation\t\t\t\t\t\t\t\t\t\t\t\t\t|"));
					logger.log(Level.INFO,  String.format("|\t\t\t\t\t\t\t\t\t       2. To show housing on the waiting list for your acceptance :) \t\t\t\t\t\t\t\t\t\t\t\t\t|"));
					logger.log(Level.INFO,  String.format("|\t\t\t\t\t\t\t\t\t       0. log out\t\t\t\t\t\t\t\t\t\t\t\t\t|"));

					x = input.nextInt();
					
					if(x==1) {
						for(int i=0;i<Main.Houses.size();i++) {
						if(Main.Houses.get(i).getTenant()!=null)
						{
							logger.log(Level.INFO, String.format("\t\t\t\t\t\t\t\t\tId: %s",Main.Houses.get(i).getId()));
							logger.log(Level.INFO, String.format("\t\t\t\t\t\t\t\t\tLocation: %s" ,Main.Houses.get(i).getLocation()));
							logger.log(Level.INFO, String.format("\t\t\t\t\t\t\t\t\tMonthly rent: %s",Main.Houses.get(i).getMonthlyRent()));
							logger.log(Level.INFO, String.format("\t\t\t\t\t\t\t\t\tServices: %s" ,Main.Houses.get(i).getServices()));
							logger.log(Level.INFO, String.format("\t\t\t\t\t\t\t\t\tTenant: %s" ,Main.Houses.get(i).getTenant()));
						}}
					}

					else if (x==2) {
						House.printallWaitingList();
					
						String Id;
						logger.log(Level.INFO, String.format( "\t\t\t\t\t\t\t\t\t What house id do you want to show?"));
						Id = input.nextLine();	Id = input.nextLine();
					

						if (!House.isExistHouse(Id, House.Waitinghouses)) {
							logger.log(Level.INFO, String.format( "\t\t\t\t\t\t\t\t\t No house with this id"));
						logger.log(Level.INFO, String.format( "\n"));
						logger.log(Level.INFO,  String.format("\n"));
					} else {
					House.printHouse(Id,House.Waitinghouses);
					int r;
					logger.log(Level.INFO, String.format( "\t\t\t\t\t\t\t\t\t if you want to accept click 1, to reject click 2"));
					r = input.nextInt();
					if (r== 1) {
						 House.transferHouse(Id, House.Waitinghouses, Main.Houses);
						
					}else {
						logger.log(Level.INFO, String.format( "\t\t\t\t\t\t\t\t\t House is rejected !!"));
						House.deleteHouseFromWaitingList(Id);
					}

					}
					
						
						}else if (x ==0) { logged =0; 
						}
						
						
				}}

}}}