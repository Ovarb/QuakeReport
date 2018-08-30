package com.example.android.quakereport;

public class Earthquake {

    //instance fields
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliSeconds;

    //constructor
    public Earthquake(double magnitude, String location, long timeInMilliseconds) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mTimeInMilliSeconds = timeInMilliseconds/1000;
    }

    @Override
    public String toString() {
        return "Earthquake{" +
                "mMagnitude=" + mMagnitude +
                ", mLocation='" + mLocation + '\'' +
                ", mEpochSeconds=" + mTimeInMilliSeconds +
                '}';
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliSeconds() {
        return mTimeInMilliSeconds;
    }
}
