package com.example.mvppractice.presenter;

import android.util.Log;

import com.example.mvppractice.interfaces.ApiInterface;
import com.example.mvppractice.interfaces.ItemShowInterface;
import com.example.mvppractice.interfaces.RetrofitInstances;
import com.example.mvppractice.model.Breakfast;
import com.example.mvppractice.model.DataResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ItemShowPresenter implements ItemShowInterface.presenter {
private RetrofitInstances retrofitInstances;
private ApiInterface apiInterface;
private List<Breakfast> breakfasts;
ItemShowInterface.view itemView;

    public ItemShowPresenter(ItemShowInterface.view itemView) {
        this.itemView = itemView;
    }

    @Override
    public void itemdetails() {
        retrofitInstances = new RetrofitInstances();
        apiInterface = retrofitInstances.getRetrofitInstances().create(ApiInterface.class);
        Call<DataResponse> dataResponseCall = apiInterface.getDataResponse();
        dataResponseCall.enqueue(new Callback<DataResponse>() {
            @Override
            public void onResponse(Call<DataResponse> call, Response<DataResponse> response) {
                Log.i("Dfdfd","dfhdjmnfdm"+response.body().getData().getBreakfast().size());
                breakfasts = response.body().getData().getBreakfast();
                itemView.getitemresponse(breakfasts);

            }

            @Override
            public void onFailure(Call<DataResponse> call, Throwable t) {
                itemView.showErrorResponse();
            }
        });

    }
}
