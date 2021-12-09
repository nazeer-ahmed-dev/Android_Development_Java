package com.example.contact_in_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView list;
    person obj;
    ArrayList<person> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.list);
        arrayList = new ArrayList<>();
        arrayList.add(new person("nazeer","abc","033322",R.drawable.bush));
        arrayList.add(new person("ahmed","def","033322",R.drawable.carson));
        arrayList.add(new person("naveed","ghi","033233",R.drawable.chafee));

        UsersAdpater usersAdpater = new UsersAdpater(this,arrayList);
        list.setAdapter(usersAdpater);


    }
}