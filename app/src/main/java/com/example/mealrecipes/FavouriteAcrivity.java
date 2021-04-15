package com.example.mealrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FavouriteAcrivity extends AppCompatActivity {
    ImageView favourite, imageView;
    ListView listView;
    TextView textTime, description, goodTitle;
    private ArrayList<Order> orders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_acrivity);

        favourite = (ImageView) findViewById(R.id.favourite);
        textTime = (TextView) findViewById(R.id.textTime);
        description = (TextView) findViewById(R.id.description);
        goodTitle = (TextView) findViewById(R.id.goodTitle);
        imageView = (ImageView) findViewById(R.id.imageView);
        listView = (ListView) findViewById(R.id.listView);

        orders = DB.orders2;

        FavouriteAdapter favouriteAdapter = new FavouriteAdapter(FavouriteAcrivity.this, R.layout.item, orders);
        listView.setAdapter(favouriteAdapter);

    }
}