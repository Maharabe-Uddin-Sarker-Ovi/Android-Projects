package com.example.niterclub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.view.View.OnClickListener;
import android.widget.Toast;

import java.util.stream.StreamSupport;

public class MainActivity extends AppCompatActivity {

    ListView list;
    ImageButton imageButton;

    String[] maintitle={
            "NITER Games and Sports Club","NITER Cultural Club","NITER Computer Club","NITER Career Club","NITER Science Socity"
    };




    Integer[] imgid={R.drawable.ngsc,R.drawable.ncuc,R.drawable.ncc,R.drawable.ncac,R.drawable.nss

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imageButton = findViewById(R.id.image_button);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  LogIn= new Intent(MainActivity.this, logIn.class);
                MainActivity.this.startActivity(LogIn);
            }
        });

        ListAdapter adapter=new ListAdapter(this, maintitle, imgid);
        list=(ListView)findViewById(R.id.list_item);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;
                String value = (String) list.getItemAtPosition(position);

                final int result = 1;
                switch(value){
                    case "NITER Games and Sports Club":
                        Intent I1 = new Intent(MainActivity.this, NGSC.class);
                        MainActivity.this.startActivity(I1);
                        break;
                    case "NITER Cultural Club":
                        Intent I2= new Intent(MainActivity.this, NCuC.class);
                        MainActivity.this.startActivity(I2);
                        break;
                    case "NITER Computer Club":
                        Intent I3 = new Intent(MainActivity.this, NCC.class);
                        MainActivity.this.startActivity(I3);
                        break;
                    case "NITER Career Club":
                        Intent I4 = new Intent(MainActivity.this, ncac.class);
                        MainActivity.this.startActivity(I4);
                        break;
                    case "NITER Science Socity":
                        Intent I5 = new Intent(MainActivity.this, NSS.class);
                        MainActivity.this.startActivity(I5);
                        break;

                }
            }
        });



    }
}
