package com.example.lucknowguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class GuideAdapter extends ArrayAdapter<Guide> {
    /** Resource ID for the background color for this list of guided */
    private int mColorResourceId;


    public GuideAdapter(Activity context, ArrayList<Guide> guided, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, guided);
        mColorResourceId = colorResourceId;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Guide currentGuide = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView spotTextView = listItemView.findViewById(R.id.spot_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        spotTextView.setText(currentGuide.getSpot());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView descriptionTextView = listItemView.findViewById(R.id.description_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        descriptionTextView.setText(currentGuide.getDescription());


        ImageView imageView = listItemView.findViewById(R.id.image);

        //Set the imageView to the image resources specified in the current Guide
        imageView.setImageResource(currentGuide.getImageResourceId());
        //make sure the view is visible
        imageView.setVisibility(View.VISIBLE);

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
