package com.example.mooddescribing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Full(View view)
    {
        ImageView img = findViewById(R.id.imageView);
        TextView txt = findViewById(R.id.textView);
        Button btn = findViewById(R.id.button);

        img.setImageResource(R.drawable.full);
        txt.setText("I'm So FUll");
        btn.setText("DONE");
    }
}