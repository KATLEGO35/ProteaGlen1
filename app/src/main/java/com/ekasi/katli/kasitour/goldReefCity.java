package com.ekasi.katli.kasitour;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by Katli on 8/6/2017.
 */

public class goldReefCity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gold_reef_city);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("goldReefCity");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    // Set Collapsing Toolbar layout to the screen
    CollapsingToolbarLayout collapsingToolbar =
            (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
// Set title of Detail page
collapsingToolbar.setTitle(getString(R.string.item_title));

}
}