package com.example.friendslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class listAdapter extends ArrayAdapter<user> {
    public listAdapter(Context context, ArrayList<user> userArrayList) {

    super(context,R.layout.list_item,userArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        user user1 = getItem(position);
        if(convertView == null){

            convertView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        ImageView imageview = convertView.findViewById(R.id.profilepic);
        TextView username = convertView.findViewById(R.id.personname);
        TextView lastmessage = convertView.findViewById(R.id.personmessage);
        TextView time = convertView.findViewById(R.id.lasttime);

        imageview.setImageResource(user1.imageid);
        username.setText(user1.name);
        lastmessage.setText(user1.lastmessage);
        time.setText(user1.lasttime);

        return super.getView(position, convertView, parent);
    }
}
