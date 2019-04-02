package com.example.mvppractice.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mvppractice.R;
import com.example.mvppractice.interfaces.MainInterface;
import com.example.mvppractice.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainInterface.view {
    EditText firstname,lastname;
    TextView fullname;
    Button submit;
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intializeUI();
        HandleUI();
    }

    private void intializeUI() {
        mainPresenter = new MainPresenter(this);
        firstname = findViewById(R.id.first_name);
        lastname = findViewById(R.id.last_name);
        fullname = findViewById(R.id.textView_fullname);
        submit = findViewById(R.id.button_submit);
    }

    private void HandleUI() {
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = firstname.getText().toString();
                String lastName = lastname.getText().toString();
                mainPresenter.appendText(firstName,lastName);


            }
        });
    }

    @Override
    public void finalText(String fullName) {
        fullname.setText(fullName);
    }

    @Override
    public void successToast() {
        Toast.makeText(getApplicationContext(),"Welcome You are Logged in",Toast.LENGTH_LONG).show();
    }
}
