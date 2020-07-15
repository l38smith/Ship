import java.util.*;




public class ShipDemo  {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
	
		String name;
		String year = null;
		String str1 = null;
		
		int passengers;
		int tons;
		DisplayMenu();
		int choice = input.nextInt();
		
		        	
			while (choice != -1)
			
		    {
			   if (choice > 0 && choice < 4)
			   {
			
			   switch (choice )
			   {
			    case 1:
			    
			    input.nextLine();
			   	System.out.println("Enter the name of the ship");
			   	name = input.nextLine();
			   	System.out.println("Enter the year the ship was built");
			   	year = input.nextLine();
				Ship ship1 = new Ship(name, year);
				System.out.println();
				str1 = ship1.toString();
				
					
				
				break;
									
			    case 2:
			    
			    input.nextLine();
			    System.out.println("Enter the name of the ship");
			   	name = input.nextLine();
			   	System.out.println("Enter the year the ship was built");
			   	year = input.nextLine();
			   	System.out.println("Enter the maximum number of passengers");
				passengers = input.nextInt();
				while (passengers <= 0)
				{
				System.out.println(" Passengers must be a positive integer. Please try again.");
				passengers = input.nextInt();
				}
				CruiseShip ship2  = new CruiseShip(name, year, passengers);
				System.out.println();
				str1 = ship2.toString();
				
				
				break;
				
						
			    case 3:
			    
				input.nextLine();
				System.out.println("Enter the name of the ship");
			   	name = input.nextLine();
			   	System.out.println("Enter the year the ship was built");
			   	year = input.nextLine();
			   	System.out.println("Enter the maximum number of tons");
			   	tons = input.nextInt();
			    while (tons <= 0)
				{
				System.out.println(" Tons must be a positive integer. Please try again.");
				tons = input.nextInt();
				}
			    CargoShip ship3 = new CargoShip(name, year, tons);
				System.out.println();
				str1 = ship3.toString();
				
				   
   				break;
				
			   			   
			   }
			   }
	
		   	    else
			    
			    System.out.println("Incorrect entry. Please try again.");
			    DisplayMenu();
		        choice = input.nextInt();
		       }		    			   
		        
			    
			    System.out.println(str1);
			    input.nextLine();
			    
  	           }        
	    
			 
		        public static void DisplayMenu()
		        {
			       	          
			    System.out.println("Enter 1 for a Ship");
			       
			    System.out.println("Enter 2 for a Cruise Ship");   
			       
			    System.out.println("Enter 3 for a Cargo Ship");
			       
			    System.out.println("Enter -1 to exit and display the data you've entered ");
			      
			  }		   	          
         }



					
		
			
				
		
		






		


				
				
					
				
				
				
			
			
			
		

	

		
		
	
		
	

	


	
			
