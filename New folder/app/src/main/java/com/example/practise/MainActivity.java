package com.example.practise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spn;
    ImageView img ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spn = findViewById(R.id.spinner2);
        img = findViewById(R.id.imageView);
        spn.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(position==0)
        {
            img.setImageResource(R.drawable.a);
        }
        else
        {
            img.setImageResource(R.drawable.b);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("OnStart","Onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Onresume","OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("OnPause","OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("OnStop","OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy","onDEstory");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("OnRestart","OnRetart");
    }
}