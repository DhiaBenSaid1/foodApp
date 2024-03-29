package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String menu[] = {"burgers", "sandwichs", "hlouw"};
    int menuImages[] = {R.drawable.burger,R.drawable.sandwich,R.drawable.hlouw};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.menuList);
        CustomListMenu customListMenu = new CustomListMenu(getApplicationContext(),menu,menuImages);
        listView.setAdapter(customListMenu);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(getApplicationContext(), burgermenu.class);
                    startActivity(intent);
                }
                if(position == 1){
                    Intent intent = new Intent(getApplicationContext(), sandwichMenu.class);
                    startActivity(intent);
                }
            }
        });
    }





}