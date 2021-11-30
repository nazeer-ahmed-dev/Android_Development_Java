package com.example.magic_21_card_game;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
//,R.id.imageViewB,R.id.imageViewC,R.id.imageviewD,R.id.imageViewE,R.id.imageViewF,R.id.imageViewG

    ImageView[] imageViews1;
    TextView txt;
    int array[] = {R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six,R.drawable.seven,R.drawable.eight,R.drawable.nine, R.drawable.ten,R.drawable.eleven,R.drawable.twelve,R.drawable.thirteen,R.drawable.fourteen,R.drawable.fifteen,R.drawable.sixteen,R.drawable.seventeen,R.drawable.eighteen,R.drawable.ninteen,R.drawable.twenty,R.drawable.twentyone};
    int[] array1 = new int[7];
    int[] array2 = new int[7];
    int[] array3 = new int[7];
    int counter=1;
    int round=1;
    int value=0;
    int assing=0;
    int get = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt = findViewById(R.id.textView2);
        //txt.setText("Round 1");
       imageViews1 = new ImageView[]{findViewById(R.id.imageViewA),findViewById(R.id.imageViewB),findViewById(R.id.imageViewC),findViewById(R.id.imageViewD),findViewById(R.id.imageViewE),findViewById(R.id.imageViewF),findViewById(R.id.imageViewG)};
       while(get<=20)
       {
           array1[assing] = array[get];
           get++;
           array2[assing] = array[get];
           get++;
           array3[assing] = array[get];
           get++;
           assing++;
       }


//       counter++;
        next(null);
    }
    public void next(View view)
    {
            if(counter<=3 && counter>=1)
            {
                if(counter==1)
                {
                    for(int i=0;i<7;i++)
                    {
                        imageViews1[i].setImageResource(array1[i]);
                    }
                    counter++;
                    value=1;
                }
                else if(counter==2)
                {
                    for(int i=0;i<7;i++)
                    {
                        imageViews1[i].setImageResource(array2[i]);
                    }
                    counter++;
                    value=2;
                }
                else if(counter==3)
                {
                    for(int i=0;i<7;i++)
                    {
                        imageViews1[i].setImageResource(array3[i]);
                    }
                    value=3;
                }

            }
        Toast.makeText(this, counter+"", Toast.LENGTH_SHORT).show();

    }
    public void previous(View view)
    {
        if(counter<=3 && counter>1)
        {
            counter = counter-1;
            if(counter==1)
            {
                for(int i=0;i<7;i++)
                {
                    imageViews1[i].setImageResource(array1[i]);
                }
                value=1;
            }
            else if(counter==2)
            {
                for(int i=0;i<7;i++)
                {
                    imageViews1[i].setImageResource(array2[i]);
                }
                value=2;
            }
            else if(counter==3)
            {
                for(int i=0;i<7;i++)
                {
                    imageViews1[i].setImageResource(array3[i]);
                }
                value=3;
            }

        }


    }
    public void done(View view)
    {
        Toast.makeText(this, value+" = K", Toast.LENGTH_SHORT).show();
        txt.setText("ROUND "+round);
       if(round==3)
       {

           if(value == 1 )
           {
               merge(array2,array1,array3);

           }
           else if(value ==2 )
           {
               merge(array1,array2,array3);
           }
           else if(value ==3 )
           {
               merge(array1,array3,array2);
           }
          Intent intent = new Intent(this,MainActivity3.class);
            intent.putExtra("name",array[10]);
           startActivity(intent);

       }
       else
       {

           if(value == 1 )
           {
               merge(array2,array1,array3);
               adding();

           }
           else if(value ==2 )
           {
               merge(array1,array2,array3);
               adding();
           }
           else if(value ==3 )
           {
               merge(array1,array3,array2);
               adding();
           }

           round++;
           counter=1;
           next(null);
       }

    }
    public void merge(int ar1[] , int ar2 [] ,int ar3[])
    {
        int count =0;
        for(int ar : ar1)
        {
            array[count] = ar;
            count++;
        }
        for(int ar : ar2)
        {
            array[count] = ar;
            count++;
        }
        for(int ar : ar3) {
            array[count] = ar;
            count++;
        }
    }
    public void adding()
    {
         get = 0;
        assing =0;
        while(get<=20)
        {
            array1[assing] = array[get];
            get++;
            array2[assing] = array[get];
            get++;
            array3[assing] = array[get];
            get++;
            assing++;
        }
    }
}