package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(getApplicationContext(), gyrosSandwich.class);
                    startActivity(intent);
                }
                if(position == 1){
                    Intent intent = new Intent(getApplicationContext(), gyrosSandwich.class);
                    startActivity(intent);
                }

            }
        });
    }
}