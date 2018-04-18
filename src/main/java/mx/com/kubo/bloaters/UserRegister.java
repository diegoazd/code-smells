package mx.com.kubo.bloaters;

import static mx.com.kubo.bloaters.Role.USER_ROLE;

import java.util.Map;

import lombok.Builder;

@Builder
public class UserRegister 
{
    public User register(String user, String password) 
    {
    	Map<String, User> users = ServiceUserManagement.builder().build()
    	.findAll();
    	
        if(users.get(user) == null) 
        {
           return new User(user, password, USER_ROLE);
           
        } else {
            throw new RuntimeException("Users cant be registere");
        }
    }
}
