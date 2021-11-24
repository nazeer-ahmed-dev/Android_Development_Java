package com.example.mutipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent call = getIntent();
        String name = call .getStringExtra("name");
        TextView txt = findViewById(R.id.textView3);
        txt.setText("Welcome "+name);


    }
    public void goBack(View view)
    {
        Intent intent = new Intent();
        intent.putExtra("name1","Nazeer");
        intent.putExtra("name2","Ahmed");
        setResult(RESULT_OK,intent);
        finish();
    }
}