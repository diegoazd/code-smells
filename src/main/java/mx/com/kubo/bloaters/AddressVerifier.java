package mx.com.kubo.bloaters;

import lombok.Builder;

@Builder
public class AddressVerifier 
{
    public boolean validateAddress(Address address) 
	{
    	return address.validate();
	}
}
