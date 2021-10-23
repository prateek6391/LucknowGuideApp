package com.example.lucknowguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.SwitchCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout restaurant = findViewById(R.id.restaurant);
        restaurant.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
//                Create a new Intent to open the {@link RestaurantActivity}
                Intent restaurantIntent = new Intent(MainActivity.this, RestaurantActivity.class);
                //start the new activity
                startActivity(restaurantIntent);
            }
        });

        //Find the view that shows the park category
        RelativeLayout park = findViewById(R.id.park);
        //Set a ClickListener on that view
        park.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
//                Create a new Intent to open the {@link parkMembersActivity}
                Intent parkIntent = new Intent(MainActivity.this, ParkActivity.class);
                //start the new activity
                startActivity(parkIntent);
            }
        });

        //Find the view that shows the mall category
        RelativeLayout mall = findViewById(R.id.shopping_mall);
        //Set a ClickListener on that view
        mall.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
//                Create a new Intent to open the {@link mallActivity}
                Intent mallIntent = new Intent(MainActivity.this, MallActivity.class);
                //start the new activity
                startActivity(mallIntent);
            }
        });

        //  Find the view that shows the history category
        RelativeLayout history = findViewById(R.id.historic_places);
        //Set a ClickListener on that view
        history.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
//                Create a new Intent to open the {@link historyActivity}
                Intent historyIntent = new Intent(MainActivity.this, HistoryActivity.class);
                //start the new activity
                startActivity(historyIntent);
            }
        });
    }
}