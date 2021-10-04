package com.example.lucknowguide;

public class Guide {

    /**
     * Description for the guide
     */
    private String mDescription;

    /**
     * Spot for the guide
     */
    private String mSpot;

    /**
     * Image resource ID for the word
     */
    private int mImageResourceId;


    public Guide(String descriptionPlace, String spotPlace, int ImageResourceId) {
        mDescription = descriptionPlace;
        mSpot = spotPlace;
        mImageResourceId = ImageResourceId;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getSpot() {
        return mSpot;
    }

    /**
     * Get the Image Resource Id of the place.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


    @Override
    public String toString() {
        return "Word{" +
                "mDescription='" + mDescription + '\'' +
                ", mSpot='" + mSpot + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
