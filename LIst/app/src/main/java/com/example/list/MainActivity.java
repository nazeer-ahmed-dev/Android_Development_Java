    package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

    public class MainActivity extends AppCompatActivity {

    ArrayList<String> array ;
    ArrayAdapter<String> adpater;
    EditText text;
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.editTextTextPersonName);
        list = findViewById(R.id.list);
        array = new ArrayList<>();
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name = array.get(position);
                Toast.makeText(MainActivity.this, name, Toast.LENGTH_SHORT).show();
            }
        });
        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, array.get(position), Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        adpater = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                array);

    }
    public void onClick(View view)
    {
        String textt = text.getText().toString();
        addITem(textt);

    }
    public void addITem(String item)
    {
        array.add(item);
        list.setAdapter(adpater);
    }
}