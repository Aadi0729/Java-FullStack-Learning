package com.loose.coupling;

public class UserManager {
    /*
    Here UserManager is just dependent on interface, and whoever implements that interface can make use
    of UserManager
    */
    private final UserDataProvider userDataProvider;

    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getUserInfo() {
        return userDataProvider.getUserDetails();
    }
}
