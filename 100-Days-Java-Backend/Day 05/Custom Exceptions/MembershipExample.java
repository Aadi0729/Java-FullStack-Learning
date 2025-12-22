package Day05;

class InvalidMemberException extends Exception {
    public InvalidMemberException(String message) {
        super(message);
    }
}

class User {
    int availableBooks = 3;

    public void userMembership(String userName) throws Exception {
       if(userName == null || userName.isEmpty()) {
           throw new InvalidMemberException("User do not exist");
       }
    }
}

public class MembershipExample {
    public static void main(String[] args) {
        User user = new User();
        try {
            user.userMembership("John");
            user.userMembership(null);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("Invalid member exception: " + e.getMessage());
        }
    }
}
