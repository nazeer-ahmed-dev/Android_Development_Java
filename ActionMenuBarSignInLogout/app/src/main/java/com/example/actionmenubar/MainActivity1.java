package com.example.actionmenubar;

import android.app.AppComponentFactory;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {
    //SharedPreferences pref;
    EditText txt1,txt2,txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        txt1 =findViewById(R.id.txt1);
        txt2 =findViewById(R.id.txt2email);
        txt3 =findViewById(R.id.editTextTextPassword3);
    }
    public void Register(View view)
    {
        try {
             SharedPreferences pref = getSharedPreferences("filename",MODE_PRIVATE);
             SharedPreferences.Editor prefsEditor =pref.edit();
             prefsEditor.putString("name",txt1.getText().toString());
             prefsEditor.putString("email",txt1.getText().toString());
             prefsEditor.putString("password",txt1.getText().toString());
             prefsEditor.commit();
             finish();
        }
        catch (Exception ex)
        {
            Toast.makeText(this, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
