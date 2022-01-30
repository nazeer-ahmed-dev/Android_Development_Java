package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    TextInputEditText txt;
    ListView list;
    FoodItem foodItem;
    ArrayList<FoodItem> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main3);
        txt = findViewById(R.id.search_value);
        list = findViewById(R.id.list);
        arrayList = new ArrayList<>();
        arrayList.add(new FoodItem("Banana",R.drawable.bg,10,100,1));
        arrayList.add(new FoodItem("Apple",R.drawable.bg,10,100,1));
        arrayList.add(new FoodItem("Orange",R.drawable.bg,10,100,1));
        arrayList.add(new FoodItem("Orange",R.drawable.bg,10,100,1));
        arrayList.add(new FoodItem("Orange",R.drawable.bg,10,100,1));
        arrayList.add(new FoodItem("Apple",R.drawable.bg,10,100,1));
        arrayList.add(new FoodItem("Banana",R.drawable.bg,10,100,1));


        UserAdapter userAdapter = new UserAdapter(this,arrayList);
        list.setAdapter(userAdapter);

        txt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                ArrayList<FoodItem> result = new ArrayList<>();

                for(FoodItem x : arrayList)
                {
                    if(x.name.contains(s))
                    {
                        result.add(x);
                    }
                    else
                    {
                        Toast.makeText(MainActivity3.this, "Not Availabe", Toast.LENGTH_SHORT).show();
                    }
                }

                ((UserAdapter)list.getAdapter()).update(result);


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });



    }
    public void onBackCLick(View view)
    {
        finish();
    }
}