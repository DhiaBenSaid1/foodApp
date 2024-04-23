package com.example.foodapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.BasketAdapter;
import com.example.foodapp.BasketItem;
import com.example.foodapp.R;

import java.util.ArrayList;
import java.util.List;

public class BasketActivity extends AppCompatActivity {

    private List<BasketItem> basketItemList;
    private BasketAdapter basketAdapter;
    private RecyclerView recyclerViewBasket;
    private TextView totalPriceTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);

        // Initialize RecyclerView and adapter
        recyclerViewBasket = findViewById(R.id.recycler_view_basket);
        recyclerViewBasket.setLayoutManager(new LinearLayoutManager(this));
        basketItemList = new ArrayList<>();
        basketAdapter = new BasketAdapter(this, basketItemList);
        recyclerViewBasket.setAdapter(basketAdapter);

        // Initialize total price TextView
        totalPriceTextView = findViewById(R.id.text_total_price);
        updateBasketUI();
    }

    private void updateBasketUI() {
        // Update RecyclerView adapter with new list of basket items
        basketAdapter.notifyDataSetChanged();

        // Calculate total price and update TextView
        double totalPrice = calculateTotalPrice();
        totalPriceTextView.setText("$" + totalPrice);
    }

    private double calculateTotalPrice() {
        double totalPrice = 0;
        for (BasketItem item : basketItemList) {
            totalPrice += item.getPrice() * item.getQuantity();
        }
        return totalPrice;
    }
}
