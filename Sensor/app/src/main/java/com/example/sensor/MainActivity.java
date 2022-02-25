package com.example.sensor;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
    ImageView img ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.imageView); }
    public void onClick(View view )
    {
        //1- create SensorManger
        SensorManager sm = (SensorManager) getSystemService(SENSOR_SERVICE);
        //2- Creae a Sesnor
        Sensor lighSensor = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        //3.1 Regester Sensor
        sm.registerListener(this,lighSensor,300);
    }
    @Override
    public void onSensorChanged(SensorEvent event) {

        if(event.values[0] > 0)
        {
            img.setImageResource(R.drawable.on);
        }
        else
        {
            img.setImageResource(R.drawable.off);
        }
    }
    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

}