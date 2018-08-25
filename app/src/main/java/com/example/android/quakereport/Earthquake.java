package com.example.android.quakereport;

public class Earthquake {

    //instance fields
    private double mMagnitude;
    private String mLocation;
    private long mEpochSeconds;

    //constructor
    public Earthquake(double magnitude, String location, long epochMilliSeconds) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mEpochSeconds = epochMilliSeconds/1000;
    }

    @Override
    public String toString() {
        return "Earthquake{" +
                "mMagnitude=" + mMagnitude +
                ", mLocation='" + mLocation + '\'' +
                ", mEpochSeconds=" + mEpochSeconds +
                '}';
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public long getmEpochSeconds() {
        return mEpochSeconds;
    }
}
