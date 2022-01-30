package com.example.foodapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class UserAdapter extends ArrayAdapter<FoodItem> {

    ArrayList<FoodItem> itemsss;
    int quantity_of_item ;
    public UserAdapter(Context context , ArrayList<FoodItem> foodItemArrayList)
    {
        super(context,0,foodItemArrayList);
    }
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        quantity_of_item =0;
        FoodItem item = getItem(position);
        if(convertView==null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.rew_of_layout,parent,false);

        }
        ImageView img = convertView.findViewById(R.id.imageView7);
        TextView availabe = convertView.findViewById(R.id.textView9);
        Button decrment = convertView.findViewById(R.id.button);
        Button increment = convertView.findViewById(R.id.button5);
        EditText value = convertView.findViewById(R.id.editTextTextPersonName2);
        TextView name  = convertView.findViewById(R.id.textView11);
        TextView price = convertView.findViewById(R.id.textView5);

        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity_of_item++;
                value.setText(quantity_of_item+"");
            }
        });
        decrment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity_of_item>0)
                {
                    quantity_of_item--;
                    value.setText(quantity_of_item+"");
                }

            }
        });

        String  val = item.getQuantity()+"";
        availabe.setText("Available : "+val);
        val = item.getPrice()+"";
        price.setText("Price : "+val);
        img.setImageResource(item.getPic());
        name.setText(item.getName());


        //TextView txt = convertView.findViewById(R.id.);
        return convertView;
    }
    public void  update(ArrayList<FoodItem> item)
    {
           itemsss = new ArrayList<FoodItem>();
           itemsss.addAll(item);
           notifyDataSetChanged();
    }
}
