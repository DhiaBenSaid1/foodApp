package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class garlocBurger extends AppCompatActivity {
    String menu[] = {"bread", "cheese"};
    int menuImages[] = {R.drawable.bread,R.drawable.cheese};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garloc_burger);
        listView = findViewById(R.id.garlocComponents);
        CustomRowForFood customListMenu = new CustomRowForFood(getApplicationContext(),menu,menuImages);
        listView.setAdapter(customListMenu);

    }}