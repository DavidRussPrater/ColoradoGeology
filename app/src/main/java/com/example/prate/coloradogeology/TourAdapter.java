package com.example.prate.coloradogeology;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link TourAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Tour} objects.
 */
public class TourAdapter extends ArrayAdapter<Tour> {


    /**
     * Create a new {@link TourAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param tours is the list of {@link Tour}s to be displayed.
     *    */
    public TourAdapter(Context context, ArrayList<Tour> tours) {
        super(context, 0, tours);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }

        // Get the {@link Tour} oject located at this position in the list
        Tour currentTour = getItem(position);

        // Find the textview in the list_item.xml layout with the ID activity_name_text_view
        TextView activityNameTextView = listItemView.findViewById(R.id.activity_name_text_view);

        // Get the activities name from the current Tour object and set this text on the activity_name_text_view.
        activityNameTextView.setText(currentTour.getActivityNameId());

        // Find the TextView in the list_item.xml layout with the activity_summary_text_view
        TextView activitySummaryTextView = (TextView) listItemView.findViewById(R.id.activity_summary_text_view);

        // Get the activities summary from the Current Tour object and set this text
        // on the activity_summary_text_view
        activitySummaryTextView.setText(currentTour.getActivitySummaryId());

        // Find the ImageView in the list_item.xml layout with the activity_image_view
        ImageView activityImageView = (ImageView) listItemView.findViewById(R.id.activity_image_view);

        // Ge tthe activity summary from the current Tour object and set the image to the activity_image_view
        activityImageView.setImageResource(currentTour.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView) so that it can be shown in
        // the ListView.
        return listItemView;

    }
}
