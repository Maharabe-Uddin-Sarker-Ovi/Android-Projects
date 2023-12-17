package com.example.customtablayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

public class ExecutiveMembers1 extends AppCompatActivity {

    SearchView searchView1;
    ListView listView1;

    ArrayList arrayList1;
    ArrayAdapter membersadapter1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_executive_members1);

        searchView1 = findViewById(R.id.search);
        listView1=findViewById(R.id.listview);

        arrayList1=new ArrayList<>();
        arrayList1.add("Forhad Ahmed (9th) - Convernor");
        arrayList1.add("Siam Ibn Ahmed (9th) - Co Convernor(Management)");
        arrayList1.add("Md Rion Khan (9th) - Co Convernor(Ramp)");
        arrayList1.add("Shishir Mondol (9th) - Co Convernor(Drama)");
        arrayList1.add("Shuvra Debnath Joy (9th) - Co Convernor(Dance)");
        arrayList1.add("Shovon (9th) - Co Convernor(Art & Decoration)");

        membersadapter1= new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrayList1);
        listView1.setAdapter(membersadapter1);

        searchView1.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                membersadapter1.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                membersadapter1.getFilter().filter(newText);

                return false;
            }
        });

    }
}