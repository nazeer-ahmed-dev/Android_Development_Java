package com.example.contact_in_listview;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class UsersAdpater extends ArrayAdapter<person> {
    public UsersAdpater(Context context, ArrayList<person> users)
    {
        super(context,0,users);
    }
    public View getView(int position, View convertView, ViewGroup parent)
    {
        person user = getItem(position);
        if(convertView==null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_of_layout,parent,false);
        }
        TextView txt1  =convertView.findViewById(R.id.textView);
        TextView txt2  =convertView.findViewById(R.id.textView2);
        TextView txt3  =convertView.findViewById(R.id.textView3);
        ImageView img = convertView.findViewById(R.id.imageView);

        txt1.setText(user.getName());
        txt2.setText(user.getEmail());
        txt3.setText(user.getPhone_no());
        img.setImageResource(user.getPhoto());
        return convertView;

    }
}
