package Day04;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        // SET: Unordered, Duplicates not allowed
        // Duplicates will not be considered

        Set<String> roles = new HashSet<>();
        roles.add("ADMIN");
        roles.add("USER");
        roles.add("MANAGER");

        for(String role : roles) {
            System.out.println("ROLE: " + role);
        }
    }
}
