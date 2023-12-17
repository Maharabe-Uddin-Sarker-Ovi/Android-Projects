package com.example.mybuttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button = (Button) findViewById(R.id.buttonid);
    private Button button1 = (Button) findViewById(R.id.buttonid1);
    private TextView textview = (TextView) findViewById(R.id.textviewid);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button.setOnClickListener(this);
        button1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.buttonid){
            textview.setText("Login button iis clicked");
        }
        if (v.getId()==R.id.buttonid1){
            textview.setText("Logout button iis clicked");
        }

    }
}