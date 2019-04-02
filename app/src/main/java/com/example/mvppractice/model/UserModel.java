package com.example.mvppractice.model;

public class UserModel {
private String firstName,lastname,fullname;

    public UserModel(String firstName, String lastname, String fullname) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.fullname = fullname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
