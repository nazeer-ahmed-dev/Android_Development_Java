package com.example.workmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Step2 : Work request : one time or periodic request

        WorkRequest oneTimeRequest = new OneTimeWorkRequest.Builder(UploadWorker.class).build();

        WorkManager workManager = WorkManager.getInstance(this);
        workManager.enqueue(oneTimeRequest);     // enqueue  or uniqueenqueue
    }
    public void AddLightSensor(View view)
    {
        //1- create SensorManger
        SensorManager sm = (SensorManager) getSystemService(SENSOR_SERVICE);

        //2- Creae a Sesnor
        Sensor lighSensor = sm.getDefaultSensor(Sensor.TYPE_LIGHT);

        //3.1 Regester Sensor
        sm.registerListener(new LightListener(),lighSensor,300);

    }

    //3
    class LightListener implements SensorEventListener
    {

        @Override
        public void onSensorChanged(SensorEvent event) {
            Toast.makeText(MainActivity.this, event.values[0]+"", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int accuracy) {

        }
    }
}
