package com.example.niterclub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ncac extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ncac);
        ListView listView1 = findViewById(R.id.list_ncac);
        String[] items1 = {"Upcoming Events", "Club Notice", "Members"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items1);
        listView1.setAdapter(adapter);
    }
}