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


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * {@link Accomodation} shows a list of Android platform releases.
 * For each release, display the name, version number, and image.
 */
public class Accomodation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accomodation);

        // Create an ArrayList of AndroidFlavor objects
        final ArrayList<Category> categories = new ArrayList<Category>();
        categories.add(new Category("Ekuthuleni Guest House", "West Rand", R.drawable.main));
        categories.add(new Category("Dithakong Bed and Breakfast", "West Rand", R.drawable.d1));
        categories.add(new Category("Zazas Guest House and Spa", "Johannesburg", R.drawable.z1));
        categories.add(new Category("Pimville Guest House", "West Rand", R.drawable.pv1));
        categories.add(new Category("Flossie's B&B", "West Rand", R.drawable.main_two));
        categories.add(new Category("Lebo's Soweto Backpackers", "Orlando West", R.drawable.main_two));
        categories.add(new Category("Plekkie in die Son Backpackers", "West Rand", R.drawable.pl1));
        categories.add(new Category("Don Picasso B&B", "Johannesburg", R.drawable.do1));
        categories.add(new Category("The Old's Charm", "West Rand", R.drawable.ol));
        categories.add(new Category("O'Hanna's B&B & Guest House", "West Rand", R.drawable.oh1));

        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        CategoryAdapter categoryAdapter = new CategoryAdapter(this, categories);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_category);
        listView.setAdapter(categoryAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch(position){
                    case 0:
                        Intent intent = new Intent(Accomodation.this, Ekuthuleni.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(Accomodation.this, Dithakong.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(Accomodation.this, zazas.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(Accomodation.this, Pimville.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(Accomodation.this, Entertainment.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(Accomodation.this, Lebo.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(Accomodation.this, Plekkie.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(Accomodation.this, Don.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(Accomodation.this, Old.class);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(Accomodation.this, Hanna.class);
                        startActivity(intent9);
                        break;
                }

                Category category = categories.get(position);
                Toast.makeText(Accomodation.this,category.getCategoryName()+  "Was clicked",Toast.LENGTH_LONG).show();
            }
        });
    }
}

