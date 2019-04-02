package com.example.mvppractice.interfaces;

import com.example.mvppractice.model.DataResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("orderManagementFront")
    Call<DataResponse> getDataResponse();

}
