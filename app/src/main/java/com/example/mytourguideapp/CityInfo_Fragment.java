package com.example.mytourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class CityInfo_Fragment extends Fragment {

    public CityInfo_Fragment() {
        // Required empty public constructor
    }

    /**
     * Create an onCreateView method to return the objects to the root view
     * @param inflater layout inflater
     * @param container view group
     * @param savedInstanceState bundle
     * @return rootView
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.city_info, container, false);

        // Find the ImageView id and assign to a variable to display from resource Image file
        ImageView imageView = rootView.findViewById(R.id.imageView_cityInfo);
        imageView.setImageResource(R.drawable.cn_tower);

        // Create a String to display the info text
        String info = " The provincial capital of Ontario and the most populous city in Canada" +
                ", with a population of more than 3 million people" +
                "\n\n The diverse population of Toronto reflects its current and historical role " +
                "as an important destination for immigrants to Canada" +
                "More than 50 percent of residents belong to a visible minority population group," +
                " and over 200 distinct ethnic origins are represented among its inhabitants." +
                "\n\n While the majority of Torontonians speak English as their primary language, " +
                "over 160 languages are spoken in the city.";
        // Find the TextView resource id, assign it to the string variable
        TextView textView = rootView.findViewById(R.id.cityInfo);
        textView.setText(info);

        return rootView;
    }
}
