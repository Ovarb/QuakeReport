package com.example.android.quakereport;

public class Earthquake {

    //instance fields
    private double mMagnitude;
    private String mPlace;
    private int mEpoch;

    //constructor
    public Earthquake(double mMagnitude, String mPlace, int mEpoch) {
        this.mMagnitude = mMagnitude;
        this.mPlace = mPlace;
        this.mEpoch = mEpoch;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmPlace() {
        return mPlace;
    }

    public int getmEpoch() {
        return mEpoch;
    }
}
