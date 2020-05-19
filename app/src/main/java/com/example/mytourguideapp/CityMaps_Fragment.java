package com.example.mytourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;

public class CityMaps_Fragment extends Fragment {

    public CityMaps_Fragment(){
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        // Create a list_layout of activities
        final ArrayList<City> activities = new ArrayList<>();
        activities.add(new City(R.string.map_1_name, R.string.map_1_description, R.drawable.map_toronto_metro));
        activities.add(new City(R.string.map_2_name, R.string.map_2_description, R.drawable.map_toronto_street_car));
        activities.add(new City(R.string.map_3_name, R.string.map_3_description, R.drawable.map_go_transit));
        activities.add(new City(R.string.map_4_name, R.string.map_4_description, R.drawable.map_up_express));

        // Create an {@link WordAdapter}, whose data source is a list_layout of {@link Word}s. The
        // adapter knows how to create list_layout items for each item in the list_layout.
        final CityAdapter adapter = new CityAdapter(getActivity(), activities, R.color.category_cityMaps);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list_layout, which is declared in the
        // word_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list_layout items for each {@link Word} in the list_layout.
        listView.setAdapter(adapter);

        return rootView;
    }

}
