package com.example.sqllite;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    DBhelperr obj ;
    GridLayout grd;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        grd = findViewById(R.id.grid);
        obj = new DBhelperr(this);
        dataPrint();


    }
    public void dataPrint()
    {

        Cursor cr = obj.GetDate();
       if(cr.moveToFirst())
        {
            do{
               // int id = cr.getInt(cr.getColumnIndex("ID"));
                String name = cr.getString(cr.getColumnIndex("USERNAME"));

//                TextView tv = new TextView(this);
//                tv.setText(id+"");
//                grd.addView(tv);

                TextView txt = new TextView(this);
                txt.setText(name);
                grd.addView(txt);

            }
            while (cr.moveToNext());
            cr.close();
        }
    }
//    public void onClick(View v)
//    {
//        GridLayout grd = findViewById(R.id.grid);
//        TextView tv = new TextView(this);
//        tv.setText("hi");
//        grd.addView(tv);
//    }
}
