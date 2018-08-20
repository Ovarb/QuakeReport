package com.example.android.quakereport;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter {

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> list) {
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView==null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Eartquake} object located at this position in the list
        Earthquake currentEartquake = (Earthquake) getItem(position);


        // Find the TextView in the list_item.xml layout with the ID tw_magnitude
        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.tw_magnitude);

        // Get the magnitude value from the current Eartquake object, convert double to String and
        // set this text on the tw_magnitude TextView
        magnitudeTextView.setText(String.valueOf(currentEartquake.getmMagnitude()));

        // Find the TextView in the list_item.xml layout with the ID tw_place
        TextView placeTextView = (TextView) listItemView.findViewById(R.id.tw_place);

        // Get the place of the eartquake from the current Eartquake object and
        // set this text on the tw_place TextView
        placeTextView.setText(currentEartquake.getmPlace());

        // Find the TextView in the list_item.xml layout with the ID tw_date
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.tw_date);

        // Get the time of the eartquake from the current Eartquake object, convert it to String and
        // set this text on the tw_date TextView
        int time = currentEartquake.getmEpoch();
        DateTime dateTime = new DateTime(time*1000L);
        String ddd = dateTime.toString();
        dateTextView.setText(ddd);






        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
