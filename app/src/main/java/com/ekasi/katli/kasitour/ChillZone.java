/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ekasi.katli.kasitour;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Accomodation} shows a list of Android platform releases.
 * For each release, display the name, version number, and image.
 */
public class ChillZone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chill_zone);

        // Create an ArrayList of AndroidFlavor objects
        ArrayList<Category> categories = new ArrayList<Category>();
        categories.add(new Category("Donut", "1.6",R.drawable.launcher));
        categories.add(new Category("Eclair", "2.0-2.1",R.drawable.launcher));
        categories.add(new Category("Froyo", "2.2-2.2.3", R.drawable.launcher));
        categories.add(new Category("GingerBread", "2.3-2.3.7", R.drawable.launcher));
        categories.add(new Category("Honeycomb", "3.0-3.2.6", R.drawable.launcher));
        categories.add(new Category("Ice Cream Sandwich", "4.0-4.0.4", R.drawable.launcher));
        categories.add(new Category("Jelly Bean", "4.1-4.3.1", R.drawable.launcher));
        categories.add(new Category("KitKat", "4.4-4.4.4",R.drawable.launcher));
        categories.add(new Category("Lollipop", "5.0-5.1.1",R.drawable.launcher));
        categories.add(new Category("Marshmallow", "6.0-6.0.1", R.drawable.launcher));

        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        CategoryAdapter categoryAdapter = new CategoryAdapter(this, categories);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_category);
        listView.setAdapter(categoryAdapter);
    }
}

