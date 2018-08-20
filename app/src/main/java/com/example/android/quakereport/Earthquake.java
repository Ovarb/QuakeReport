package com.example.android.quakereport;

public class Earthquake {

    //instance fields
    private double mMagnitude;
    private String mPlace;
    private long mEpochSeconds;

    //constructor
    public Earthquake(double mMagnitude, String mPlace, long mEpochMilliSeconds) {
        this.mMagnitude = mMagnitude;
        this.mPlace = mPlace;
        this.mEpochSeconds = mEpochMilliSeconds/1000;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmPlace() {
        return mPlace;
    }

    public long getmEpochSeconds() {
        return mEpochSeconds;
    }
}
