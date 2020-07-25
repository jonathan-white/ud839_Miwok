package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

public class WordAdapter extends ArrayAdapter {

    /**Resource ID for the background color (API 15) for this list of words*/
    private final int mColorResourceId;

    public WordAdapter(@NonNull Activity context, @NonNull ArrayList<Word> words, int backgroundColor) {
        super(context, 0, words);
        mColorResourceId = backgroundColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false
            );
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = (Word) getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView iconImageView = listItemView.findViewById(R.id.image);
        // Get the image resource ID from the current Word object and set the image to iconImageView
        if(currentWord.hasImage()) {
            // Set the ImageView to the image resource specified in the current Word
            iconImageView.setImageResource(currentWord.getImageResourceId());
            // Make sure the view is visible
            iconImageView.setVisibility(View.VISIBLE);
        } else {
            // Make sure the view is not visible
            iconImageView.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID default_text_view
        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
        // Get the default word from the current Word object and
        // set this text on the default TextView
        defaultTextView.setText(currentWord.getDefaultWord());

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view
        TextView miwokTextView = listItemView.findViewById(R.id.miwok_text_view);
        // Get the Miwok word from the current Word object and
        // set this text on the Miwok TextView
        miwokTextView.setText(currentWord.getMiwokWord());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);

        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //Set the background color of the text container view
        textContainer.setBackgroundColor(color);

        return listItemView;
    }

}
