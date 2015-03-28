
public class Factory {

	public static currency createCurrency (String country){
		
		if(country.equalsIgnoreCase("India"))
			return new Rupee();
		else if(country.equalsIgnoreCase("US"))
			return new Dollar();
		
		return null;
		
		
	}
}
