package com.example.scrimish_game;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class card_distribution extends AppCompatActivity implements View.OnClickListener {

    // 25 pics of gaem
    int pics[]={R.drawable.one,R.drawable.one,R.drawable.one,R.drawable.one,R.drawable.one,
                R.drawable.two,R.drawable.two,R.drawable.two,R.drawable.two,R.drawable.two,
                R.drawable.three,R.drawable.three,R.drawable.three,
                R.drawable.four,R.drawable.four,R.drawable.four,
                R.drawable.five,R.drawable.five,
                R.drawable.six,R.drawable.six,
                R.drawable.apic,R.drawable.apic,
                R.drawable.spic,R.drawable.spic,
    };
    // 25 cards with 5 piles for one player1
    int[] p1_ar1 = new int[5];
    int[] p1_ar2 = new int[5];
    int[] p1_ar3 = new int[5];
    int[] p1_ar4 = new int[5];
    int[] p1_ar5 = new int[5];

    // 25 cards with 5 piles for one player2
    int[] p2_ar1 = new int[5];
    int[] p2_ar2 = new int[5];
    int[] p2_ar3 = new int[5];
    int[] p2_ar4 = new int[5];
    int[] p2_ar5 = new int[5];
    // images views
    ImageView[] img_views ;
    Button[] array_of_button;
    Random rnd = new Random();
    int[] rand_values = new int[24];

    int c=0,a=0,s=0;
    int counter_for_assigning= 1;
    int rnd_no;
    boolean val = true;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_distribution);


        img_views = new ImageView[]{findViewById(R.id.imageView1),findViewById(R.id.imageView2),findViewById(R.id.imageView3),findViewById(R.id.imageView4),
                findViewById(R.id.imageView5),findViewById(R.id.imageView7),findViewById(R.id.imageView8),findViewById(R.id.imageView9),
                findViewById(R.id.imageView10),findViewById(R.id.imageView11)};

        array_of_button = new Button[]{findViewById(R.id.button2),findViewById(R.id.button3),findViewById(R.id.button4),
                findViewById(R.id.button5),findViewById(R.id.button6)};
        txt = findViewById(R.id.textView);

        p1_ar1[0] = R.drawable.one;
        p2_ar1[0] = R.drawable.one;


        // on click on every button
        for(int i=0;i<5;i++)
        {
            array_of_button[i].setOnClickListener(this);
        }

        // here : Generating Unique Random Number and storing it Array (rand_values)
        Random_Gen();
        Assigning_value(p1_ar1);
        Assigning_value(p1_ar2);
        Assigning_value(p1_ar3);
        Assigning_value(p1_ar4);
        Assigning_value(p1_ar5);
    }
    public void Assigning_value(int Array[])
    {
        for(int i=0;i<5;i++)
        {
            Array[i] = rand_values[counter_for_assigning];
            counter_for_assigning++;
        }

    }
    public void Random_Gen()
    {
        while(true)
        {
            rnd_no  = rnd.nextInt(24);
            for(int i=0;i<24;i++)
            {
                if(rnd_no==rand_values[i])
                {
                    val = false;
                }
            }
            if(val==true)
            {
                rand_values[c]  = rnd_no;
                c++;
            }
            if(c==23)
            {
                break;
            }
            val  = true;
        }
    }

    @Override
    public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.button2:
                    toShow(0);
                    break;
                case R.id.button3:
                    toShow(5);
                    break;
                case R.id.button4:
                    toShow(6);
            }
    }
    public void toShow(int a)
    {
        this.a = a;
        for(int i =0;i<5;i++)
        {
            img_views[i].setImageResource(pics[rand_values[this.a]]);
            this.a++;
        }
    }
}