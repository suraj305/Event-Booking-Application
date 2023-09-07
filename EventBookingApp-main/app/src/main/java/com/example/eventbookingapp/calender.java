package com.example.eventbookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class calender extends AppCompatActivity {
    Button bkn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);

        bkn = (Button) findViewById(R.id.BKN);
        bkn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B = new Intent(calender.this, Payment.class);
                startActivity(B);
            }
        });
    }
}