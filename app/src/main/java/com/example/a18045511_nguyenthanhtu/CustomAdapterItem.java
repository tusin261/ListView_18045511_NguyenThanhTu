package com.example.a18045511_nguyenthanhtu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapterItem extends BaseAdapter {
    Context ctx;
    int layoutItem;
    ArrayList<Item> arr;

    public CustomAdapterItem(Context ctx, int layoutItem, ArrayList<Item> arr) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arr = arr;
    }

    @Override
    public int getCount() {
        return arr.size();
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(ctx).inflate(layoutItem,viewGroup,false);
        TextView tvName = view.findViewById(R.id.name1);
        TextView tvPrice = view.findViewById(R.id.price1);
        ImageView imgV = view.findViewById(R.id.img1);


        tvName.setText(arr.get(i).getName());
        tvPrice.setText(arr.get(i).getPrice());
        imgV.setImageResource(arr.get(i).getImageItem());
        return view;
    }
}
