package com.example.tbdapp.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Singleton {
    public ArrayList<Advisor> advisors;
    public User user;
    public HashMap<String, ArrayList<Message>> chatHistory;

    private String placeholderText = "This text is placeholder text.";
    private String placeholderImage = "profile_photo";

    private static Singleton instance;

    private Singleton() {
        advisors = new ArrayList<>();
        createAdvisorProfiles();

        user = new User("Jane Foster", "profile_picture", "Jane", "1996-09-04", "janefoster@tbd.com", "Ontario", "Permanent Resident", "Unemployed", "$10,000", "Tenant", "None", "A financial advisor");

        chatHistory = new HashMap<>();
        populateChatHistories();
        populateMessageList();
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static Message getLastMessage(ArrayList<Message> messageList) {
        if(messageList.size() == 0) {
            return null;
        }
        return messageList.get(0);
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

    private void populateChatHistories() {
        for(int i=0;i<advisors.size();i++) {
            chatHistory.put(advisors.get(i).id, new ArrayList<Message>());
        }
    }

    private void populateMessageList() {
        for(int i=0;i<advisors.size();i++) {
            for(int j=1;j<11;j++) {
                if(j%2==0) {
                    chatHistory.get(String.valueOf(i+1)).add(new Message("0","test", user, new Date()));
                } else {
                    chatHistory.get(String.valueOf(i+1)).add(new Message("1","test", advisors.get(i), new Date()));
                }
            }
        }
    }
}