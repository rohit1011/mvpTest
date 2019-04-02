package com.example.mvppractice.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.mvppractice.R;
import com.example.mvppractice.adapters.BreakFastAdapter;
import com.example.mvppractice.interfaces.ItemShowInterface;
import com.example.mvppractice.model.Breakfast;
import com.example.mvppractice.presenter.ItemShowPresenter;

import java.util.List;

public class ItemShowActivity extends AppCompatActivity implements ItemShowInterface.view {
RecyclerView recyclerView;
ItemShowPresenter itemShowPresenter;
    private RecyclerView.LayoutManager layoutManager;
private BreakFastAdapter breakFastAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_show);
        initUI();
        handlingUI();
    }

    private void initUI() {
        itemShowPresenter = new ItemShowPresenter(this);
        recyclerView = findViewById(R.id.recycle_breakfast);
        itemShowPresenter.itemdetails();
    }

    private void handlingUI() {
    }

    @Override
    public void getitemresponse(List<Breakfast> breakfast) {
        Log.i("Dfdfd","rohit"+breakfast.size());

        layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        breakFastAdapter = new BreakFastAdapter(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        breakFastAdapter.setBreakfasts(breakfast);
        recyclerView.setAdapter(breakFastAdapter);

    }

    @Override
    public void showErrorResponse() {
        Toast.makeText(getApplicationContext(),"Something Went Wrong!!!",Toast.LENGTH_LONG).show();
    }
}
