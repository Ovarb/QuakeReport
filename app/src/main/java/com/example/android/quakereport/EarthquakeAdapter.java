package com.example.android.quakereport;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.format.DateTimeFormatter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView==null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.eartquake_list_item, parent, false);
        }

        // Get the {@link Eartquake} object located at this position in the list
        Earthquake currentEartquake = (Earthquake) getItem(position);


        // Find the TextView in the list_item.xml layout with the ID tw_magnitude
        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude);

        // Get the magnitude value from the current Eartquake object, convert double to String and
        // set this text on the tw_magnitude TextView
        magnitudeTextView.setText(String.valueOf(currentEartquake.getmMagnitude()));

        // Find the TextView in the list_item.xml layout with the ID tw_place
        TextView placeTextView = (TextView) listItemView.findViewById(R.id.location);

        // Get the place of the eartquake from the current Eartquake object and
        // set this text on the tw_place TextView
        placeTextView.setText(currentEartquake.getmLocation());

        // Find the TextView in the list_item.xml layout with the ID tw_date
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);

        // Get the time of the eartquake from the current Earthquake object, convert it to String by specified format and
        // set this text on the tw_date TextView

        long timeInMilliSeconds = currentEartquake.getmEpochSeconds();

        Date dateObject = new Date (timeInMilliSeconds);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("MMM DD, yyyy");
        String dateToDisplay = dateFormatter.format(dateObject);

        //LocalDateTime dateTime =  LocalDateTime.ofEpochSecond(timeInMilliSeconds, 0, ZoneOffset.UTC);
        //DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMM d, yyyy");
        //String dateToDisplay = dateTime.format(dateFormatter);

        dateTextView.setText(dateToDisplay);

        // Return the whole list item layout (containing 3 TextViews) so that it can be shown in the ListView
        return listItemView;
    }
}
