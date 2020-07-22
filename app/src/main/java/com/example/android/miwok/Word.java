package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * sets the Miwok translation
     *
     * @param word the word that will be entered as the miwok translation
     */
    public void setMiwokWord(String word) {
        mMiwokTranslation = word;
    }

    /**
     * sets the Default translation
     *
     * @param word the word that will be entered as the default translation
     */
    public void setDefaultWord(String word) {
        mDefaultTranslation = word;
    }

    /**
     * gets the Miwok translation
     */
    public String getMiwokWord() {
        return mMiwokTranslation;
    }

    /**
     * gets the Default translation
     */
    public String getDefaultWord() {
        return mDefaultTranslation;
    }
}
