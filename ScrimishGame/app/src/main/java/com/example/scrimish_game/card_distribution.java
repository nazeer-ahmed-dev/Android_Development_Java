package com.example.scrimish_game;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class card_distribution extends AppCompatActivity implements View.OnClickListener {

    // 25 pics of gaem
    int counter = 0;
    int c1=0,c2=0,c3=0,c4=0,c5=0;
    int c6=0,c7=0,c8=0,c9=0,c10=0;

    boolean turn = true;
    int pics[]={R.drawable.one,R.drawable.one,R.drawable.one,R.drawable.one,R.drawable.one,  // 0,1,2,3,4
                R.drawable.two,R.drawable.two,R.drawable.two,R.drawable.two,R.drawable.two, // 5,6,7,8,9
                R.drawable.three,R.drawable.three,R.drawable.three,                         // 10 ,11,12
                R.drawable.four,R.drawable.four,R.drawable.four,                            //13,14,15,
                R.drawable.five,R.drawable.five,                                             //16,17
                R.drawable.six,R.drawable.six,                                                // 18 ,19
                R.drawable.apic,R.drawable.apic,                                               // 20 ,21
                R.drawable.spic,R.drawable.spic,                                                // 22,23
                R.drawable.crown //24
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
    ImageView img12;


//    Random rnd = new Random();
//    int[] rand_values = new int[23];
//
//    int c=0,a=0,s=0;
//    int counter_for_assigning= 0;
//    int rnd_no;
//    boolean val = true;
//    TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_distribution);


        img_views = new ImageView[]{findViewById(R.id.imageView1),findViewById(R.id.imageView2),findViewById(R.id.imageView3),findViewById(R.id.imageView4),
                findViewById(R.id.imageView5),findViewById(R.id.imageView7),findViewById(R.id.imageView8),findViewById(R.id.imageView9),
                findViewById(R.id.imageView10),findViewById(R.id.imageView11)};

        array_of_button = new Button[]{findViewById(R.id.button2),findViewById(R.id.button3),findViewById(R.id.button4),
                findViewById(R.id.button5),findViewById(R.id.button6)};
      //  txt = findViewById(R.id.textView);


        img12 = findViewById(R.id.imageView12);
        Assigning_values(p1_ar1,p2_ar5);
        Assigning_values(p1_ar2,p2_ar4);
        Assigning_values(p1_ar3,p2_ar3);
        Assigning_values(p1_ar4,p2_ar2);
        Assigning_values(p1_ar5,p2_ar1);
        p1_ar5[4] = 24;
        p2_ar1[4]  =24;

//        // on click on every button
        for(int i=0;i<5;i++)
        {
            array_of_button[i].setOnClickListener(this);
        }
        for(int i=0;i<10;i++)
        {
            img_views[i].setOnLongClickListener((View.OnLongClickListener) this);
        }
        // i was here: onlong press to play
        img_views[0].setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(card_distribution.this, v.getTag()+"", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
//
//        // here : Generating Unique Random Number and storing it Array (rand_values)
//        Random_Gen();
//        Assigning_value(p1_ar1);
//        Assigning_value(p1_ar2);
//        Assigning_value(p1_ar3);
//        Assigning_value(p1_ar4);
//        Assigning_value(p1_ar5);
//        Random_Gen();
//        Assigning_value(p2_ar1);
//        Assigning_value(p2_ar2);
//        Assigning_value(p2_ar3);
//        Assigning_value(p2_ar4);
//        Assigning_value(p2_ar5);
//
//        p2_ar5[3] = R.drawable.one;
//        p1_ar5[3] = R.drawable.one;
//        p2_ar5[4]  = R.drawable.crown;
//        p1_ar5[4]  = R.drawable.crown;
   // }
//    public void Assigning_value(int Array[])
//    {
//        for(int i=0;i<5;i++)
//        {
//            Array[i] = rand_values[counter_for_assigning];
//            if(counter_for_assigning<=22)
//            {
//                counter_for_assigning++;
//            }
//
//        }
//
//    }
//    public void Random_Gen()
//    {
//        while(true)
//        {
//            rnd_no  = rnd.nextInt(23);
//            for(int i=0;i<24;i++)
//            {
//                if(rnd_no==rand_values[i])
//                {
//                    val = false;
//                }
//            }
//            if(val==true)
//            {
//                rand_values[c]  = rnd_no;
//                c++;
//            }
//            if(c==23)
//            {
//                break;
//            }
//            val  = true;
//        }
//    }
//
//    @Override
//    public void onClick(View v) {
//            switch (v.getId())
//            {
//                case R.id.button2:
//                    toShow(p1_ar1);
//                    break;
//                case R.id.button3:
//                    toShow(p1_ar2);
//                    break;
//                case R.id.button4:
//                    toShow(p1_ar3);
//                case R.id.button5:
//                    toShow(p1_ar4);
//                case R.id.button6:
//                    toShow(p1_ar5);
//            }
//    }
//    public void toShow(int[] Ar)
//    {
//        int aa= 0;
//        for(int i=0;i<5;i++)
//        {
//            img_views[i].setImageResource(pics[Ar[aa]]);
//              aa++;
//        }
   }

    @Override
    public void onClick(View v) {
        switch (v.getId())
            {
                case R.id.button2:
                    toShow(p1_ar1,p2_ar1);
                    break;
                case R.id.button3:
                    toShow(p1_ar2,p2_ar2);
                    break;
                case R.id.button4:
                    toShow(p1_ar3,p2_ar3);
                    break;
                case R.id.button5:
                    toShow(p1_ar4,p2_ar4);
                    break;
                case R.id.button6:
                    toShow(p1_ar5,p2_ar5);
                    break;
            }
    }
    public void toShow(int Ar[],int Ar1[])
    {
        int aa= 0;
        for(int i=0;i<5;i++)
        {
            img_views[i].setImageResource(pics[Ar[i]]);
            img_views[5+i].setImageResource(pics[Ar1[i]]);
              aa++;
        }
    }
    public void Assigning_values(int ar[],int ar1[])
    {
        for(int i=0;i<5;i++)
        {
            ar[i] = counter;
            ar1[i] = counter;
             if(counter<=23) {
                counter++;
            }
        }
    }
    public void showTopCard(View view)
    {
        String tag = view.getTag().toString();
        if(turn==true)
        {
            if(tag.equals("1"))
            {
                img12.setImageResource(pics[p1_ar1[c1]]);
            }
            else if(tag.equals("2"))
            {
                img12.setImageResource(pics[p1_ar2[c2]]);
            }
            else if(tag.equals("3"))
            {
                img12.setImageResource(pics[p1_ar3[c3]]);
            }
            else if(tag.equals("4"))
            {
                img12.setImageResource(pics[p1_ar4[c4]]);
            }
            else if(tag.equals("5"))
            {
                img12.setImageResource(pics[p1_ar4[c4]]);
            }
        }
        else
        {
            if(tag.equals("6"))
            {
                img12.setImageResource(pics[p2_ar1[c6]]);
            }
            else if(tag.equals("7"))
            {
                img12.setImageResource(pics[p2_ar2[c7]]);
            }
            else if(tag.equals("8"))
            {
                img12.setImageResource(pics[p2_ar3[c8]]);
            }
            else if(tag.equals("9"))
            {
                img12.setImageResource(pics[p2_ar4[c9]]);
            }
            else if(tag.equals("10"))
            {
                img12.setImageResource(pics[p2_ar4[c10]]);
            }
        }


    }
    

}
