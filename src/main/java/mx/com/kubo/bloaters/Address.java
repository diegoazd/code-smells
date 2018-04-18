package mx.com.kubo.bloaters;

import lombok.Builder;

@Builder
public class Address 
{
	private String street;
	private String numberInt;
	private String numberExt; 
	private String postalCode;
	private String colony; 
	private String city;
	private String state; 
	private String country;
	
	public boolean validate()
	{
		return
		(street != null || !street.isEmpty()) ||
		(numberInt != null || !numberInt.isEmpty()) ||
		(numberExt != null || !numberExt.isEmpty()) ||
		(postalCode != null || !postalCode.isEmpty()) ||
		(colony != null || !colony.isEmpty()) ||
		(city != null || !city.isEmpty()) ||
		(state != null || !state.isEmpty()) ||
		(country != null || !country.isEmpty());
	}
}
