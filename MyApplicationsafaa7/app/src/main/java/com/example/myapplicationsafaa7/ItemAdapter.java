package com.example.myapplicationsafaa7;

import android.app.AlertDialog;
import android.app.UiAutomation;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ItemAdapter extends ArrayAdapter<Items> {
    List<Items> ItemsList;
    public ItemAdapter(@NonNull Context context, int resource, @NonNull List<Items> objects) {
        super(context, resource, objects);
        ItemsList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        Items currentItem = ItemsList.get(position);
        TextView itemName = view.findViewById(R.id.textViewName);
        TextView itemPrice = view.findViewById(R.id.textViewPrice);
        ImageView imageView = view.findViewById(R.id.imageView);
        itemName.setText(currentItem.getItemName());
        itemPrice.setText(String.valueOf(currentItem.getItemPrice()));
        imageView.setImageResource(currentItem.getItemImage());


        ImageView deletButton = view.findViewById(R.id.deletBtn);
        deletButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ItemsList.remove(position);
                //notifyDataSetChanged();
                Items removeitem = ItemsList.get(position);


                //}).setNegativeButton("cancel", new DialogInterface.OnClickListener()
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext()).setMessage("ara yiu sure you want delet???")
                        //AlertDialog.Builder builder = new AlertDialog.Builder(getContext()).setMassage("ara yiu sure you want delet???")
                        .setTitle("delet").setPositiveButton("delet", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                ItemsList.remove(removeitem);
                                notifyDataSetChanged();
                            }

                        }).setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        });
                builder.show();
            }

        });


   return view ;
    }
}
