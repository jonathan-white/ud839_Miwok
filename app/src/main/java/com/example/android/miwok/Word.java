package com.example.android.miwok;

public class Word {
    private final String mDefaultTranslation;
    private final String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Audio resource ID for the word */
    private final int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Creates a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     *
     * @param miwokTranslation is the word in the Miwok language
     *
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Creates a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is fluent in
     *                           
     * @param miwokTranslation is the word in the Miwok language
     *
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     *
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */  
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
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

    /**
     * gets the word's image
     */
    public int getImageResourceId() { return mImageResourceId; }

    /**
     *
     * @return true if the Word has an image
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * gets the word's audio file
     */
    public int getAudioResourceId() { return mAudioResourceId; }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
