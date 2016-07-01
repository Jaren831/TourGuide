package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the attractions category
        TextView attractions = (TextView) findViewById(R.id.attractions);
        // Set a click listener on that View
        attractions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@Link AttractionsActivity}
                Intent attractionsIntent = new Intent(MainActivity.this, AttractionsActivity.class);
                startActivity(attractionsIntent);
            }
        });
        // Find the View that shows the food category
        TextView food = (TextView) findViewById(R.id.food);
        // Set a click listener on that View
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@Link AttractionsActivity}
                Intent foodIntent = new Intent(MainActivity.this, FoodActivity.class);
                startActivity(foodIntent);
            }
        });
        // Find the View that shows the hotels category
        TextView hotels = (TextView) findViewById(R.id.hotels);
        // Set a click listener on that View
        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@Link HotelsActivity}
                Intent hotelsIntent = new Intent(MainActivity.this, HotelsActivity.class);
                startActivity(hotelsIntent);
            }
        });
        // Find the View that shows the flights category
        final TextView flights = (TextView) findViewById(R.id.flights);
        // Set a click listener on that View
        flights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@Link FlightsActivity}
                Intent flightsIntent = new Intent(MainActivity.this, FlightsActivity.class);
                startActivity(flightsIntent);
            }
        });

    }
}
