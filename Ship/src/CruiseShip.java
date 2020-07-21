
public class CruiseShip extends Ship {
  private int passengers;
  
  public CruiseShip( String name,  String year, int passengers) 
  {
  super (name, year);
    
  this.passengers = passengers;
  }
  
  public int getPassengers()
  {
   	 return passengers;
  }
   
  
  @Override
  public String toString() 
  {
	  return String.format("%s' "
	  + " %s%n%s: %d", "Cruise", super.toString(),
	  "Maximum Passengers", getPassengers());
       
		                  
  }
}
