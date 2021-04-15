package com.example.mealrecipes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import java.util.ArrayList;

public class FavouriteAdapter extends ArrayAdapter<Order> {
    Context context;
    int resource;
    CardView cardView;
    DB db = new DB();

    public FavouriteAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Order> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        int goodImage = getItem(position).getGoodImage();
        String goodTitle = getItem(position).getGoodTitle();
        String goodDescription = getItem(position).getGoodDescription();
        String goodTextTime = getItem(position).getGoodTextTime();


        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(resource, parent, false);

        ImageView tv_image = convertView.findViewById(R.id.imageView);
        TextView tv_title = convertView.findViewById(R.id.goodTitle);
        TextView tv_description = convertView.findViewById(R.id.description);
        TextView tv_textTime = convertView.findViewById(R.id.textTime);
        ImageView tv_favorite = convertView.findViewById(R.id.favourite);
        cardView = convertView.findViewById(R.id.cardView);

        tv_image.setImageResource(goodImage);
        tv_title.setText(goodTitle);
        tv_description.setText(goodDescription);
        tv_textTime.setText(goodTextTime);

        return convertView;
    }
}