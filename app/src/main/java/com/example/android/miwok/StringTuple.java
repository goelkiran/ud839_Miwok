package com.example.android.miwok;

public class StringTuple {

    private String mStringMiWok;
    private String mStringEnglish;
    private int mImageID = 0;
    private boolean mImageAvailable = false;
    private int mAudioClipId;


    public StringTuple(String miwok, String eng) {
        mStringEnglish = eng;
        mStringMiWok = miwok;
        mImageAvailable = false;
    }

    public StringTuple(String miwok, String eng, int imageId) {
        mStringEnglish = eng;
        mStringMiWok = miwok;
        mImageID = imageId;
        mImageAvailable = true;
    }

    public StringTuple(int clipId, String miwok, String eng) {
        mStringEnglish = eng;
        mStringMiWok = miwok;
        mAudioClipId = clipId;
        mImageAvailable = false;
    }

    public StringTuple(int clipId, String miwok, String eng, int imageId) {
        mStringEnglish = eng;
        mStringMiWok = miwok;
        mImageID = imageId;
        mAudioClipId = clipId;
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

    public int getAudioClipId() {
        return mAudioClipId;
    }

    public boolean isImageAvailable() {
        return mImageAvailable;
    }
}



