package com.example.moquelumnan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ForAdpater extends ArrayAdapter<Baloon> {

    public ForAdpater(Context context , ArrayList<Baloon> array)
    {
        super(context , 0, array);
    }
    public View getView(int position , View convertView, ViewGroup parent)
    {
        Baloon baloon = getItem(position);
        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_for_listview,parent,false);
        }

        ImageView img = convertView.findViewById(R.id.imageView);
        TextView txt = convertView.findViewById(R.id.textView);
        TextView txt1 = convertView.findViewById(R.id.textView2);


        img.setImageResource(baloon.getImage());
        txt.setText(baloon.getNumber()+"");
        txt1.setText(baloon.getNumber()+"");

        return convertView;
    }

}
