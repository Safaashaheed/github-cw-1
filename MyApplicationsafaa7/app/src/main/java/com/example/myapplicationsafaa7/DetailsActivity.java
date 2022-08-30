package com.example.myapplicationsafaa7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_details);super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();
        Items isSerializable = (Items) bundle.getSerializable("Items");
        TextView ItemNameText = findViewById(R.id.textView);
        ImageView itemImageView = findViewById(R.id.imageView2);
        ItemNameText.setText(isSerializable.getItemName());
        itemImageView.setImageResource(isSerializable.getItemImage());


    }
}