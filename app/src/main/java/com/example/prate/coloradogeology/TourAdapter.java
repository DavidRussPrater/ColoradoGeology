package com.example.prate.coloradogeology;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<Tour> {


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

        Tour currentTour = getItem(position);

        TextView activityNameTextView = listItemView.findViewById(R.id.activity_name_text_view);

        activityNameTextView.setText(currentTour.getActivityNameId());

        TextView activitySummaryTextView = (TextView) listItemView.findViewById(R.id.activity_summary_text_view);

        activitySummaryTextView.setText(currentTour.getActivitySummaryId());

        ImageView activityImageView = (ImageView) listItemView.findViewById(R.id.activity_image_view);

        activityImageView.setImageResource(currentTour.getImageResourceId());

        return listItemView;

    }
}
