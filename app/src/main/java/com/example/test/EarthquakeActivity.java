package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<Earthquake> earthquakes = new ArrayList<>();
        earthquakes.add(new Earthquake("7","Lanfranco", "22feb"));
        earthquakes.add(new Earthquake("8","franc", "22feb"));
        earthquakes.add(new Earthquake("9","LA", "23feb"));
        earthquakes.add(new Earthquake("5","New york", "24feb"));
        earthquakes.add(new Earthquake("6","Texas", "25feb"));
        earthquakes.add(new Earthquake("7","Sydne", "26feb"));
        earthquakes.add(new Earthquake("8","Detriote", "27feb"));
        earthquakes.add(new Earthquake("9","Mumbai", "28feb"));
        earthquakes.add(new Earthquake("10","Bhopal", "02feb"));



        // Find a reference to the {@link ListView} in the layout
        //ListView earthquakeListView = (ListView) findViewById(R.id.list);
        EarthquakeAdapter earthquakeAdapter = new EarthquakeAdapter(this, earthquakes);

        /*
        // Create a new {@link ArrayAdapter} of earthquakes
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
        */

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(earthquakeAdapter);
    }
}