package com.example.customtablayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import com.example.customtablayout.R.id;

import java.util.ArrayList;

public class ExecutiveMembers3 extends AppCompatActivity {

    SearchView searchView2;
    ListView listView2;

    ArrayList arrayList2;
    ArrayAdapter membersadapter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_executive_members3);

        searchView2 = findViewById(id.search2);
        listView2=findViewById(R.id.listview2);

        arrayList2=new ArrayList<>();
        arrayList2.add("Zobayed Islam Munsi (9th) - Convernor");
        arrayList2.add("Md Shakhawat Hossain (9th) - Co Convernor");
        arrayList2.add("Mahmudul Hasan (9th) - Co Convernor");
        arrayList2.add("Monjur Rahman (9th) - Co Convernor");
        arrayList2.add("SA Shezon (10th) - Co Convernor");
        arrayList2.add("Rumman Hossain (9th) - Senior Executive");
        arrayList2.add("Mahmudur Rahman Masum (9th) - Senior Executive");
        arrayList2.add("Shahriar Nafiz (9th) - Senior Executive");
        arrayList2.add("Surit Arefin (9th) - Senior Executive");
        arrayList2.add("Tanbin Rahman (9th) - Senior Executive");
        arrayList2.add("Md Shovon Chowdhury (9th) - Senior Executive");
        arrayList2.add("Prachurja Pratiti (9th) - Senior Executive");
        arrayList2.add("Mehedi Hasan Sagor (10th) - Executive");
        arrayList2.add("Nahimul Hasan Sakil (10th) - Executive");
        arrayList2.add("Jawat Afnan (10th) - Executive");
        arrayList2.add("Md Ariful Islam (10th) - Executive");
        arrayList2.add("Md Nazrul Islam (10th) - Executive");
        arrayList2.add("Nazia Mobashirin (10th) - Executive");
        arrayList2.add("Md Adnan (11th) - Member");
        arrayList2.add("Sabbir Hossain (11th) - Member");
        arrayList2.add("Monim Muthadee (11th) - Member");
        arrayList2.add("Ashif Ikbal (11th) - Member");
        arrayList2.add("Md Moinul Hossain (11th) - Member");
        arrayList2.add("Limon Ahmed (11th) - Member");
        arrayList2.add("Oasik Pathan (11th) - Member");
        arrayList2.add("Tahmina (11th) - Member");

        membersadapter2= new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrayList2);
        listView2.setAdapter(membersadapter2);

        searchView2.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                membersadapter2.getFilter().filter(query);
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                membersadapter2.getFilter().filter(newText);
                return false;
            }
        });

    }
}