package com.example.mylistviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView = (ListView) findViewById(R.id.listviewid);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] countryNames = getResources().getStringArray(R.array.country);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this,R.layout.sample,R.id.textviewid,countryNames);

        listView.setAdapter(adapter);



    }
}