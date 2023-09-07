package com.example.eventbookingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class marriage extends AppCompatActivity {
    RecyclerView recyclerView;

    String s1[], s2[];
    int image[] = {R.drawable.geeta, R.drawable.jainam, R.drawable.shagun, R.drawable.kalidas, R.drawable.jagannath};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marriage);

        s1 = getResources().getStringArray(R.array.Event_Hall);
        s2 = getResources().getStringArray(R.array.Address);

        recyclerView = findViewById(R.id.recyclerView1);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, image);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}