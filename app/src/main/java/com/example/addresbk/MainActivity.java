package com.example.addresbk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private EditText name;
    private EditText address;
    private EditText numbers;
    private EditText birthdays;
    private EditText zipcode;
    private Spinner spinner;
    private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name = (EditText) findViewById(R.id.nameID);
        address = (EditText) findViewById(R.id.addressID);
        numbers = (EditText) findViewById(R.id.numberID);
        birthdays = (EditText) findViewById(R.id.birthdayID);
        zipcode = (EditText) findViewById(R.id.zip_codeID);
        spinner = (Spinner) findViewById(R.id.spinnerID);
        login = (Button) findViewById(R.id.buttonID);



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                intent.putExtra("name", name.getText().toString());
                intent.putExtra("address", address.getText().toString());
                intent.putExtra(" numbers", numbers.getText().toString());
                intent.putExtra("birthdays", birthdays.getText().toString());
                intent.putExtra("zipcode", zipcode.getText().toString());


                startActivity(intent);


            }
        });




    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}
