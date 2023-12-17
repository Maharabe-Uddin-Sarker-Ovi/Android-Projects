package com.example.customtablayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gridcard5 extends AppCompatActivity {

    private Button btninfo1, btninfo2, btninfo3,btninfo4,btninfo5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridcard5);

        btninfo1=findViewById(R.id.btninfo1);
        btninfo2=findViewById(R.id.btninfo2);
        btninfo3=findViewById(R.id.btninfo3);
        btninfo4=findViewById(R.id.btninfo4);
        btninfo5=findViewById(R.id.btninfo5);


        btninfo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gridcard5.this, ExecutiveMembers3.class);
                startActivity(intent);
            }
        });

        btninfo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gridcard5.this, Notice.class);
                startActivity(intent);
            }
        });

        btninfo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gridcard5.this, Registration.class);
                startActivity(intent);
            }
        });

        btninfo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gridcard5.this, Achievements.class);
                startActivity(intent);
            }
        });

        btninfo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(gridcard5.this, AboutUs.class);
                startActivity(intent);
            }
        });
    }
}