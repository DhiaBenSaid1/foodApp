package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

public class burgermenu extends AppCompatActivity {
    String burgers[] = {"BOMBAKLAT BURGER", "CASEOH BURGER", "GARLOC BIG AHH CHEESEBURGER"};
    int burgerImages[] = {R.drawable.bombaclatburger,R.drawable.caseohburger,R.drawable.garlocbigahhcheeseburger};
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burgermenu);
        listView = findViewById(R.id.burgerList);
        CustomListBurgers customListBurgers = new CustomListBurgers(getApplicationContext(),burgers,burgerImages);
        listView.setAdapter(customListBurgers);
    }
}