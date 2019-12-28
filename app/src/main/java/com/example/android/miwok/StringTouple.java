package com.example.android.miwok;

public class StringTouple {

    private String stringMiWok;
    private String stringEnglish;

    public StringTouple(String miwok, String eng) {
        stringEnglish = eng;
        stringMiWok = miwok;
    }

    public String getMiWokTranslation() {
        return stringMiWok;

    }

    public String getEnglishTranslation() {
        return stringEnglish;
    }

    public String getDefaultTranslation() {
        return getEnglishTranslation();
    }
}



