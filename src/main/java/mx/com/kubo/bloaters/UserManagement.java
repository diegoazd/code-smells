package mx.com.kubo.bloaters;

import lombok.Builder;

@Builder
public class UserManagement 
{		
	public User login(String user, String password) 
    {
        return UserVerifier.builder().build()
        .login(user, password);
    }

    public User register(String user, String password) 
    {
    	return UserRegister.builder().build()
    	.register(user, password);
    }

    public boolean validateAddress(String street, String numberInt, String numberExt, String postalCode,
                                   String colony, String city, String state, String country) 
    {
        return AddressVerifier.builder().build()
        .validateAddress(Address.builder()
        .street(street)
        .numberInt(numberInt)
        .numberExt(numberExt)
        .postalCode(postalCode)
        .colony(colony)
        .city(city)        
        .state(state)
        .country(country)
        .build());
    }
}
