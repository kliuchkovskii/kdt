package com.cdp.model;

import java.util.Random;

public class DataProvider {

    public static User generateUser(){
        String username = "jane.doe" + Math.abs(new Random().nextInt());
        String email = username + "@gmail.com";
        return new User(email, "Jane Doe", username, "Userdoujanepass12345");
    }

    public static User getRegisteredUser(){
        return new User(null, "Jane Doe", "janedoe124120181104", "janedoe12345");
    }
}
