package com.example.readingpicfromcamera;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ImageView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    final int code = 3;
    ImageView img ;
   // @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.imageView);
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (ContextCompat.checkSelfPermission(
                this, Manifest.permission.CAMERA) ==
                PackageManager.PERMISSION_GRANTED) {
            //Do Something
            startActivityForResult(intent,code);
        }
        else{
            //request Permission Here
           if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
           {
               requestPermissions(new String[]{Manifest.permission.CAMERA},code);
           }
            //startActivityForResult(intent,code);
        }


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==code && resultCode==RESULT_OK)
        {

                Bitmap bmp = (Bitmap) data.getExtras().get("data");
                img.setImageBitmap(bmp);

        }
    }
}