package com.example.mytourguideapp;

public class City {

    // Declare the VARIABLES to store the properties of the 'City' OBJECT
    private int mTitle;
    private int mDescription;
    private int mImages;

    /**
     * **** STATE of the class*****
     * ...contains the PROPERTIES of the 'City' OBJECT
     * Create the properties in a CONSTRUCTOR with name that matches the CLASS name ...
     * @param titleText for city activities
     * @param descriptionText for city activities
     **/
    public City( int titleText, int descriptionText,int images) {
        // 3 properties of the object
        mTitle = titleText;
        mDescription = descriptionText;
        mImages = images;
    }

    /**
     * **** METHODS *****
     * Create METHODS to get each of the properties from the 'City' Object
     **/
    public int getmTitle() { return mTitle; }

    public int getmDescription() { return mDescription; }

    public int getmImages() { return mImages; }

}



