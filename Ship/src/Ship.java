

public class Ship {
	
	private String name;
	private String year;
	
	public Ship(String name,  String year) 
	{
	this.name = name;
	this.year = year;
	}                               
	                        
	public String getYear()
	{
		return year;
	}
			
    public String getName() 
    { 
    	return name;
    }
   	

		
	@Override
	public String toString() {
	
	return String.format("%s: %s%n%s: %s%n", "Ship Name", getName(), "Year Built",  getYear());
            
	
}

}

