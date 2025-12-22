package Project;

import java.util.*;

public class UserManagementDemo {
    public static void main(String[] args) {

//        Set<String> user1Roles = new HashSet<>(Arrays.asList("ADMIN", "USER"));
//        User user1 = new User("Alice", true, user1Roles);

        // TRIM DOWN THE 4 LINES TO 2 LINES

        List<User> users = new ArrayList<>();
        users.add(new User("Alice", true, new HashSet<>(Arrays.asList("ADMIN", "USER"))));

        users.add(new User("Bob", false, new HashSet<>(Arrays.asList("USER"))));

        users.add(new User("Charlie", true, new HashSet<>(Arrays.asList("MANAGER"))));

        // REMOVE INACTIVE USERS
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            if(!iterator.next().isActive())
                iterator.remove();
        }

        System.out.println("ACTIVE USERS");
        for(User user : users) {
            System.out.println(user.getUser());
        }

        // COUNT USERS PER ROLE
        Map<String, Integer> roleCount = new HashMap<>();
        for(User user : users) {
            for(String role : user.getRoles()) {
                roleCount.put(role, roleCount.getOrDefault(role, 0) + 1);
            }
        }

        System.out.println("-- All roles : count --");
        for(Map.Entry<String, Integer> entry : roleCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
