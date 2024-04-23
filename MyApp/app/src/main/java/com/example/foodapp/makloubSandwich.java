package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class makloubSandwich extends AppCompatActivity {
    String menu[] = {"bread", "cheese"};
    int menuImages[] = {R.drawable.bread,R.drawable.cheese};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makloub_sandwich);
        listView = findViewById(R.id.makloubComponents);
        CustomRowForFood customListMenu = new CustomRowForFood(getApplicationContext(),menu,menuImages);
        listView.setAdapter(customListMenu);

    }}