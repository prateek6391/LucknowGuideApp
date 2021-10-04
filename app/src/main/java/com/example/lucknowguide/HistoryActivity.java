package com.example.lucknowguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_list);
        // Create a list of guided
        final ArrayList<Guide> guided = new ArrayList<Guide>();
        guided.add(new Guide("It also known as Asfi Imambara is an imambara complex in Lucknow, India built by Asaf-ud-Daula, Nawab of Awadh in 1784", "Bara Imambara", R.drawable.bara_imam));
        guided.add(new Guide("It is the remains of an eighteenth-century house built in the English baroque style in the quiet Dilkusha area of Lucknow", "Dilkusha Kothi", R.drawable.dilkushakothi));
        guided.add(new Guide("The Rumi Darwaza, in Lucknow, Uttar Pradesh, India, is an imposing gateway which was built by Nawab Asaf-Ud-Daula in 1784.", "Rumi Darwaza", R.drawable.rumidarwaza));
        guided.add(new Guide("also known as Imambara Hussainabad Mubarak is an imposing monument located in the city of Lucknow", "Chota Imambara", R.drawable.chota));
        guided.add(new Guide("Iconic 1800s watchtower with a stout octagonal base, arched windows & Islamic design details.", "Satkhanda", R.drawable.satkhanda));
        guided.add(new Guide("The Safed Baradari, is a white marbled building in Lucknow Uttar Pradesh", "Safed Baradari", R.drawable.safed));
        guided.add(new Guide("1, Rana Pratap Marg, Hazratganj, Lucknow, Uttar Pradesh 226001", "Historical Turret of Motimahal", R.drawable.tunnel));
        guided.add(new Guide("Husainabad Trust Rd, Lajpat Nagar, Husainabad, Lucknow, Uttar Pradesh 226003", "Androon", R.drawable.androon));
        guided.add(new Guide("Bijnor Rd, Lucknow, Uttar Pradesh 226002", "Natwa Deeh Teela", R.drawable.natwadeeh));
        guided.add(new Guide("It served as a palace for the rulers of Awadh and their wives.", "Chhatar Manzil", R.drawable.chhatarmanzil));
        guided.add(new Guide("Mahatma Gandhi Marg, Mukarimnagar, Qaisar Bagh, Lucknow, Uttar Pradesh 226001", "Shaheed Smarak", R.drawable.shaheedsmarak));
        guided.add(new Guide("It's a villa and garden enclosed by a fortified wall, with loopholes, gateway and corner bastions, approx.", "Sikandar Bagh", R.drawable.sikandarbagh));


        GuideAdapter adapter = new GuideAdapter(this, guided, R.color.category_history);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // Guide_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.guide);

        // Make the {@link ListView} use the {@link GuideAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Guide} in the list.
        listView.setAdapter(adapter);

    }
}