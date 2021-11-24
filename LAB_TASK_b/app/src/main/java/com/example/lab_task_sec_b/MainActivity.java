package com.example.lab_task_sec_b;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    EditText etxt1,etxt2;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etxt1 = findViewById(R.id.editTextTextPersonName);
        etxt2 = findViewById(R.id.editTextTextPassword2);
        t  = findViewById(R.id.textView);
        registerForContextMenu(t);


    }
    public void onClick(View view)
    {

        SharedPreferences shr = getSharedPreferences("file",MODE_PRIVATE);
        String user = shr.getString("username","default");
        String pasd = shr.getString("paswd","default");
        if(etxt1.getText().toString().matches(user) && etxt2.getText().toString().matches(pasd))
        {
            Intent intent = new Intent(this,MainActivity2.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "Dont Match !!", Toast.LENGTH_SHORT).show();
        }
    }
    public void SignUp(View view)
    {
        Intent intent = new Intent(this,MainActivity1.class);
        startActivity(intent);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("done");
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.floating_layout,menu);



    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.id1:
                finish();
                return true;
            default:
                return super.onContextItemSelected(item);
        }

    }
}