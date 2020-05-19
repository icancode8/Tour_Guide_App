package com.example.mytourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;

public class CityHotels_Fragment extends Fragment {

    public CityHotels_Fragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        // Create a list_layout of activities
        final ArrayList<City> activities = new ArrayList<>();
        activities.add(new City(R.string.hotel_1_name, R.string.hotel_1_description, R.drawable.hotel_x));
        activities.add(new City(R.string.hotel_2_name, R.string.hotel_2_description, R.drawable.hotel_bisha));
        activities.add(new City(R.string.hotel_3_name, R.string.hotel_3_description, R.drawable.hotel_four_seasons));
        activities.add(new City(R.string.hotel_4_name, R.string.hotel_4_description, R.drawable.hotel_shangri_la));
        activities.add(new City(R.string.hotel_5_name, R.string.hotel_5_description, R.drawable.hotel_st_regis));
        activities.add(new City(R.string.hotel_6_name, R.string.hotel_6_description, R.drawable.hotel_ritz_carlton));

        // Create a {@link CityAdapter}, whose data source is a list_layout of {@link activities}.
        CityAdapter adapter = new CityAdapter(getActivity(), activities, R.color.category_cityHotels);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list_layout, which is declared in the
        // list_layout.xml file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link CityAdapter} created above, so that the
        // {@link ListView} will display list_layout items for each of the City objects in the list_layout.
        listView.setAdapter(adapter);

        return rootView;
    }
}
