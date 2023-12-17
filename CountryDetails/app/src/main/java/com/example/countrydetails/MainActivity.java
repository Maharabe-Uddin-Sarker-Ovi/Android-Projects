package com.example.countrydetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView = (ListView) findViewById(R.id.listviewid);

    String[] country = {"Mumbai","Lahore","Kolkata","Paris","London",
    "Tokyo","Singapur"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1
        , country);

        listView.setAdapter(adapter);
        Button Dj=findViewById(R.id.btn);
        Dj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i1);
            }
        });
    }
}