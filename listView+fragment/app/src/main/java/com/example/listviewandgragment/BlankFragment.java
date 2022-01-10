package com.example.listviewandgragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BlankFragment extends Fragment {

    ArrayAdapter<String> arrayAdapter;
    //BlankFragment2 obj = new BlankFragment2();
    String[] names = {"Bush","Carson","Chafee","Clinton","Omalley","Rubio","Sanders","Trump"};
    ListView list;
    BlankFragment2 obj;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_blank, container, false);
        list = view.findViewById(R.id.list);
        arrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,names);
        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
           obj = new BlankFragment2();
           obj.method(position,names[position]);
           getFragmentManager().beginTransaction().replace(R.id.fragment2,obj).commit();
            }
        });

        return  view;
    }

}