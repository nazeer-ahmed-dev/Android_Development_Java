package com.example.moquelumnan;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView list1;
    ArrayList<Baloon> arrayList;
    int[] images = {R.drawable.number_one,R.drawable.number_two,R.drawable.number_three,R.drawable.number_four,R.drawable.number_five,R.drawable.number_six,R.drawable.number_seven,R.drawable.number_eight,R.drawable.number_nine,R.drawable.number_ten};
    int[] audio = {R.raw.number_one,R.raw.number_two,R.raw.number_three,R.raw.number_four,R.raw.number_five,R.raw.number_six,R.raw.number_seven,R.raw.number_eight,R.raw.number_nine,R.raw.number_ten};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list1 = findViewById(R.id.list1);
        arrayList = new ArrayList<>();

        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), audio[position]);
                mp.start();
            }
        });

        for(int i=0;i<10;i++)
        {
            arrayList.add(new Baloon(images[i],i+1));
        }
        ForAdpater forAdpater =new ForAdpater(this,arrayList);

        list1.setAdapter(forAdpater);
    }


}