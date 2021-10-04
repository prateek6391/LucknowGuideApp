package com.example.lucknowguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_list);

        // Create a list of guided
        final ArrayList<Guide> guided = new ArrayList<Guide>();
        guided.add(new Guide("Best Masala dhosa and uttapam", "Moti Mahal Restaurant", R.drawable.saladd));
        guided.add(new Guide("All-day dining in a contemporary eatery serving Indian, Continental & Asian fare, with a buffet.", "All Day Dining and Takeaway", R.drawable.tray));
        guided.add(new Guide("Casual rooftop bar & restaurant with outdoor seating, serving Indian, Chinese & Continental fare.", "Royal Sky", R.drawable.pizza));
        guided.add(new Guide("Service options: Dine-in · Takeaway · Delivery", "Falak Numa Restaurant", R.drawable.fastfood));
        guided.add(new Guide("Service options: Dine-in · Takeaway · No-contact delivery", "Royal Cafe", R.drawable.burger));
        guided.add(new Guide("Upscale restaurant at the Taj hotel offering Awadhi-style cuisine in a classy, traditional setting.", "Oudhyana", R.drawable.cheezeburger));
        guided.add(new Guide("Service options: Dine-in · Takeaway · No-contact delivery", "Rocca", R.drawable.healthyeating));
        guided.add(new Guide("Service options: Dine-in · Takeaway · No-contact delivery", "Barbeque Nation", R.drawable.masalapapad));
        guided.add(new Guide("Service options: Dine-in · Takeaway · No-contact delivery", "The Mughal's Dastarkhwan", R.drawable.salad));
        guided.add(new Guide("Service options: Dine-in · Takeaway · No-contact delivery", "Farzi Cafe", R.drawable.tray));


        GuideAdapter adapter = new GuideAdapter(this, guided, R.color.category_food);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // Guide_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.guide);

        // Make the {@link ListView} use the {@link GuideAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Guide} in the list.
        listView.setAdapter(adapter);
    }
}