package skancom;

import java.util.Scanner;
import java.util.logging.*;
import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
public class mainFunc {
	static Person user =new Person();

	public static void main(String[] args) {

		
		int x,y;
		
		String in;
		
		
		Scanner input = new Scanner(System.in);
		String id;
		String name;
		String password;
		int logged = 0;/*flag*/
		String stat;/*type*/
		Logger logger = Logger.getLogger(mainFunc.class.getSimpleName());
		
		main.setPersons();
		main.setHouse();
		main.setOwner();
		main.setTenant();

		logger.log(Level.INFO, "\n");

		logger.log(Level.INFO,
				"|\t\t\t\t\t\t\t\t\t\t\t\t\tWelcome to  skancom foundation\t\t\t\t\t\t\t\t\t\t\t\t|");
		logger.log(Level.INFO, "\n");

		while (logged == 0) {
			logger.log(Level.INFO, ""); 
			logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t\t\t\tEnter your username\t\t\t\t\t\t\t\t\t\t\t\t\t|");
			logger.log(Level.INFO,
					"|_______________________________________________________________________________________________________________________________|");
			//name=null;
			name = input.nextLine();
			logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t\t\t\tEnter your password\t\t\t\t\t\t\t\t\t\t\t\t\t|");
			password = input.nextLine();
		   
			stat = Admin.login(name, password,main.persons);
			if (stat.equals("false")) {
				logged = 0;
				logger.log(Level.INFO,
						"|\t\t\t\t\t\t\t\t\t\t\t\tLogin faild\t\t\t\t\t\t\t\t\t\t\t\t|");

			} else {
				logged = 1;
				user = main.persons.get(Person.getIndex(name, main.persons));
				
				logger.log(Level.INFO,
						"|______________________________________________________________________________________________________________________________|");
				logger.log(Level.INFO,
						"|\t\t\t\t\t\t\t\t\t\t\t\t Welcome Back "+user.getName()+"                                              |");
				logger.log(Level.INFO, "\n");
				logger.log(Level.INFO, "\n");
				logger.log(Level.INFO, "\n");
			}
			if (stat.equalsIgnoreCase("owner")) {
				while (logged == 1) {
					logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t press 1. To add new house\t\t\t\t\t\t\t\t\t\t\t\t\t|");
					logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t       2. To update puplished info\t\t\t\t\t\t\t\t\t\t\t\t\t|");
					logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t       3. To update unpuplished info\t\t\t\t\t\t\t\t\t\t\t\t\t|");
					logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t       4. To view your published housing\t\t\t\t\t\t\t\t\t\t\t\t\t|");
					logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t       5. To view your unpublished housing\t\t\t\t\t\t\t\t\t\t\t\t\t|");
					logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t       6. To view your booked housing\t\t\t\t\t\t\t\t\t\t\t\t\t|");
					logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t       0. log out\t\t\t\t\t\t\t\t\t\t\t\t\t|");
					x = input.nextInt();
					
					if (x == 1) {

						House ex=new House();
					
						//ex.setid();
						//in = input.nextLine();
						logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t Enter Information for house ID : "+ ex.getId());
//						in = input.nextLine();
//						if (House.isExistHouse(in , House.Waitinghouses )) {
//							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t this Id already exist");
//							logger.log(Level.INFO, "\n");
	//				} else {
							ex.setOwner(name);
//							ex.setid();
							
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t Location");
							in = input.nextLine();in = input.nextLine();
							ex.setLocation(in);

							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t number of floors");
							in = input.nextLine();
							ex.setnumfloors(in);

							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t number of bedrooms");
							in = input.nextLine();
							ex.setnumbedrooms(in);

							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t number of bathrooms");
							in = input.nextLine();
							ex.setnumbathrooms(in);
							
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t number of monthlyrent");
							in = input.nextLine();
							ex.setMonthlyRent(in);
							
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t available services");
							in = input.nextLine();
							ex.setServices(in);;
							
							ex.createHouse(ex, House.Waitinghouses);
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t\t  Added successfully to the waiting list");

					//	}

					}
					
					else if (x == 2 || x == 3) {
						List <House> testt = new ArrayList<House>();
						if (x== 2) {testt = main.Houses;}  
						else {testt = House.Waitinghouses;}
						logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t press 1. To update the photo \t\t\t\t\t\t\t\t\t\t\t\t\t|");
						logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t       2. To update the location \t\t\t\t\t\t\t\t\t\t\t\t\t|");
						logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t       3. To update the available services \t\t\t\t\t\t\t\t\t\t\t\t\t|");
						logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t       4. To update the monthlyrent \t\t\t\t\t\t\t\t\t\t\t\t\t|");
						//logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t       5. To update the contact information \t\t\t\t\t\t\t\t\t\t\t\t\t|");
						String Id;
						x = input.nextInt();
						//x = input.nextInt();
						if (x == 1) {
								logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t What house id do you want to update");
							Id = input.nextLine();
						
							Id = input.nextLine();
							if (!House.checkIsExist1(Id, testt)) {
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t No house with this id");
							logger.log(Level.INFO, "\n");
							logger.log(Level.INFO, "\n");
						} else {
								logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t new photo: ");
								in = input.nextLine();
								House.updatePhoto(Id, in,testt );
								logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t Update photo successfully");
							}
						}
						else if(x == 2) {
							
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t What house id do you want to update");
						Id = input.nextLine();
						Id = input.nextLine();

						if (!House.isExistHouse(Id,testt)) {
						logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t No house with this id");
						logger.log(Level.INFO, "\n");
						logger.log(Level.INFO, "\n");
					} else {
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t new location: ");
							in = input.nextLine();
							House.updateloc(Id,in, testt);
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t Update Location successfully");
						}
					}
						else if(x == 3) {
							
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t What house id do you want to update");
						Id = input.nextLine();
					
						Id = input.nextLine();
						if (!House.isExistHouse(Id, testt)) {
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t No house with this id");
						logger.log(Level.INFO, "\n");
						logger.log(Level.INFO, "\n");
					} else {
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t new available services: ");
							in = input.nextLine();
							House.updateservices(Id, in, testt);
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t Update services successfully");
						}
					}
                        else if(x == 4) {
							
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t What house id do you want to update");
						Id = input.nextLine();	Id = input.nextLine();
					

						if (!House.isExistHouse(Id, testt)) {
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t No house with this id");
						logger.log(Level.INFO, "\n");
						logger.log(Level.INFO, "\n");
					} else {
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t new monthlyrent: ");
							in = input.nextLine();
							House.updaterent(Id, in, testt);
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t Update monthlyrent successfully");
						}
					}
						
//                        else if(x == 5) {
//							
//							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t What house id do you want to update");
//						Id = input.nextLine();	Id = input.nextLine();
//					
//
//						if (!House.isExistHouse(Id, testt)) {
//							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t No house with this id");
//						logger.log(Level.INFO, "\n");
//						logger.log(Level.INFO, "\n");
//					} else {
//							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t new contact info: ");
//							in = input.nextLine();
//							House.updatecontactinfo(Id, in, testt);
//							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t Update contact info successfully");
//						}
//					}
//						
						
					}

					else if (x==4 || x==5) { //done
						
						if (x == 4) {

						House.printHousesByOwner(name,main.Houses);}  
						else if (x ==5 ) { 
							House.printHousesByOwner(name,House.Waitinghouses);
							}
						}
				
					else if(x == 6){} //book accomodation for the owner 
					else if(x==0) {
						logged=0;
					}
					else {
							logger.log(Level.INFO, "Enter valid number");
							logger.log(Level.INFO, "\n");
						}	
					
				}}
			if (stat.equalsIgnoreCase("tenant")) {
				while (logged == 1) {
					logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\tTo see the available housing enter 1");
					logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\tIo advertise your own used furniture for sale enter2");
					logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\tEnter 0 to log out");
					
					x = input.nextInt();
					if (x == 1) {
						for(int i=0;i<main.Houses.size();i++) {
						if(main.Houses.get(i).getTenant()==null)
						{
							logger.log(Level.INFO,"House"+main.Houses.get(i).getId());
							
						}}
						
						logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\tenter the House id to show more information");
						id=input.next();
						for(int i=0;i<main.Houses.size();i++) {
							if(main.Houses.get(i).getId().equals(id)) {
								logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\t Photo:"+main.Houses.get(i).getPhoto());
								logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\t Location:"+main.Houses.get(i).getLocation());
								logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\t Monthly rent:"+main.Houses.get(i).getMonthlyRent());
								logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\t Services:"+main.Houses.get(i).getServices());
								logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\t Bedrooms number:"+main.Houses.get(i).getnumbedrooms());
								logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\t Floors:"+main.Houses.get(i).getnumfloors());
								logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\t bathrooms:"+main.Houses.get(i).getnumbathrooms());
							
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\tTo book this house enter 1");
							logger.log(Level.INFO, "t\t\t\t\t\t\t\t\t\tTo go back inter 2");
							y=input.nextInt();
							if(y==1)
							{
							main.Houses.get(i).setTenant(name);
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\tyou booked the house successfully");
							for(int j=0;j<main.tenants.size();j++) {
								if(main.tenants.get(j).getName().equals(name))	{
								
									logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\tyour name is: "+main.tenants.get(j).getName());
									logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\tyour age is: "+main.tenants.get(j).getAge());
									logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\tyour major is: "+main.tenants.get(j).getMajor());
								
								}
							}
							
								
							
							for(int s=0;s<main.Houses.size();s++) {
								if(main.Houses.get(s).getTenant()==name) {
									logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\tpaid time: "+main.Houses.get(s).getPaidTime());	
								}
							}
							for(int t=0;t<main.Houses.size();t++) {
								if(main.Houses.get(t).getId().equals(id)) {
									logger.log(Level.INFO,"\t\t\t\t\t\t\t\ttthe owner name is:  "+main.Houses.get(t).getOwner());
									int s=tenant.findByName(main.Houses.get(t).getOwner());
									logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\tthe owner Phone number is:  "+main.owners.get(s).getContactInfo());
								}
									
								}
							}
							
				
							
							
							}
						}
					
					}
					else if(x==2)
					{
						logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\twrite a description about your furniture");
						String desc=input.next();
						logger.log(Level.INFO,"enter the price");
						String price=input.next();
						Furniture f=new Furniture(desc,price,name);
						main.furnit.add(f);
						logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\t you advertise your own used furniture for sale successfully");
					}
					else if(x==0) {
						logged=0;
					}
					else {
							logger.log(Level.INFO,"enter valid number");
							logger.log(Level.INFO, "\n");
						}	
					
				}
				
				
			}
			else if(stat.equalsIgnoreCase("admin")) {
				while (logged == 1) {
					logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t press 1. To watch all reservation\t\t\t\t\t\t\t\t\t\t\t\t\t|");
					logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t       2. To show housing on the waiting list for your acceptance :) \t\t\t\t\t\t\t\t\t\t\t\t\t|");
					logger.log(Level.INFO, "|\t\t\t\t\t\t\t\t\t       0. log out\t\t\t\t\t\t\t\t\t\t\t\t\t|");

					x = input.nextInt();
					
					if(x==1) {
						for(int i=0;i<main.Houses.size();i++) {
						if(main.Houses.get(i).getTenant()!=null)
						{
							logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\tId:"+main.Houses.get(i).getId());
							logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\tLocation:"+main.Houses.get(i).getLocation());
							logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\tMonthly rent:"+main.Houses.get(i).getMonthlyRent());
							logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\tServices:"+main.Houses.get(i).getServices());
							logger.log(Level.INFO,"\t\t\t\t\t\t\t\t\tTenant:"+main.Houses.get(i).getTenant());
						}}
					}

					else if (x==2) {
						House.printallWaitingList();
					
						String Id;
						logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t What house id do you want to show?");
						Id = input.nextLine();	Id = input.nextLine();
					

						if (!House.isExistHouse(Id, House.Waitinghouses)) {
							logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t No house with this id");
						logger.log(Level.INFO, "\n");
						logger.log(Level.INFO, "\n");
					} else {
					House.printHouse(Id,House.Waitinghouses);
					int r;
					logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t if you want to accept click 1, to reject click 2");
					r = input.nextInt();
					if (r== 1) {
						 House.transferHouse(Id, House.Waitinghouses, main.Houses);
						
					}else {
						logger.log(Level.INFO, "\t\t\t\t\t\t\t\t\t House is rejected !!");
						House.deleteHouseFromWaitingList(Id);
					}

					}
					
						
						}else if (x ==0) { logged =0; 
						}
						
						
				}}

}}}