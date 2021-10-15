package com.example.randomnumberguessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //txt.setText("Guess a Number between 1 to 10000");
    }
    public void Validate(View view)
    {
        TextView txt = findViewById(R.id.textView);
        EditText guessBox = findViewById(R.id.editTextTextPersonName2);
        Random rnd = new Random();
        int guessNumber = rnd.nextInt(1000);
        int numberOfTries = 0;
        try {
            int guess = Integer.parseInt(guessBox.getText().toString());
            if(guess==guessNumber)
            {
                txt.setText("Match");
            }
            else if(guess>guessNumber)
            {
                txt.setText("Greater");
            }
            else
            {
                txt.setText("Less");
            }
        }
        catch (Exception ex)
        {
            Toast.makeText(this,ex.getMessage() , Toast.LENGTH_SHORT).show();
        }


    }
}