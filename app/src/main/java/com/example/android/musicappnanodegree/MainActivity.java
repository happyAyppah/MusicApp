package com.example.android.musicappnanodegree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button playlist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find Button id
        playlist = findViewById(R.id.playlist_button);
        // Set a click listener on that View
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, Playlist.class);
                startActivity(numbersIntent);
            }
        });



        // Create an ArrayList of Music objects
        ArrayList<Music> musics = new ArrayList<Music>();
        musics.add(new Music("El_bano", "Enrique", "3:00", R.drawable.song1));
        musics.add(new Music("Know it all", "Alessia Cara", "3:00", R.drawable.song2));
        musics.add(new Music("Chillin' Road", "Jonny", "3:00", R.drawable.song3));
        musics.add(new Music("Viva Latino", "Kydo", "3:00", R.drawable.song4));
        musics.add(new Music("Blessings", "Mashmallow", "3:00", R.drawable.song5));
        musics.add(new Music("Zombie", "Bad wolves", "3:00", R.drawable.song6));
        musics.add(new Music("1950", "King Princess", "3:00", R.drawable.song7));
        musics.add(new Music("Mine", "Bazzi", "3:00", R.drawable.song8));
        musics.add(new Music("Friends", "Anni-marie", "3:00", R.drawable.song9));
        musics.add(new Music("I Believe you", "OneDirection", "3:00", R.drawable.song10));


        MusicAdapter adapter = new MusicAdapter(this, musics);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

}
