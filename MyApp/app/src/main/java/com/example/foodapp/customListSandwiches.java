package com.example.foodapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customListSandwiches extends BaseAdapter {
    Context _ctx;
    String _menu[];
    int _images[];
    LayoutInflater inflater;
    public customListSandwiches(Context ctx, String []menu, int []images){
        _ctx = ctx;
        _menu = menu;
        _images = images;
        inflater = LayoutInflater.from(ctx);
    }


    @Override
    public int getCount() {
        return _menu.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.sandwicheslistrows,null);
        TextView textProjet = convertView.findViewById(R.id.sandwichName);
        ImageView imageProjet = convertView.findViewById(R.id.sandwichImage);
        textProjet.setText(_menu[position]);
        imageProjet.setImageResource(_images[position]);
        return convertView;
    }
}
