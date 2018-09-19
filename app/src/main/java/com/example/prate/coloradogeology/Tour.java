package com.example.prate.coloradogeology;

public class Tour {

    private int mActivityNameId;

    private int mActivitySummaryId;

    private int mActivityImageResourceId;

    private int mActivityUrl;

    public Tour(int activityNameId, int activitySummaryId, int imageResourceId, int activityUrl) {
        mActivityNameId = activityNameId;
        mActivitySummaryId = activitySummaryId;
        mActivityImageResourceId = imageResourceId;
        mActivityUrl = activityUrl;
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

    public int getActivityUrl() {
        return mActivityUrl;
    }
}
