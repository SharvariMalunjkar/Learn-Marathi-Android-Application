package com.example.sharvari.learnmarathi;

/**
 * Created by Sharvari on 1/4/2017.
 */

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageSourceId;



    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation= miwokTranslation;
    }


    public Word(String defaultTranslation, String miwokTranslation, int imageId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation= miwokTranslation;
        mImageSourceId = imageId;

    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getimageSourceId(){
        return mImageSourceId;
    }

}
