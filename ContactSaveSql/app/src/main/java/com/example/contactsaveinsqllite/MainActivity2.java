package com.example.contactsaveinsqllite;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    DBHelper obj;
    ListView list;
    ArrayList<String> array;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        list = findViewById(R.id.list);

        array = new ArrayList<>();
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,array);
        obj = new DBHelper(this);


        Cursor cr = obj.GetDate();
        if(cr.moveToFirst())
        {
            do{
                String name = cr.getString(cr.getColumnIndex("NAME"));
                array.add(name);

            }
            while (cr.moveToNext());
            cr.close();
        }
        list.setAdapter(arrayAdapter);

    }
}
