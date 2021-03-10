package com.example.a18045511_nguyenthanhtu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listItem;
    CustomAdapterItem adt;
    ArrayList<Item> arr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listItem=findViewById(R.id.listItem);
        arr= new ArrayList<>();
        arr.add(new Item("Google","$80",R.drawable.google));
        arr.add(new Item("Google","$80",R.drawable.google));
        arr.add(new Item("Google","$80",R.drawable.google));
        adt = new CustomAdapterItem(this,R.layout.item_listview,arr);
        listItem.setAdapter(adt);

    }
}