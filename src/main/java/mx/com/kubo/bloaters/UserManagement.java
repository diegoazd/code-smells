package mx.com.kubo.bloaters;

import java.util.HashMap;
import java.util.Map;

public class UserManagement {

    public static final int ADMIN_ROLE = 1;
    public static final int MANAGER_ROLE = 2;
    public static final int CUSTOMER_SERVICE_ROLE = 3;
    public static final int ACCOUNTANT_ROLE = 4;
    public static final int USER_ROLE = 5;

    private Map<String, User> users;

    public UserManagement() {
        users = new HashMap<>();
        users.put("admin", new User("admin", "securePassword", ADMIN_ROLE));
        users.put("manager", new User("manager", "securePassword", MANAGER_ROLE));
        users.put("accountant", new User("accountant", "securePassword", ACCOUNTANT_ROLE));
        users.put("user", new User("user", "securePassword", USER_ROLE));
        users.put("customer_service", new User("customer_service", "securePassword", CUSTOMER_SERVICE_ROLE));
    }


    public User login(String user, String password) {
        User loggedUser = users.get(user);

        if(loggedUser != null && verifyUser(password, loggedUser)) {
           return  loggedUser;
        }

        throw new RuntimeException("user not found");
    }

    private boolean verifyUser(String password, User user) {
       return user.getPassword().equals(password);
    }

    public User register(String user, String password) {
        if(users.get(user) == null) {
           return new User(user, password, USER_ROLE);
        }else {
            throw new RuntimeException("Users cant be registere");
        }
    }


    public boolean validateAddress(String street, String numberInt, String numberExt, String postalCode,
                                   String colony, String city, String state, String country) {
        return (street != null || !street.isEmpty()) ||
                (numberInt != null || !numberInt.isEmpty()) ||
                (numberExt != null || !numberExt.isEmpty()) ||
                (postalCode != null || !postalCode.isEmpty()) ||
                (colony != null || !colony.isEmpty()) ||
                (city != null || !city.isEmpty()) ||
                (state != null || !state.isEmpty()) ||
                (country != null || !country.isEmpty());
    }
}
