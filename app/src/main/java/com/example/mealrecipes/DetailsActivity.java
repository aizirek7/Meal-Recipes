package com.example.mealrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    ImageView foodImage;
    TextView foodName, kcal, serves, timePreb, timeCook, method;
    DB db = new DB();
    Order order = new Order();
    Order2 order2 = new Order2();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        foodImage = (ImageView) findViewById(R.id.foodImage);
        foodName = (TextView) findViewById(R.id.foodName);
        kcal = (TextView) findViewById(R.id.kcal);
        serves = (TextView) findViewById(R.id.serves);
        timePreb = (TextView) findViewById(R.id.timePrep);
        timeCook = (TextView) findViewById(R.id.timeCook);
        method = (TextView) findViewById(R.id.method);

        check();


    }

    private void check(){
        for (Order order : db.getOrders()) {
            for (Order2  order2 : db.getOrder2s()) {
                if (order.getGoodImage() == order2.getFoodImage() && order.getGoodTitle().equals(order2.getFoodName())){
                    foodImage.setImageResource(order2.getFoodImage());
                    kcal.setText(order2.getKcal());
                    serves.setText(order2.getServes());
                    timePreb.setText(order2.getTimePreb());
                    timeCook.setText(order2.getTimeCook());
                    foodName.setText(order2.getFoodName());
                }
            }
        }
        }
}