package com.example.memorygame;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    String check = "";
    ImageView img1,img2,img3,img4,img5,img6,img7,img,img9,img10,img11,img12,img13,img14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void A(View view)
    {
        if(check=="")
        {
            img1 = findViewById(R.id.imageView2);
            img1.setImageResource(R.drawable.a);
            check = "a";
        }
        else if(check.equals("a"))
        {
            img1 = findViewById(R.id.imageView2);
            img1.setImageResource(R.drawable.a);
            img1.setEnabled(false);
            img13.setEnabled(false);
        }
        else
        {
            img1 = findViewById(R.id.imageView2);
            img1.setImageResource(R.drawable.question1);
        }
    }
    public void A1(View view)
    {
        if(check=="")
        {
            img13 = findViewById(R.id.imageView13);
            img13.setImageResource(R.drawable.a);
            check = "a";
        }
        else if(check.equals("a"))
        {
            img13 = findViewById(R.id.imageView13);
            img13.setImageResource(R.drawable.a);
            img1.setEnabled(false);
            img13.setEnabled(false);
        }
        else
        {
            img13 = findViewById(R.id.imageView13);
            img13.setImageResource(R.drawable.question1);
        }
    }
}