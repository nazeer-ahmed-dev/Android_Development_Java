package com.example.potatohead;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    int[] array = {R.drawable.hat,R.drawable.eyebrows,R.drawable.eyes,R.drawable.glasses,R.drawable.nose,R.drawable.moustache,R.drawable.mouth,R.drawable.shoes};
    ImageView[] potato = new ImageView[9];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        potato[0] = findViewById(R.id.imageView2);
        potato[1] = findViewById(R.id.imageView3);
        Switch sw1 = findViewById(R.id.switch1);
        Switch sw2 = findViewById(R.id.switch2);
        sw1.setOnCheckedChangeListener(this);
        sw2.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()){
            case R.id.switch1:
                potato[0].setVisibility(View.VISIBLE);
                break;
            case R.id.switch2:
                potato[1].setVisibility(View.VISIBLE);
                break;
        }
//        String tag = buttonView.getTag().toString();
//        int index = Integer.parseInt(tag);
//        if(buttonView.isChecked())
//            potato[index].setVisibility(View.VISIBLE);
//        else
//            potato[index].setVisibility(View.INVISIBLE);

    }
}