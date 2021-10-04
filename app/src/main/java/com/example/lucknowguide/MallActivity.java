package com.example.lucknowguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_list);

        // Create a list of guided
        final ArrayList<Guide> guided = new ArrayList<Guide>();
        guided.add(new Guide("Amar Shaheed Path, Sector-7, Gomti Nagar, Lucknow, Uttar Pradesh 226010", "Phoenix Palassio", R.drawable.mall));
        guided.add(new Guide("ocated at Vipin Khand in GomtiNagar. The mall has a Built-up area of more than 970,000 sq ft.", "Fun Republic Mall", R.drawable.shopingmall));
        guided.add(new Guide("Shahnajaf Rd, Prem Nagar, Hazratganj, Lucknow, Uttar Pradesh 226001", "Sahara Ganj Mall", R.drawable.mall));
        guided.add(new Guide("TC 54 Vibhuti Khand Road, Gomti Nagar Rd, Vibhuti Khand, Lucknow, Uttar Pradesh 226001", "Wave Mall", R.drawable.shopingmall));
        guided.add(new Guide("CP 192, Viraj Khand Rd, Viraj Khand-4, Viraj Khand, Gomti Nagar, Lucknow, Uttar Pradesh 226010", "Singapore Mall", R.drawable.mall));
        guided.add(new Guide("Prem Nagar, Hazratganj, Lucknow, Uttar Pradesh 226001", "Central", R.drawable.shopingmall));
        guided.add(new Guide(" Plot No, 111, Faizabad Rd, opposite BBD COLLEGE, Atif Vihar, Lucknow, Uttar Pradesh 226028", "Crown Mall", R.drawable.mall));
        guided.add(new Guide(" A-3/300, Dr Akhilesh Das Gupta Marg, Vipul Khand 4, Vipul Khand, Gomti Nagar, Lucknow", "City Mall", R.drawable.shopingmall));
        guided.add(new Guide("Shopping mall in Hariharpur, Uttar Pradesh", "Lulu Mall", R.drawable.mall));
        guided.add(new Guide("Upbeat retail center with seasonal decor offering 90+ stores, a food court & multiplex cinema.", "Phoenix United", R.drawable.shopingmall));


        GuideAdapter adapter = new GuideAdapter(this, guided, R.color.category_mall);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // Guide_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.guide);

        // Make the {@link ListView} use the {@link GuideAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Guide} in the list.
        listView.setAdapter(adapter);
    }
}