package com.example.magic_21_card_game;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }
    public void onClick1(View view)
    {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}
