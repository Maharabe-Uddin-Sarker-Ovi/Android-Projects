package com.example.niterclub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NCuC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ncu_c);
        ListView listView2= findViewById(R.id.list_ncuc);
        String[] item = {"Upcoming Events", "Club Notice", "Members"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, item);
        listView2.setAdapter(adapter);
    }
}