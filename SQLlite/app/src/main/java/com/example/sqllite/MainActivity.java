package com.example.sqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText Id , Username , Email , Password;
    TextView txt;
    DBhelperr obj ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Id = findViewById(R.id.editTextTextPersonName2);
        Username = findViewById(R.id.editTextTextPersonName);
        Email = findViewById(R.id.editTextTextEmailAddress);
        Password = findViewById(R.id.editTextTextPassword);
        txt = findViewById(R.id.textView2);
        obj = new DBhelperr(this);
    }
    public void Insert(View view)
    {
        try {
            obj.insertInto(Integer.parseInt(Id.getText().toString()),Username.getText().toString(),Email.getText().toString(),Password.getText().toString());
            Toast.makeText(this, "Data Inserted", Toast.LENGTH_SHORT).show();
        }
        catch (Exception ex) {
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    public void Delete(View view)
    {
        Cursor cr = obj.GetDate();
        txt.setText(cr.getCount()+"");
    }
    public void Update(View view) {

    }
    public void Show(View view)
    {
            Intent intent = new Intent(this,MainActivity2.class);
            startActivity(intent);

    }

}







// for practise
//        SQLiteDatabase db  = openOrCreateDatabase("STUDENT",MODE_PRIVATE,null); // creating or opening database
//
//        String query = "CREATE TABLE  IF NOT EXISTS LOGIN(ID INTEGER , USERNAME TEXT , PASSWORD TEXT)";
//
//        db.execSQL(query);
//        ContentValues cv = new ContentValues();
//        cv.put("ID",3);
//        cv.put("USERNAME","NAZEER");
//        cv.put("PASSWORD","123");
//        db.insert("LOGGIN",null,cv); // if column is nullalbe then comma separated
//
//        String insertQuery = "INSERT INTO LOGIN VALUES(1,'Nazeer','123')";
//        db.execSQL(insertQuery);
//
//        Cursor cursor = db.rawQuery("SELECT * FROM LOGIN",null);
//        cursor.moveToFirst();
//
//        while(cursor.moveToNext())
//        {
//            String username = cursor.getString(1);
//            Toast.makeText(this, username, Toast.LENGTH_SHORT).show();
//        }
//
//    }