package com.example.mealrecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class FavouriteAcrivity extends AppCompatActivity {
    ImageView favourite, imageView;
    ListView listView;
    TextView textTime, description, goodTitle;
    DB db = new DB();

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

        db.getFavourite().add(new Order(R.drawable.food1, "sdvfbnvcz", "egrthffgd", "rgtrhrh"));


        FavouriteAdapter fruitsAdapter = new FavouriteAdapter(FavouriteAcrivity.this , R.layout.item, db.getFavourite());
        listView.setAdapter(fruitsAdapter);



    }


}