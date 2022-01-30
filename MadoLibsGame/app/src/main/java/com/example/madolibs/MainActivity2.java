package com.example.madolibs;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static android.content.ContentValues.TAG;

public class MainActivity2 extends AppCompatActivity {

    TextView txt1,txt2;
    int[] array = {R.raw.madlib0,R.raw.madlib1,R.raw.madlib2,R.raw.madlib3,R.raw.madlib4};
    String[] finalarray;
    Random rnd = new Random();
    String[] ar;
    Pattern p = Pattern.compile("<[a-zA-z]{1,}>");
    ArrayList<String> arraylist = new ArrayList<String>();
    EditText txt;
    int c=0;
    int j=0;
    int k=0;
    int z=0;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt1 = findViewById(R.id.textView6);
        txt2 = findViewById(R.id.textView3);
        txt = findViewById(R.id.editTextTextPersonName);
        int value  = rnd.nextInt(5);
        try {


            InputStream is = this.getResources().openRawResource(array[2]);
            byte[] buffer = new byte[is.available()];
            while (is.read(buffer) != -1);
            String jsontext = new String(buffer);
            ar = jsontext.split(" ");
            for(int i=0;i<ar.length;i++)
            {
                Matcher m = p.matcher(ar[i]);
                boolean b = m.matches();
                if(b==true)
                {
                    arraylist.add(ar[i]);
                    c++;
                    k++;
                }

            }

        } catch (Exception e) {

            Log.e(TAG, ""+e.toString());
        }
        finalarray = new String[c];
        txt2.setText("Remaining "+c);
        txt1.setText("Type a/an "+arraylist.get(0));


    }
    public void onClick1(View view)
    {
        if(c==j)
        {
            for(int q=0;q<ar.length;q++)
            {
                if(ar[q]==arraylist.get(z) && z<=finalarray.length)
                {
                    ar[q] = finalarray[z];
                    z++;
                }
            }
            Toast.makeText(this, "Equall", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,MainActivity3.class);
            intent.putExtra("name ",ar);
            startActivity(intent);

        }
        else
        {
            finalarray[j]=txt.getText().toString();
            k--;
            txt2.setText("Remaining "+k);
            if(j<=c-1)
            {
                txt1.setText(arraylist.get(j));
            }
            j++;




        }
    }

}
