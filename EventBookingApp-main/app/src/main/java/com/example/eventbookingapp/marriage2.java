package com.example.eventbookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class marriage2 extends AppCompatActivity {

    ImageView mainImageView;
    TextView title, description;
    Button button;

    String data1, data2;
    int myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marriage2);

        mainImageView = findViewById(R.id.imageView);
        title = findViewById(R.id.textView3);
        description = findViewById(R.id.textView4);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(marriage2.this, calender.class);
                startActivity(i1);
            }
        });

        getData();
        setData();
    }
    private void getData() {
        if (getIntent().hasExtra("myImage") && getIntent().hasExtra("data1") && getIntent().hasExtra("data2")) {

            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            myImage = getIntent().getIntExtra("myImage", 1);
        } else {
            Toast.makeText(this, "No Data.", Toast.LENGTH_SHORT).show();

        }
    }
        private void setData(){
            title.setText(data1);
            description.setText(data2);
            mainImageView.setImageResource(myImage);
        }
}