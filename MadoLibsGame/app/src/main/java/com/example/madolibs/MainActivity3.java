package com.example.madolibs;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txt = findViewById(R.id.textView5);

        Intent intent = getIntent();
        String[] value = intent.getStringArrayExtra("name");
        for(int i=0;i<value.length;i++)
        {
            txt.setText(txt.getText()+" "+value[i]);
        }


    }
}
