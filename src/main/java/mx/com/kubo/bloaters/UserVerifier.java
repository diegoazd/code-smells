package mx.com.kubo.bloaters;

import lombok.Builder;

@Builder
public class UserVerifier 
{
	public User login(String user, String password) 
    {        
        User loggedUser = ServiceUserManagement.builder().build()
        .findAll()
        .get(user);

        if(loggedUser != null && verifyUser(password, loggedUser)) 
        {
           return loggedUser;
        }

        throw new RuntimeException("user not found");
    }
	
    private boolean verifyUser(String password, User user) 
    {
       return user.getPassword().equals(password);
    }
}
