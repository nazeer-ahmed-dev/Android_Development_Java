package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void activity2sendbroadcast(View view)
    {
        Intent intent = new Intent();
        intent.setAction("com.actiom.myaction");
        sendBroadcast(intent);
    }
}