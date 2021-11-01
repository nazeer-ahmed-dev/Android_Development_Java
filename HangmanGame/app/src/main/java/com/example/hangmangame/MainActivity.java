package com.example.hangmangame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] dict = {"nazeer","ahmed","umair","safdar","madan","haseeb","saqib","zeeshan"};
    int[] pics = {R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six,R.drawable.seven};
    int counter=0;
    char [] array;
    TextView txt,editText1;
    ImageView img;
    EditText editText;
    String name;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.imageView);
        editText = findViewById(R.id.editTextTextPersonName);
        editText1 = findViewById(R.id.textView5);
        btn = findViewById(R.id.button);
        editText1.setText("YOU HAVE TOTAL CHACES 7");
        New(null);

    }
    public void New(View view)
    {
        btn.setEnabled(true);
        img.setImageResource(R.drawable.one);
        counter=0;
        Random rnd = new Random();
        int number = rnd.nextInt(8);
        txt = findViewById(R.id.textView3);
        name = dict[number];
        array = new char[name.length()];
        for(int i=0;i<name.length();i++)
        {
            array[i] = name.charAt(i);
        }
        for(int i=0;i<name.length()/2;i++)
        {
            int num  = rnd.nextInt(name.length());
            array[num] = '?';
        }
        String val = String.valueOf(array);
        txt.setText(val);
    }
    public void guess(View view)
    {
        String  text = editText.getText().toString();
        try {

            if(counter<=5)
            {
                img.setImageResource(pics[counter+1]);
                if(text.equals(name))
                {
                    Toast.makeText(this, "You Won!!!!!", Toast.LENGTH_SHORT).show();
                    editText1.setText("YOU WIN PRESS NEW ");
                    btn.setEnabled(false);

                }
                editText1.setText("Your Remaining Chance "+(6-counter));
                counter++;

            }
            else
            {
                Toast.makeText(this, "You Loss Press New ", Toast.LENGTH_SHORT).show();
                editText1.setText("YOU LOSS PRESS NEW ");
                btn.setEnabled(false);
            }
        }
        catch (Exception ex)
        {
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }


    }

}