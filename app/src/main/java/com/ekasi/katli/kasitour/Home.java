package com.ekasi.katli.kasitour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView accomodation = (TextView) findViewById(R.id.Accomodation);

        // Set a click listener on that View
        accomodation.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link word_list}
                Intent accomodationIntent = new Intent(Home.this, Accomodation.class);

                // Start the new activity
                startActivity(accomodationIntent);
            }
        });

        // Find the View that shows the family category
        TextView food = (TextView) findViewById(R.id.Food);

        // Set a click listener on that View
        food.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent foodIntent = new Intent(Home.this, Food.class);

                // Start the new activity
                startActivity(foodIntent);
            }
        });

        // Find the View that shows the colors category
        TextView entertainment = (TextView) findViewById(R.id.Entertainment);

        // Set a click listener on that View
        entertainment.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent entertainmentIntent = new Intent(Home.this, Entertainment.class);

                // Start the new activity
                startActivity(entertainmentIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView chill_zone = (TextView) findViewById(R.id.chill_zone);

        // Set a click listener on that View
        chill_zone.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent chillIntent = new Intent(Home.this, ChillZone.class);

                // Start the new activity
                startActivity(chillIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView services = (TextView) findViewById(R.id.services);

        // Set a click listener on that View
        services.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent servicesIntent = new Intent(Home.this, Services.class);

                // Start the new activity
                startActivity(servicesIntent);
            }
        });

        final TextView attractions = (TextView) findViewById(R.id.attractions);

        attractions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent attractionsIntent = new Intent(Home.this, Attractions.class);

                startActivity(attractionsIntent);
            }
        });
    }
}
