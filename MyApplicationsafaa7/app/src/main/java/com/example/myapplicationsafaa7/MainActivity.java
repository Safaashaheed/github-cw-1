package com.example.myapplicationsafaa7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
      ArrayList<Items> Itemslist = new ArrayList<Items>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      Items cheese = new Items("cheese" , R.drawable.cheese ,2.0);
      Items chocolate = new Items("chocolate" , R.drawable.chocolate,1.0);
      Items honey = new Items("honey" , R.drawable.honey,3.0);
      Items fries = new Items("fries", R.drawable.fries,2.0);
      Items donut = new Items("donut" , R.drawable.donut,1.0);
      Items coffee = new Items("coffee" , R.drawable.coffee,3.0);
        Itemslist.add(cheese);
        Itemslist.add(chocolate);
        Itemslist.add(honey);
        Itemslist.add(fries);
        Itemslist.add(donut);
        Itemslist.add(coffee);

        ItemAdapter itemAdapter = new ItemAdapter(this , 0 , Itemslist);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(itemAdapter);

listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Items currentItemt = Itemslist.get(i);
        Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
        intent.putExtra("Items",currentItemt);
        startActivity(intent);
    }
});
    }
      }





