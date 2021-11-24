package com.example.lab_task_sec_b;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    ImageView img1,img2;
    Random rnd = new Random();
    int[] array = {R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        img1 =findViewById(R.id.imageView);
        img2 = findViewById(R.id.imageView2);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return  true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.name:
               finish();
               return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }
    public void onClick_Activity2(View view)
    {

    try {
        int val = rnd.nextInt(6);
        int val1 = rnd.nextInt(6);
        img1.setImageResource(array[val]);
        img2.setImageResource(array[val1]);
        if(val==val1)
        {
            Toast.makeText(this, "Match!!!", Toast.LENGTH_SHORT).show();
        }
    }
    catch (Exception ex)
    {
        Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
    }


    }
}