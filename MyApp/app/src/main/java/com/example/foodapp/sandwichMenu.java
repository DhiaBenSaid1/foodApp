package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class sandwichMenu extends AppCompatActivity {
    String sandwichs[] = {"gyros", "makloub" };
    int sandwichImages[] = {R.drawable.gyros,R.drawable.makloub};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwich_menu);
        listView = findViewById(R.id.sandwichList);
        CustomListMenu customListMenu = new CustomListMenu(getApplicationContext(),sandwichs,sandwichImages);
        listView.setAdapter(customListMenu);
    }
}