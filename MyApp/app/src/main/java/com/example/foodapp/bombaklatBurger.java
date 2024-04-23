package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class bombaklatBurger extends AppCompatActivity  {
    String menu[] = {"bread", "cheese"};
    int menuImages[] = {R.drawable.bread,R.drawable.cheese};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bombaklat_burger);
        listView = findViewById(R.id.componentList);
        CustomRowForFood customListMenu = new CustomRowForFood(getApplicationContext(),menu,menuImages);
        listView.setAdapter(customListMenu);
    }
    public void addItemToBasket(String itemName, double price) {
        // Check if the item already exists in the basket
        for (BasketItem item : basketItemList) {
            if (item.getItemName().equals(itemName)) {
                // If the item already exists, increase its quantity
                item.setQuantity(item.getQuantity() + 1);
                updateBasketUI(); // Update the UI to reflect the change
                return;
            }
        }

        // If the item does not exist in the basket, add it as a new item
        BasketItem newItem = new BasketItem(itemName, price, 1);
        basketItemList.add(newItem);
        updateBasketUI(); // Update the UI to reflect the change
    }
    private void updateBasketUI() {
        // Update RecyclerView adapter with new list of basket items
        BasketAdapter.notifyDataSetChanged();

        // Update total price display
        double totalPrice = calculateTotalPrice();
        totalPriceTextView.setText("Total: $" + totalPrice);
    }


}