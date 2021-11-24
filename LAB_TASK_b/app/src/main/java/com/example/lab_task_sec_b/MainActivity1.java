package com.example.lab_task_sec_b;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {

    ActionMode actionMode;
    TextView txt1,txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        txt1 = findViewById(R.id.editTextTextPersonName3);
        txt2 = findViewById(R.id.editTextTextPassword);
        txt2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if(actionMode!=null)
                return false;
                else
                    actionMode = startActionMode(actionMOdeCallback);
                    return true;
            }
        });
    }
   // private ActionMode.Callback act = new Act
    private ActionMode.Callback actionMOdeCallback = new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.action_menu,menu);
            mode.setTitle("1");
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            return false;
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {

        }
    };
    public void Onclick(View view)
    {

        if(txt1.getText().toString().matches("") && txt2.getText().toString().matches(""))//Toast.makeText(this, txt1.getText().toString()+txt2.getText().toString(), Toast.LENGTH_SHORT).show();
        {

            Toast.makeText(this, "Enter Username and Password", Toast.LENGTH_SHORT).show();
        }
        else {
            SharedPreferences prefs = getSharedPreferences("file", MODE_PRIVATE);
            SharedPreferences.Editor prfEditor = prefs.edit();
            prfEditor.putString("username", txt1.getText().toString());
            prfEditor.putString("paswd", txt2.getText().toString());
            prfEditor.apply();
            finish();

        }
    }
}