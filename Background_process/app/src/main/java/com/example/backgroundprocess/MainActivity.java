package com.example.backgroundprocess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Handler handler;
    int c= 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.textview1);
        handler = new Handler();



    }
    public void onClick(View view)
    {

            method();

    }
    public void method()
    {
        for(int i=0;i<20;i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {

//                txt.post(new Runnable(){
//                    @Override
//                    public void run()
//                    {
//                        c++;
//                        txt.setText(c+"");
//                    }
//                });

//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        c++;
//                        txt.setText(c+"");
//                    }
//                });

                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            c++;
                            try {
                                Thread.sleep(1000);

                            } catch (InterruptedException ex) {
                                ex.printStackTrace();
                            }

                            txt.setText(c + "");
                        }

                    });
//                try {
//                    Thread.sleep(200);
//                    c++;
//                }
//                catch (InterruptedException ex)
//                {
//                    ex.printStackTrace();
//                }

                }

            });
            thread.start();
        }

        try {
            Thread.sleep(1000);

        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}