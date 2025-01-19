package src.java8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class optionalExp {

    public static void main(String[] args) {


        Map<String, String> userRoles = new HashMap<>();
        userRoles.put("Alice", "Admin");
        userRoles.put("Bob", "User");
        userRoles.put("Charlie", "Moderator");

        // Retrieve the role for the user "David" with "Guest" as the default value
        String role = Optional.ofNullable(userRoles.get("David")).orElse("Guest");
        System.out.println("Role for David: " + role);
    }
}