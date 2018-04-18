package mx.com.kubo.bloaters;

import org.junit.Test;

import static org.junit.Assert.*;
import static mx.com.kubo.bloaters.Role.*;

public class UserManagementTest 
{
    @Test
    public void shouldLoginAsAdministrator() {
        User user = UserManagement.builder().build()
        .login("admin", "securePassword");
        assertNotNull(user);
        assertEquals("admin", user.getUser());
        assertEquals(ADMIN_ROLE, user.getRole());
    }

    @Test
    public void shouldLoginAsManager() {
        User user = UserManagement.builder().build()
        .login("manager", "securePassword");
        assertNotNull(user);
        assertEquals("manager", user.getUser());
        assertEquals(MANAGER_ROLE, user.getRole());
    }

    @Test
    public void shouldLoginAsCustomerService() {
        User user = UserManagement.builder().build()
        .login("customer_service", "securePassword");
        assertNotNull(user);
        assertEquals("customer_service", user.getUser());
        assertEquals(CUSTOMER_SERVICE_ROLE, user.getRole());
    }

    @Test
    public void shouldLoginAsAccountant() {
        User user = UserManagement.builder().build()
        .login("accountant", "securePassword");
        assertNotNull(user);
        assertEquals("accountant", user.getUser());
        assertEquals(ACCOUNTANT_ROLE, user.getRole());
    }

    @Test
    public void shouldLoginAsUser() 
    {
        User user = UserManagement.builder().build()
        .login("user", "securePassword");
        assertNotNull(user);
        assertEquals("user", user.getUser());
        assertEquals(USER_ROLE, user.getRole());
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWHenUserNotFound() {
    	UserManagement.builder().build()
    	.login("foo", "securePassword");
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenUserPasswordNotMath() {
    	UserManagement.builder().build()
    	.login("user", "notSecurePassword");
    }

    @Test
    public void shouldRegisterUser() {
        User user = UserManagement.builder().build()
        .register("abcde", "securePassword");
        assertEquals("abcde", user.getUser());
        assertEquals("securePassword", user.getPassword());
        assertEquals(USER_ROLE, user.getRole());
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenRegisterUser() {
    	UserManagement.builder().build()
    	.register("admin", "securePassword");
    }

    @Test
    public void shouldCreateAddress() {
        assertTrue(UserManagement.builder().build()
        .validateAddress("street", "number int", "number int", "" +
                "postal code", "colony", "city", "state", "country"));
    }

}