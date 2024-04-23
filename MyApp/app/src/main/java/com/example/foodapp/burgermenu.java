package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(getApplicationContext(), bombaklatBurger.class);
                    startActivity(intent);
                }
                if(position == 1){
                    Intent intent = new Intent(getApplicationContext(), CaseohBurger.class);
                    startActivity(intent);
                }
                if(position == 2){
                    Intent intent = new Intent(getApplicationContext(), garlocBurger.class);
                    startActivity(intent);
                }
                //salem a bo

            }
        });
    }
}