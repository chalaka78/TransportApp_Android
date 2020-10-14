package com.example.transportapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ChooseLogin extends AppCompatActivity {

    ImageButton driver;
    ImageButton customer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_login);

        driver=(ImageButton)findViewById(R.id.driverlogin);
        customer=(ImageButton)findViewById(R.id.customerlogin);

        driver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseLogin.this, DriverLogin.class);
                startActivity(intent);
            }
        });

        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseLogin.this, CustomerLogin.class);
                startActivity(intent);
            }
        });
    }
}