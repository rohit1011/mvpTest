package com.example.mvppractice.presenter;

import com.example.mvppractice.interfaces.MainInterface;

public class MainPresenter implements MainInterface.presenter{
    MainInterface.view view;

    public MainPresenter(MainInterface.view view) {
        this.view = view;
    }

    @Override
    public void appendText(String firstName, String lastName) {
    String fullName = "Welcome "+firstName+" "+lastName+ " !!!!!";
    view.finalText(fullName);
    view.successToast();
    }
}
