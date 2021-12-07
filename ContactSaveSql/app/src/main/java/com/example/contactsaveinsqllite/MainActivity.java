package com.example.contactsaveinsqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DBHelper obj ;
    EditText Name,Phone,street,Email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = findViewById(R.id.editTextTextPersonName);
        Phone = findViewById(R.id.editTextPhone);
        street = findViewById(R.id.editTextTextPersonName2);
        Email = findViewById(R.id.editTextTextEmailAddress);
        obj = new DBHelper(this);

    }
    public void InsertData(View view)
    {
        try {
            obj.insertInto(Name.getText().toString(),Integer.parseInt(Phone.getText().toString()),street.getText().toString(),Email.getText().toString());
            Toast.makeText(this, "Data Inserted", Toast.LENGTH_SHORT).show();
        }
        catch (Exception ex) {
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    public void CheckContact(View view)
    {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}