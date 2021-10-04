package com.example.lucknowguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ParkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_list);

        // Create a list of guided
        final ArrayList<Guide> guided = new ArrayList<Guide>();
        guided.add(new Guide("Urban park operating in Gomti Nagar in Lucknow, India.", "Janeshwar Mishra Park", R.drawable.parkone));
        guided.add(new Guide(" Developed by the Lucknow Development Authority in the Vipin Khand area of Gomti Nagar", "Dr Ram Manohar Lohia Park", R.drawable.park));
        guided.add(new Guide("Landscaped waterside promenade with lawns, sculptures & a musical fountain, illuminated at night.", "Gomti Riverfornt Park", R.drawable.parkone));
        guided.add(new Guide("Memorial park in Lucknow, Uttar Pradesh", "Ambedkar Memorial Parkt", R.drawable.park));
        guided.add(new Guide("Urban green space with manicured lawns, paddle boats on narrow waterways & children's play areas.", "Gautam Buddha Park", R.drawable.parkone));
        guided.add(new Guide("Space is there for kids to play and enjoy their free time. Very few schools are having such ground.", "Jai Jagat Park", R.drawable.park));
        guided.add(new Guide("Park was good nice and clean a big globe is placed in centre there is one more park attached which cost you 10rs per person", "Globe Park", R.drawable.parkone));
        guided.add(new Guide("Rani Laxmi Bai Rd, Hazratganj, Lucknow, Uttar Pradesh 226001", "Begum Hazrat Mahal Park", R.drawable.park));
        guided.add(new Guide("Exercise classes, a running track & play structures in an urban space with seasonal flowerbeds.", "Swarna Jayanti Smriti Vihar Park", R.drawable.parkone));
        guided.add(new Guide("Large public park with 2 rows of giant elephant statues leading to its main memorial.", "Haathi Park", R.drawable.park));


        GuideAdapter adapter = new GuideAdapter(this, guided, R.color.category_park);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // Guide_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.guide);

        // Make the {@link ListView} use the {@link GuideAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Guide} in the list.
        listView.setAdapter(adapter);
    }
}