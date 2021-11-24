package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Login(View view)
    {
        SharedPreferences prefs = getSharedPreferences("filename",MODE_PRIVATE);
        String name = prefs.getString("Name","defalut");
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
    }
    public void Signup(View view)
    {
        Intent intent = new Intent(this, MainActivity1.class);
        startActivity(intent);

    }
}
