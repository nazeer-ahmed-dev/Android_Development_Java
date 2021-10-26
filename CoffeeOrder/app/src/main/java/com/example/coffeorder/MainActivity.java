package com.example.coffeorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView txt ;
    TextView txt1 ;
    CheckBox cbox1 ;
    CheckBox cbox2 ;
    int c = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void Add(View view)
    {
        TextView txt = findViewById(R.id.textView3);
        c++;
        txt.setText(c+"");
    }
    public void Sub(View view)
    {
        TextView txt = findViewById(R.id.textView3);
        c--;
        txt.setText(c+"");
    }
    public void Order(View view)
    {

        CheckBox cbox1 = findViewById(R.id.checkBox);
        CheckBox cbox2 = findViewById(R.id.checkBox2);
        TextView txt1 = findViewById(R.id.textView6);
        String cream = "no";
        String Choc = "no";

        if(cbox1.isChecked())
        {
            cream = "Yes";
        }
        if(cbox2.isChecked())
        {
            Choc= "Yes";
        }
        txt1.setText("Add Whipped cream ? "+cream+"\n"+" Addchocolate? "+Choc+"\n"+" Quantity : "+c+"\n");
    }
}