package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class hlouw_menu extends AppCompatActivity {

    String hlouw[] = {"oreo cheesecake", "vanilla cheesecake" };
    int hlouwImages[] = {R.drawable.oreocheesecake,R.drawable.vanillacheesecake};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hlouw_menu);
        listView = findViewById(R.id.HlouwList);
        CustomListMenu CustomHlouwsList = new CustomListMenu(getApplicationContext(),hlouw,hlouwImages);
        listView.setAdapter(CustomHlouwsList);
    }
}