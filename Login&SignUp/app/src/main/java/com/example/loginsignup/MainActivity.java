package com.example.loginsignup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static int code = 23;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void SignUp(View view )
    {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void Login(View view)
    {
        SharedPreferences pref = getSharedPreferences("filename",MODE_PRIVATE);
        String Name = pref.getString("name","None");
        String Email = pref.getString("email","None");
        String Password = pref.getString("password","None");

        Toast.makeText(this, Name, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}