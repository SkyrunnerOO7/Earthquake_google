package com.example.test;

public class Earthquake {
    //declaration
    private String mMagnitude;
    private String mPlace;
    private String mDate;

    //constructor
    public Earthquake(String vMagnitude, String vPlace, String vDate)
    {
        mMagnitude = vMagnitude;
        mPlace = vPlace;
        mDate = vDate;
    }


    //=======================GET methods==========================================

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getPlace() {
        return mPlace;
    }

    public String getDate(){
        return mDate;
    }
}
