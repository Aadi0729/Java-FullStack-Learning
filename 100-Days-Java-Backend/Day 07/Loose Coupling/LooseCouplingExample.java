package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
//        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(new UserDatabaseProvider());
        System.out.println(userManagerWithDB.getUserInfo());

//        UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserManager userManagerWithWS = new UserManager(new WebServiceDataProvider());
        System.out.println(userManagerWithWS.getUserInfo());

//        UserDataProvider newDatabaseProvider = new NewDatabaseProvider();
        UserManager userManagerWithNewDB = new UserManager(new NewDatabaseProvider());
        System.out.println(userManagerWithNewDB.getUserInfo());
    }
}
