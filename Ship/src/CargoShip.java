public class CargoShip extends Ship {
	private int tons;
	
	public CargoShip (String name, String year, int tons)
	{
	super (name,  year);
	
	this.tons = tons;
    }
	public int getTons()
	{
		return tons;
	}
		
		
	@Override
	public String toString() {
		return String.format ("%s %s%n%s: %d", "Cargo", super.toString(), 
				"Maximum Tons of Cargo",  getTons());
				             
				                  
	}

    }
	



