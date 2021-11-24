package com.example.loginsignup;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {


    EditText Name,Email,Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        Name = findViewById(R.id.editTextTextEmailAddress);
        Email = findViewById(R.id.editTextTextEmailAddress3);
        Password = findViewById(R.id.editTextTextPassword);


    }
    public void Register(View view)
    {


        try {
            SharedPreferences prefs = getSharedPreferences("filename", MODE_PRIVATE);
            SharedPreferences.Editor prefsEditor = prefs.edit();
            prefsEditor.putString("name", Name.getText().toString());
            prefsEditor.putString("email", Email.getText().toString());
            prefsEditor.putString("password", Password.getText().toString());
            prefsEditor.apply();
        }catch (Exception ex)
        {
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
        finish();
    }
    public void Login(View view)
    {
        finish();
    }
}
