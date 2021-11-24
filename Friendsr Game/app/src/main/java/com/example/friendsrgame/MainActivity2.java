package com.example.friendsrgame;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    int[] ar = {R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_xml);

        Intent intent = getIntent();
        //Toast.makeText(this, intent.getStringExtra("tag1"), Toast.LENGTH_SHORT).show();
        int val = Integer.parseInt(intent.getStringExtra("tag1").toString());
       ImageView img = findViewById(R.id.imageView5);
        TextView txt = findViewById(R.id.textView7);
        img.setImageResource(ar[val]);
        //txt.setText(intent.getStringExtra("name"));




    }
}
