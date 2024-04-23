package com.example.foodapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.BasketItem;

import java.util.List;

public class BasketAdapter extends RecyclerView.Adapter<BasketAdapter.BasketViewHolder> {

    private Context context;
    private List<BasketItem> basketItemList;

    public BasketAdapter(Context context, List<BasketItem> basketItemList) {
        this.context = context;
        this.basketItemList = basketItemList;
    }

    @NonNull
    @Override
    public BasketViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.basket_item, parent, false);
        return new BasketViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BasketViewHolder holder, int position) {
        BasketItem item = basketItemList.get(position);
        holder.itemNameTextView.setText(item.getItemName());
        holder.priceTextView.setText("$" + item.getPrice());
        holder.quantityTextView.setText("Quantity: " + item.getQuantity());
    }

    @Override
    public int getItemCount() {
        return basketItemList.size();
    }

    public class BasketViewHolder extends RecyclerView.ViewHolder {
        TextView itemNameTextView, priceTextView, quantityTextView;

        public BasketViewHolder(@NonNull View itemView) {
            super(itemView);
            itemNameTextView = itemView.findViewById(R.id.text_item_name);
            priceTextView = itemView.findViewById(R.id.text_item_price);
            quantityTextView = itemView.findViewById(R.id.text_item_quantity);
        }
    }
}
