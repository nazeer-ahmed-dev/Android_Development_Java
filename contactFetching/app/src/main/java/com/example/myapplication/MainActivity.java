package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // - get the object of content resolver
        ContentResolver contentResolver = getContentResolver();

        //2 . Query with content resolver object
        Cursor cursor = contentResolver.query(ContactsContract.Contacts.CONTENT_URI,new String[]{ContactsContract.Contacts.DISPLAY_NAME},null,null,"ASC");

        if(cursor.moveToFirst())
        {
            do{
                Toast.makeText(this, cursor.getString(0), Toast.LENGTH_SHORT).show();
            }
            while (cursor.moveToNext());
        }

    }
}