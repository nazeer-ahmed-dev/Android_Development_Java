package com.example.mutipleactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int code = 22;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextTextPersonName);
    }
    public void onClick(View view)
    {
        Intent intent = new Intent(this,MainActivity2.class);
        String name = editText.getText().toString();
        intent.putExtra("name",name);

        startActivityForResult(intent,code);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == code)
        {
            String data1 = data.getStringExtra("name1");
            String data2 = data.getStringExtra("name2");
            Toast.makeText(this,data1+" "+data2, Toast.LENGTH_SHORT).show();

        }
    }
}