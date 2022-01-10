package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    //Thread thread;
    Handler handler;
    Thread thread;
    int sec=0;
    int mints=0;
    boolean check = false;
    int hours =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.textView2);
        handler = new Handler();

    }
    public void onStart1(View view)
    {
        call(true);
    }
    public void call(boolean val)
    {
         thread  = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true)
                {
                    if(sec==60)
                    {
                        mints++;
                        sec=0;
                    }
                    if(mints==60)
                    {
                        hours++;
                        mints=0;
                    }

                    try {
                        Thread.sleep(1000);
                    }
                    catch (Exception ex)
                    {
                        ex.printStackTrace();
                    }
                    txt.setText(hours+" : "+mints+" : "+sec);
                    sec++;


                }
            }
        });

        if(val)
        {
            thread.start();
        }
        else
        {
            try {

                thread.stop();
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    public void onStop1(View view)
    {
            call(false);
    }
    public void onRestart1(View view)
    {
         mints=0;
         sec=0;
         hours=0;
    }
    public void onStart2(View view)
    {

    }
    public void onStop2(View view)
    {

    }
    public void onRestart2(View view)
    {

    }

}