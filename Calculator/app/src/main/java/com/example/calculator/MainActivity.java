package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView lbl;
    EditText txt1;
    EditText txt2;
    Integer num1;
    Integer num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         lbl = findViewById(R.id.textView2);
         txt1 = findViewById(R.id.editTextNumber);
         txt2 = findViewById(R.id.editTextNumber2);

    }
    public void add(View view)
    {

        try {
            num1 = Integer.parseInt(txt1.getText().toString());
            num2 = Integer.parseInt(txt2.getText().toString());
            lbl.setText((num1+num2)+" ");
        }
        catch (Exception ex)
        {
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }



    }
    public void subtract(View view)
    {
        try {
            num1 = Integer.parseInt(txt1.getText().toString());
            num2 = Integer.parseInt(txt2.getText().toString());
            lbl.setText((num1-num2)+" ");
        }
        catch (Exception ex)
        {
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    public void multiply(View view)
    {
        try {
            num1 = Integer.parseInt(txt1.getText().toString());
            num2 = Integer.parseInt(txt2.getText().toString());
            lbl.setText((num1*num2)+" ");
        }
        catch (Exception ex)
        {
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    public void division(View view)
    {
        try {
            num1 = Integer.parseInt(txt1.getText().toString());
            num2 = Integer.parseInt(txt2.getText().toString());
            lbl.setText((num1/num2)+" ");
        }
        catch (Exception ex)
        {
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}