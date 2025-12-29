package com.tight.coupling;

public class UserManager {
    // UserManager is tightly coupled with UserDatabase (Hardcoding)
    // If in case, a difference database is used, then changes will also be done in UserManager class
    // Tight coupling is NEVER scalable
    private UserDatabase userDatabase = new UserDatabase();

    public String getUserInfo() {
        return userDatabase.getUserDetails();
    }
}
