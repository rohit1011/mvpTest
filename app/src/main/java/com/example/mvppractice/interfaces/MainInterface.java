package com.example.mvppractice.interfaces;

public interface MainInterface {

    interface view {
    void finalText(String fullName);
    void successToast();
    }

    interface presenter{
        void appendText(String firstName, String lastName);
    }
}
