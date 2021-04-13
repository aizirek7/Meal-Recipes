package com.example.mealrecipes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageView favourite, imageView;
    Intent intent;
    RecyclerView recyclerView;
    TextView textTime, description, goodTitle;
    DB db = new DB();
    Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        favourite = (ImageView) findViewById(R.id.favourite);
        textTime = (TextView) findViewById(R.id.textTime);
        description = (TextView) findViewById(R.id.description);
        goodTitle = (TextView) findViewById(R.id.goodTitle);
        imageView = (ImageView) findViewById(R.id.imageView);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        menu = (Menu) findViewById(R.id.hard);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));




        db.getOrders().add(new Order(R.drawable.food1, "The ultimate makeover: Fish & chips", "Angela Nilsen takes the British favourite and gives it a lighter, healthier, and modern twist", "65 min"));
        db.getOrders().add(new Order(R.drawable.food1, "The ultimate", "Angela Nilsen takes the British favourite and gives it a lighter, healthier, and modern twist", "130 min"));
        db.getOrders().add(new Order(R.drawable.food1, "The ultimate makeover: Fish", "Angela Nilsen takes the British favourite and gives it a lighter, healthier, and modern twist", "200 min"));

        db.getOrder2s().add(new Order2(R.drawable.food1, "The ultimate makeover: Fish & chips", "123 min", "45 min", "123", "7", "Method\n" +
                "STEP 1\n" +
                "Put a large saucepan on a medium heat and add 1 tbsp olive oil.\n" +
                "\n" +
                "STEP 2\n" +
                "Add 4 finely chopped bacon rashers and fry for 10 mins until golden and crisp.\n" +
                "\n" +
                "STEP 3\n" +
                "Reduce the heat and add the 2 onions, 2 carrots, 2 celery sticks, 2 garlic cloves and the leaves from 2-3 sprigs rosemary, all finely chopped, then fry for 10 mins. Stir the veg often until it softens.\n" +
                "\n" +
                "STEP 4\n" +
                "Increase the heat to medium-high, add 500g beef mince and cook stirring for 3-4 mins until the meat is browned all over.\n" +
                "\n" +
                "STEP 5\n" +
                "Add 2 tins plum tomatoes, the finely chopped leaves from ¾ small pack basil, 1 tsp dried oregano, 2 bay leaves, 2 tbsp tomato purée, 1 beef stock cube, 1 deseeded and finely chopped red chilli (if using), 125ml red wine and 6 halved cherry tomatoes. Stir with a wooden spoon, breaking up the plum tomatoes.\n" +
                "\n" +
                "STEP 6\n" +
                "Bring to the boil, reduce to a gentle simmer and cover with a lid. Cook for 1 hr 15 mins stirring occasionally, until you have a rich, thick sauce.\n" +
                "\n" +
                "STEP 7\n" +
                "Add the 75g grated parmesan, check the seasoning and stir.\n" +
                "\n" +
                "STEP 8\n" +
                "When the bolognese is nearly finished, cook 400g spaghetti following the pack instructions.\n" +
                "\n" +
                "STEP 9\n" +
                "Drain the spaghetti and either stir into the bolognese sauce, or serve the sauce on top. Serve with more grated parmesan, the remaining basil leaves and crusty bread, if you like."));


        mealAdapter mealAdapter = new mealAdapter(db.getOrders());
        mealAdapter.setItemClickListener(new mealAdapter.ItemClickListener() {
            @Override
            public void ItemClick(int position) {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                startActivity(intent);


            }
        });
        recyclerView.setAdapter(mealAdapter);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);

    }




    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.hard:
                intent = new Intent(MainActivity.this, FavouriteAcrivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}



