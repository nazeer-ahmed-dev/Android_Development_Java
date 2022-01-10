package com.example.listviewandgragment;

import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BlankFragment2 extends Fragment {


    int[] images = {R.drawable.bush,R.drawable.carson,R.drawable.chafee,R.drawable.clinton,R.drawable.omalley,R.drawable.rubio,R.drawable.sanders,R.drawable.trump};
    ImageView img;
    TextView txt;
    int pos;
    String name ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_blank2, container, false);
        img = view.findViewById(R.id.imageView);
        txt = view.findViewById(R.id.textView);
        txt.setText("");
        img.setImageResource(images[pos]);
        txt.setText(name);

        return  view;
    }
    public void method(int pos,String name)
    {
        this.pos = pos;
        this.name = name;
    }
}