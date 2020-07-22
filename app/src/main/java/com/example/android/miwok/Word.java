package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public void setMiwokWord(String word) {
        mMiwokTranslation = word;
    }

    public void setDefaultWord(String word) {
        mDefaultTranslation = word;
    }

    public String getMiwokWord() {
        return mMiwokTranslation;
    }

    public String getDefaultWord() {
        return mDefaultTranslation;
    }
}
