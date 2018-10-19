package com.example.prate.coloradogeology;


/**
 * {@link Tour} represents an attraction that the user can visit in olorado.
 * It contains resource IDs for the attractions names, description and image
 */
public class Tour {

    // String resource ID for the activities name
    private int mActivityNameId;
    // String resource ID for the activities summary
    private int mActivitySummaryId;
    // Image resource ID for the activities picture
    private int mActivityImageResourceId;

    /**
     * Create a new Tour object
     *
     * @param activityNameId is the string resource ID activites name
     * @param activitySummaryId is the string resource ID for the activities summary
     * @param imageResourceId is the image resource ID for an image of the activity
     */
    public Tour(int activityNameId, int activitySummaryId, int imageResourceId) {
        mActivityNameId = activityNameId;
        mActivitySummaryId = activitySummaryId;
        mActivityImageResourceId = imageResourceId;
    }

    // Get the string resource ID for the activities name
    public int getActivityNameId(){
        return mActivityNameId;
    }

    // Get the string resource ID for the activities summary
    public int getActivitySummaryId(){
        return mActivitySummaryId;
    }

    // Get the image resource ID for the activities picture
    public int getImageResourceId(){
        return mActivityImageResourceId;
    }

}
