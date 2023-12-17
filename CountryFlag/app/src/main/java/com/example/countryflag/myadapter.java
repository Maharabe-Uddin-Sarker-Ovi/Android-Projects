package com.example.countryflag;

import android.app.Activity;
import android.widget.ArrayAdapter;

public class myadapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;
    private final Integer[] imageid;

    public myadapter(MainActivity mainActivity, String[] maintitle, String[] subtitle, Integer[] imageid) {
        super();
    }
}
