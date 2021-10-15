package com.example.potatoheadgame;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img1 = findViewById(R.id.cap);
        ImageView img2 = findViewById(R.id.eyes);
        ImageView img3 = findViewById(R.id.glasses);
        ImageView img4 = findViewById(R.id.nose);
        ImageView img5 = findViewById(R.id.ears);
        ImageView img6 = findViewById(R.id.teeth);
        ImageView img7 = findViewById(R.id.mustache);
        ImageView img8 = findViewById(R.id.imageView10);

        img1.setVisibility(View.INVISIBLE);
        img2.setVisibility(View.INVISIBLE);
        img3.setVisibility(View.INVISIBLE);
        img4.setVisibility(View.INVISIBLE);
        img5.setVisibility(View.INVISIBLE);
        img6.setVisibility(View.INVISIBLE);
        img7.setVisibility(View.INVISIBLE);
        img8.setVisibility(View.INVISIBLE);


        CheckBox cap_box = findViewById(R.id.checkBox);
        CheckBox eye = findViewById(R.id.checkBox2);
        CheckBox glasses = findViewById(R.id.checkBox4);
        CheckBox ears = findViewById(R.id.checkBox8);
        CheckBox nose = findViewById(R.id.checkBox5);
        CheckBox muche = findViewById(R.id.checkBox9);
        CheckBox teeth = findViewById(R.id.checkBox7);
        CheckBox shoes = findViewById(R.id.checkBox11);

        cap_box.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    img1.setVisibility(View.VISIBLE);
                } else {
                    img1.setVisibility(View.INVISIBLE);
                }
            }
        });
        eye.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    img2.setVisibility(View.VISIBLE);
                } else {
                    img2.setVisibility(View.INVISIBLE);
                }
            }
        });
        glasses.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    img3.setVisibility(View.VISIBLE);
                } else {
                    img3.setVisibility(View.INVISIBLE);
                }
            }
        });

        ears.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    img5.setVisibility(View.VISIBLE);
                } else {
                    img5.setVisibility(View.INVISIBLE);
                }
            }
        });
        nose.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    img4.setVisibility(View.VISIBLE);
                } else {
                    img4.setVisibility(View.INVISIBLE);
                }
            }
        });
        muche.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    img7.setVisibility(View.VISIBLE);
                } else {
                    img7.setVisibility(View.INVISIBLE);
                }
            }
        });
        teeth.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    img6.setVisibility(View.VISIBLE);
                } else {
                    img6.setVisibility(View.INVISIBLE);
                }
            }
        });
        shoes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    img8.setVisibility(View.VISIBLE);
                } else {
                    img8.setVisibility(View.INVISIBLE);
                }
            }
        });

    }
}