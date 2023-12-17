package com.example.niterclubs;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView upcomingevents, clubs;
    private int selectedTabNumber = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        upcomingevents = findViewById(R.id.upcomingevents);
        clubs = findViewById(R.id.clubs);

        //selecteing first segmant by default
        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.fragmantcontainer,eventsFragment.class, null)
                .commit();
        upcomingevents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int tabnumber;
                selectTab(tabnumber=1);
            }
        });

        clubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int tabnumber;
                selectTab(tabnumber=2);
            }
        });
    }
    private void selectTab(int tabnumber){

        TextView selectedTextView;
        TextView nonSelectedTextView;

        if(tabnumber==1){
            selectedTextView = upcomingevents;
            nonSelectedTextView = clubs;

            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmantcontainer, clubsFragment.class, null)
                    .commit();
        }
        else{
            selectedTextView = clubs;
            nonSelectedTextView = upcomingevents;

            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmantcontainer, eventsFragment.class, null)
                    .commit();
        }

        float slideTo = (tabnumber - selectedTabNumber)* selectedTextView.getWidth();
        TranslateAnimation translateAnimation = new TranslateAnimation(0,slideTo,0,0);
        translateAnimation.setDuration(100);

        if(selectedTabNumber == 1){
            upcomingevents.startAnimation(translateAnimation);
        }
        else{
            clubs.startAnimation(translateAnimation);
        }
        translateAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @SuppressLint("ResourceAsColor")
            @Override
            public void onAnimationEnd(Animation animation) {

                //change design of selected tab's view
                selectedTextView.setBackgroundResource(R.drawable.roundback_white100);
                selectedTextView.setTypeface(null, Typeface.BOLD);
                selectedTextView.setTextColor(android.R.color.black);

                //change design of nonselected tab's view
                nonSelectedTextView.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                nonSelectedTextView.setTextColor(android.R.color.white);
                nonSelectedTextView.setTypeface(null, Typeface.NORMAL);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        selectedTabNumber = tabnumber;
    }
}