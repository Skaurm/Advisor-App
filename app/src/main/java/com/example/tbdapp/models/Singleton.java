package com.example.tbdapp.models;

import java.util.ArrayList;

public class Singleton {
    public ArrayList<Advisor> advisors;
    public User user;
    private ArrayList<Message> chatHistory1;

    private String placeholderText = "This text is placeholder text.";
    private String placeholderImage = "https://www.misemacau.org/wp-content/uploads/2015/11/avatar-placeholder-01-300x250.png";

    private static Singleton instance;

    private Singleton() {
        advisors = new ArrayList<>();
        createAdvisorProfiles();

        user = new User("Jane Foster", placeholderImage, "Jane", "1996-09-04", "janefoster@tbd.com", "Ontario", "Permanent Resident", "Unemployed", "$10,000", "Tenant", "None", "A financial advisor");
        
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private void createAdvisorProfiles() {
        advisors.add(new Advisor("1", "Brittany Williams", "Financial", placeholderText, placeholderText, placeholderImage));
        advisors.add(new Advisor("2", "Thomas Edwards", "Career", placeholderText, placeholderText, placeholderImage));
        advisors.add(new Advisor("3", "Daniel Wilson", "Career", placeholderText, placeholderText, placeholderImage));
        advisors.add(new Advisor("4", "Jaimie Miller", "Career", placeholderText, placeholderText, placeholderImage));
        advisors.add(new Advisor("5", "Raiqah Johal", "Financial", placeholderText, placeholderText, placeholderImage));
        advisors.add(new Advisor("6", "Chris Peacock", "Financial", placeholderText, placeholderText, placeholderImage));
        advisors.add(new Advisor("7", "George London", "Financial", placeholderText, placeholderText, placeholderImage));
        advisors.add(new Advisor("8", "Alexei Dubrivonich", "Financial", placeholderText, placeholderText, placeholderImage));
        advisors.add(new Advisor("9", "Aetherbald the Great", "Financial", placeholderText, placeholderText, placeholderImage));
        advisors.add(new Advisor("10", "Pyńęł Rziąćic", "Financial", placeholderText, placeholderText, placeholderImage));
        advisors.add(new Advisor("11", "Cornelius II of Rome", "Financial", placeholderText, placeholderText, placeholderImage));
        advisors.add(new Advisor("12", "Rünerig Pfochmännördt", "Financial", placeholderText, placeholderText, placeholderImage));
        advisors.add(new Advisor("13", "Grzegorz Brzęczyszczykiewicz", "Financial", placeholderText, placeholderText, placeholderImage));
    }

}
