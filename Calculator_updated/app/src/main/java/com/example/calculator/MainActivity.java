package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txt ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt= findViewById(R.id.textView2);
    }


    @Override
    public void onClick(View v) {
    String value = txt.getText().toString();
    Button b = (Button)v;
    txt.setText(value+b.getText().toString());
    }
    public void toCalculate(View view)
    {
        try {


        char op=' ';
        String value = this.txt.getText().toString();
        char[] ar  = new char[value.length()];
        for(int i=0;i<value.length();i++)
        {
            ar[i] = value.charAt(i);
        }
        for(int i=0;i<value.length();i++)
        {
            if(ar[i]=='+' || ar[i]=='-' || ar[i]=='/' || ar[i]=='x' )
            {
                op = ar[i];
            }
        }
        String [] array = value.split("[-x+/]");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);

        if(op=='+')
        {
                txt.setText((a+b)+"");
        }
        else if(op=='-')
        {
            txt.setText((a-b)+"");
        }
        else if(op=='x')
        {
            txt.setText((a*b)+"");
        }
        else if(op=='/')
        {
            txt.setText((a/b)+"");
        }
        
    }
        catch(Exception ex)
        {
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
}}