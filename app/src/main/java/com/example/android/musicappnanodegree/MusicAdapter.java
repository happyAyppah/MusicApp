package com.example.android.musicappnanodegree;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<Music> {

    public MusicAdapter(Activity context, ArrayList<Music> music) {
        super(context, 0, music);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the object located at this position in the list
        Music currentMusic = getItem(position);


        TextView musicSongNameTextView = listItemView.findViewById(R.id.music_song_name);
        // Get the song name
        // set this text on the name TextView
        musicSongNameTextView.setText(currentMusic.getSongName());


        TextView musicArtistNameTextView = (TextView) listItemView.findViewById(R.id.music_artist_name);
        // Get the artist name
        // set this text on the number TextView
        musicArtistNameTextView.setText(currentMusic.getArtistName());



        TextView musicTimeLengthTextView = (TextView) listItemView.findViewById(R.id.music_time_length);
        // Get the music length
        // set this text on the number TextView
        musicTimeLengthTextView.setText(currentMusic.getSongLength());


        ImageView iconView = (ImageView) listItemView.findViewById(R.id.music_song_icon);
        // set the image
        iconView.setImageResource(currentMusic.getImageResourceId());

        // Return the whole list item layout (containing 3 TextViews and an ImageView)
        return listItemView;
    }
}
