package com.example.customtablayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class ExecutiveMembers2 extends AppCompatActivity {

    SearchView searchView1;
    ListView listView1;

    ArrayList arrayList1;
    ArrayAdapter membersadapter1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_executive_members2);

        searchView1 = findViewById(R.id.search1);
        listView1=findViewById(R.id.listview1);

        arrayList1=new ArrayList<>();
        arrayList1.add("Zobayed Islam Munsi (9th) - Convernor");
        arrayList1.add("Md Shakhawat Hossain (9th) - Co Convernor");
        arrayList1.add("Mahmudul Hasan (9th) - Co Convernor");
        arrayList1.add("Monjur Rahman (9th) - Co Convernor");
        arrayList1.add("SA Shezon (10th) - Co Convernor");
        arrayList1.add("Rumman Hossain (9th) - Senior Executive");
        arrayList1.add("Mahmudur Rahman Masum (9th) - Senior Executive");
        arrayList1.add("Shahriar Nafiz (9th) - Senior Executive");
        arrayList1.add("Surit Arefin (9th) - Senior Executive");
        arrayList1.add("Tanbin Rahman (9th) - Senior Executive");
        arrayList1.add("Md Shovon Chowdhury (9th) - Senior Executive");
        arrayList1.add("Prachurja Pratiti (9th) - Senior Executive");
        arrayList1.add("Mehedi Hasan Sagor (10th) - Executive");
        arrayList1.add("Nahimul Hasan Sakil (10th) - Executive");
        arrayList1.add("Jawat Afnan (10th) - Executive");
        arrayList1.add("Md Ariful Islam (10th) - Executive");
        arrayList1.add("Md Nazrul Islam (10th) - Executive");
        arrayList1.add("Nazia Mobashirin (10th) - Executive");
        arrayList1.add("Md Adnan (11th) - Member");
        arrayList1.add("Sabbir Hossain (11th) - Member");
        arrayList1.add("Monim Muthadee (11th) - Member");
        arrayList1.add("Ashif Ikbal (11th) - Member");
        arrayList1.add("Md Moinul Hossain (11th) - Member");
        arrayList1.add("Limon Ahmed (11th) - Member");
        arrayList1.add("Oasik Pathan (11th) - Member");
        arrayList1.add("Tahmina (11th) - Member");

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