package com.example.addresbk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextClock;
import android.widget.TextView;

import java.util.HashMap;

public class SecondActivity extends AppCompatActivity {
        private TextView nameView, addressView, numberView, birthdayView, zipcodeView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

       Intent anyname = getIntent();
       Bundle extras=anyname.getExtras();
       if(extras!=null){
           String name=extras.getString("name");
           String address=extras.getString("address");
           String numbers=extras.getString("numbers");
           String birthdays=extras.getString("birthdays");
           String zipcode=extras.getString("zipcode");
       }

       nameView = (TextView) findViewById(R.id.textView);

    }
}
