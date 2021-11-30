package com.example.magic_21_card_game;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity3);
        img = findViewById(R.id.imageViewAA);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int resId = bundle.getInt("name");
            img.setImageResource(resId);}

    }
}
