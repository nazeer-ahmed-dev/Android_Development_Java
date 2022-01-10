    package com.example.scrimish_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

    public class MainActivity extends AppCompatActivity {

     EditText txt1,txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = findViewById(R.id.editTextTextPersonName);
        txt2 = findViewById(R.id.editTextTextPersonName2);
    }
    public void onClick(View view)
    {
        Intent intent = new Intent(this,card_distribution.class);
        intent.putExtra("player1",txt1.getText().toString());
        intent.putExtra("player2",txt2.getText().toString());
        startActivity(intent);
    }
}