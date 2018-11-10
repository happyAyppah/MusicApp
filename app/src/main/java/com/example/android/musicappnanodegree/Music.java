package com.example.android.musicappnanodegree;

public class Music {


    // Name of the Song
    private String mSongName;

    // Name of the Artist
    private String mArtistName;

    // Length of the Song
    private String mSongLength;

    // Drawable resource ID
    private int mImageResourceId;

    /*
     * Create a new Music object.
     *
     * @param vName is the name of the Song Name
     * @param mArtistName is the corresponding Artist Name
     * @param mSongLength is the corresponding Song Length
     * */
    public Music(String vName, String vArtist,  String vLength, int imageResourceId)
    {
        mSongName = vName;
        mArtistName = vArtist;
        mSongLength = vLength;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the Song
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the Artist Name
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get the Song Length
     */
    public String getSongLength() {
        return mSongLength;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

}
