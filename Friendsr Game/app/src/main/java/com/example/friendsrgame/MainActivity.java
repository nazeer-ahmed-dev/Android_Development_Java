package com.example.friendsrgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
       Intent intent = new Intent(this,MainActivity2.class);
        //Toast.makeText(this, v.getTag().toString(), Toast.LENGTH_SHORT).show();
       intent.putExtra("tag1",v.getTag().toString());
       //intent.putExtra("name",);
       startActivity(intent);
    }
}