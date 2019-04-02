package com.example.mvppractice.interfaces;

import com.example.mvppractice.model.Breakfast;

import java.util.List;

public interface ItemShowInterface {

    interface view{
        void getitemresponse(List<Breakfast> breakfast);
        void showErrorResponse();
    }

    interface presenter{
void itemdetails();
    }
}
