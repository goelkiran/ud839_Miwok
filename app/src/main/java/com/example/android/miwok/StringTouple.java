package com.example.android.miwok;

public class StringTouple {

    private String mStringMiWok;
    private String mStringEnglish;
    private int mImageID =0;
    private boolean mImageAvailable = false;


    public StringTouple(String miwok, String eng) {
        mStringEnglish = eng;
        mStringMiWok = miwok;
        mImageAvailable = false;
    }

    public StringTouple(String miwok, String eng, int imageId) {
        mStringEnglish = eng;
        mStringMiWok = miwok;
        mImageID = imageId;
        mImageAvailable = true;
    }

    public String getMiWokTranslation() {
        return mStringMiWok;
    }

    public String getEnglishTranslation() {
        return mStringEnglish;
    }

    public String getDefaultTranslation() {
        return getEnglishTranslation();
    }

    public int getImageID() {
        return mImageID;
    }

    public boolean isImageAvailable() {return mImageAvailable; }
}



