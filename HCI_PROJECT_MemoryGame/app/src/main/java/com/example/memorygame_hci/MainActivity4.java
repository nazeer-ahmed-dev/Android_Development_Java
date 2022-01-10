package com.example.memorygame_hci;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity4 extends AppCompatActivity {

    Random rnd  = new Random();
    ImageView[] img;
    int[] pics =
            {R.drawable.candy1,R.drawable.candy2,R.drawable.candy3,R.drawable.candy4,R.drawable.candy5,R.drawable.candy6, R.drawable.candy7,
            R.drawable.candy8,R.drawable.candy9,R.drawable.candy10,R.drawable.candy11,R.drawable.candy12,R.drawable.candy13,R.drawable.candy14,
            R.drawable.candy15,R.drawable.candy16,R.drawable.candy17,R.drawable.candy18,R.drawable.candy19,R.drawable.candy20,R.drawable.candy21,
            R.drawable.candy22,R.drawable.candy23,R.drawable.candy24,R.drawable.candy25,R.drawable.candy26,R.drawable.candy27,R.drawable.candy28,
            R.drawable.candy29,R.drawable.candy30};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main4);

        img = new ImageView[]
                {findViewById(R.id.imageView4),findViewById(R.id.imageView14),findViewById(R.id.imageView9),findViewById(R.id.imageView10),
                findViewById(R.id.imageView13),findViewById(R.id.imageView16),findViewById(R.id.imageView11),findViewById(R.id.imageView7),
                findViewById(R.id.imageView17),findViewById(R.id.imageView12),findViewById(R.id.imageView24),findViewById(R.id.imageView18),
                findViewById(R.id.imageView19),findViewById(R.id.imageView21),findViewById(R.id.imageView22),findViewById(R.id.imageView23),
                findViewById(R.id.imageView20),findViewById(R.id.imageView15),findViewById(R.id.imageView26),findViewById(R.id.imageView25)};

            for(int i=0;i<20;i++)
            {
                img[i].setImageResource(pics[rnd.nextInt(30)]);
            }
    }
}
