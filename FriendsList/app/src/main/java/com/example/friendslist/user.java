package com.example.friendslist;

public class user {

    String name, lastmessage, lasttime, phone, country;
    int imageid;

    public user(String name, String lastmessage, String lasttime, String phone, String country, int imageid) {
        this.name = name;
        this.lastmessage = lastmessage;
        this.lasttime = lasttime;
        this.phone = phone;
        this.country = country;
        this.imageid = imageid;
    }
}
