package com.example.shabnam.ortourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the shopping category
        TextView shopping = (TextView) findViewById(R.id.shopping);

        // Set a click listener on that View
        shopping.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the shopping category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ShoppingActivity}
                Intent shoppingIntent = new Intent(MainActivity.this, ShoppingActivity.class);

                // Start the new activity
                startActivity(shoppingIntent);
            }
        });

        // Find the View that shows the WaterFalls category
        TextView waterfalls = (TextView) findViewById(R.id.waterfalls);

        // Set a click listener on that View
        waterfalls.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Waterfalls category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link WaterfallsActivity}
                Intent waterfallsIntent = new Intent(MainActivity.this, WaterfallsActivity.class);

                // Start the new activity
                startActivity(waterfallsIntent);
            }
        });

        // Find the View that shows the Coast category
        TextView coast = (TextView) findViewById(R.id.coast);

        // Set a click listener on that View
        coast.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Coast category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link CoastActivity}
                Intent coastIntent = new Intent(MainActivity.this, CoastActivity.class);

                // Start the new activity
                startActivity(coastIntent);
            }
        });

        // Find the View that shows the Daytour category
        TextView daytour = (TextView) findViewById(R.id.daytour);

        // Set a click listener on that View
        daytour.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the DayTour category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link CoastActivity}
                Intent daytourIntent = new Intent(MainActivity.this, DaytourActivity.class);

                // Start the new activity
                startActivity(daytourIntent);
            }
        });
    }
}
