package com.example.android.musicappnanodegree;

public class Music {


    // Name of the Android version (e.g. Gingerbread, Honeycomb, Ice Cream Sandwich)
    private String mSongName;

    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    private String mArtistName;

    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    private String mSongLength;

    // Drawable resource ID
    private int mImageResourceId;

    /*
     * Create a new AndroidFlavor object.
     *
     * @param vName is the name of the Android version (e.g. Gingerbread)
     * @param vNumber is the corresponding Android version number (e.g. 2.3-2.7)
     * @param image is drawable reference ID that corresponds to the Android version
     * */
    public Music(String vName, String vArtist,  String vLength, int imageResourceId)
    {
        mSongName = vName;
        mArtistName = vArtist;
        mSongLength = vLength;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the Android version
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the Android version number
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get the Android version number
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
