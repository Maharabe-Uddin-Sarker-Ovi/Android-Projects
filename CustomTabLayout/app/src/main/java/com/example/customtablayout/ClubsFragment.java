package com.example.customtablayout;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ClubsFragment extends Fragment {


    public CardView cardview0, cardview1, cardview2, cardview3, cardview4,cardview5;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_clubs, container, false);
        cardview0= view.findViewById(R.id.cardview0);
        cardview1 = view.findViewById(R.id.cardview1);
        cardview2 = view.findViewById(R.id.cardview2);
        cardview3 = view.findViewById(R.id.cardview3);
        cardview4 = view.findViewById(R.id.cardview4);
        cardview5 = view.findViewById(R.id.cardview5);

        cardview0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),CulturalDetailsPage.class);
                startActivity(intent);
            }
        });

        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),CareerDetalisPage.class);
                startActivity(intent);
            }
        });
        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),languagefestdetails.class);
                startActivity(intent);
            }
        });
        cardview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Sciencesocietydetails.class);
                startActivity(intent);
            }
        });
        cardview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),businessclubdetails.class);
                startActivity(intent);
            }
        });
        cardview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),photographyclubdetails.class);
                startActivity(intent);
            }
        });
        return view;
    }
}