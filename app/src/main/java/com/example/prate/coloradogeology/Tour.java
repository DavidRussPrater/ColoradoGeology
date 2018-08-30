package com.example.prate.coloradogeology;

public class Tour {

    private int mActivityNameId;

    private int mActivitySummaryId;

    private int mActivityImageResourceId;

    public Tour(int activityNameId, int activitySummaryId, int imageResourceId) {
        mActivityNameId = activityNameId;
        mActivitySummaryId = activitySummaryId;
        mActivityImageResourceId = imageResourceId;
    }

    public int getActivityNameId(){
        return mActivityNameId;
    }

    public int getActivitySummaryId(){
        return mActivitySummaryId;
    }

    public int getImageResourceId(){
        return mActivityImageResourceId;
    }
}
