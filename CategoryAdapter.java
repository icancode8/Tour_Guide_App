package com.example.mytourguideapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        // deprecated super method
        super(fm);
        mContext = context;
    }

    /**
     * This method is used to match up the tabs with the fragments
     * @param position of the tabs and fragments
     * @return fragment
     */
    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CityInfo_Fragment();         //City info Fragment
        } else if (position == 1) {
            return new CityActivities_Fragment();   //City activities Fragment
        } else if (position == 2) {
            return new CityMaps_Fragment();         //City maps Fragment
        } else {
            return new CityHotels_Fragment();        //City hotels Fragment
        }
    }

    /**
     * This method is created to return the number of fragments that will be used
     * @return number of fragments
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_cityInfo);
        } else if (position == 1) {
            return mContext.getString(R.string.category_cityActivities);
        } else if (position == 2) {
            return mContext.getString(R.string.category_cityMaps);
        } else {
            return mContext.getString(R.string.category_cityHotels);
        }
    }
}
