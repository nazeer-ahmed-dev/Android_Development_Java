package com.example.lifecycleofactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //TextView txt = findViewById(R.id.textView);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("called","On Start");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("called","On Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("called","On Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("called","On Stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("called","On Restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("called","On Destroy");
    }
}