package com.example.mytourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.core.content.ContextCompat;

public class CityAdapter extends ArrayAdapter<City> {

    /** Resource ID for the background color for this list */
    private int mColorResourceId;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param activity A List of activity objects to display in a list
     */
    public CityAdapter(Activity context, ArrayList<City> activity, int colorResourceID) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, activity);

        mColorResourceId = colorResourceID;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     * @param position The position in the list of data that should be displayed in the list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        City currentPosition = getItem(position);

        // Find the View ID in the list_item.xml
        // Get the text/image from the current activities object and
        // set the text/image to the corresponding View
        TextView nameTextView = listItemView.findViewById(R.id.title_Text);
        nameTextView.setText(currentPosition.getmTitle());

        TextView numberTextView = listItemView.findViewById(R.id.description_Text);
        numberTextView.setText(currentPosition.getmDescription());

        ImageView iconView = listItemView.findViewById(R.id.list_item_image);
        iconView.setImageResource(currentPosition.getmImages());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.list_item_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
