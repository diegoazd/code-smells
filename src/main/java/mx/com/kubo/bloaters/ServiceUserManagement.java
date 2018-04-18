package mx.com.kubo.bloaters;

import static mx.com.kubo.bloaters.Role.ACCOUNTANT_ROLE;
import static mx.com.kubo.bloaters.Role.ADMIN_ROLE;
import static mx.com.kubo.bloaters.Role.CUSTOMER_SERVICE_ROLE;
import static mx.com.kubo.bloaters.Role.MANAGER_ROLE;
import static mx.com.kubo.bloaters.Role.USER_ROLE;

import java.util.HashMap;
import java.util.Map;

import lombok.Builder;

@Builder
public class ServiceUserManagement 
{
	private Map<String, User> users;
	
    public Map<String, User> findAll() 
    {
    	users = new HashMap<>();
    	
        users
        .put("admin",User.builder()
        .user("admin")
        .password("securePassword")
        .role(ADMIN_ROLE).build());
        
        users
        .put("manager", User.builder()
        .user("manager")
        .password("securePassword")
        .role(MANAGER_ROLE).build());
        
        users
        .put("user", User.builder()
        .user("user")
        .password("securePassword")
        .role(USER_ROLE).build());
        
        users
        .put("accountant", User.builder()
        .user("accountant")
        .password("securePassword")
        .role(ACCOUNTANT_ROLE).build());
        
        users
        .put("customer_service", User.builder()
        .user("customer_service")
        .password("securePassword")
        .role(CUSTOMER_SERVICE_ROLE).build());
        
        return users;
	}
}
