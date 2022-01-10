    package com.example.forgroundservice;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationBuilderWithBuilderAccessor;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String CHANNE_ID = "ANDRIOD_CHANNEL";
    String CHANNE_NAME = "ANDRIOD_CHANNEL";

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Intent intent = new Intent(this,DownloadSerivce.class);
//        startForegroundService(intent);
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public void onClick(View view)
    {
        //STEP1 : Create a reference of notification manager throgh notificationMangaer
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE); //GLOBAL SERVICE

        //STEP 2.1 : Create an intent to open an applicaton
        Intent intent  = new Intent(this,MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,intent,0);
        //step 2.2 : creating action
        NotificationCompat.Action action = new NotificationCompat.Action(R.drawable.notification_icon_foreground,"OPEN",null);
        //STEP2.3 : Build a notifcation using notification builder
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,CHANNE_ID).
                setContentTitle("Test Notification").
                setContentText("This is notication").setAutoCancel(true).
                setSmallIcon(R.drawable.notification_icon_foreground).setContentIntent(pendingIntent).addAction(action);

        Notification notification = builder.build();



        //STEP3:
        NotificationChannel notificationChannel = new NotificationChannel(CHANNE_ID,CHANNE_NAME,NotificationManager.IMPORTANCE_DEFAULT);
        nm.createNotificationChannel(notificationChannel);
        //STEP4:
        nm.notify(1234,notification);

    }
}