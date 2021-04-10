package com.example.mealrecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    DB db = new DB();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        db.getOrders().add(new Order(R.drawable.food1, "The ultimate makeover: Fish & chips", "Angela Nilsen takes the British favourite and gives it a lighter, healthier, and modern twist", "65 min"));
        db.getOrders().add(new Order(R.drawable.food1, "The ultimate makeover: Fish & chips", "Angela Nilsen takes the British favourite and gives it a lighter, healthier, and modern twist", "130 min"));
        db.getOrders().add(new Order(R.drawable.food1, "The ultimate makeover: Fish & chips", "Angela Nilsen takes the British favourite and gives it a lighter, healthier, and modern twist", "200 min"));
        db.getOrders().add(new Order(R.drawable.food1, "The ultimate makeover: Fish & chips", "Angela Nilsen takes the British favourite and gives it a lighter, healthier, and modern twist", "7 min"));
        db.getOrders().add(new Order(R.drawable.food1, "The ultimate makeover: Fish & chips", "Angela Nilsen takes the British favourite and gives it a lighter, healthier, and modern twist", "12 min"));


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        mealAdapter mealAdapter = new mealAdapter(db.getOrders());
        recyclerView.setAdapter(mealAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);

    }
}