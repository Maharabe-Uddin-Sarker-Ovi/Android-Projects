package com.example.countryflag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String[] maintitle={"Anika", "Sakib","Alve", "Amit","Roza","Adib"};
    String[] subtitle={"ummmaa", "dhuru","weired", "vingching","chicken","robot"};

    Integer[] imageid={R.drawable.m2,R.drawable.m3,R.drawable.m4,R.drawable.m5,R.drawable.m6,R.drawable.m7};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myadapter adapter = new myadapter(this, maintitle, subtitle,imageid);
        list = (ListView) findViewById(R.id.listviewid);
        list.setAdapter(adapter);
    }
}