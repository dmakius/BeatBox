package com.bignerdranch.android.beatbox;

import android.util.Log;

public class Sound {
    private String mAssetPath;
    private String mName;
    private Integer mSoundId;

    public Sound(String assetPath){
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String fileName = components[components.length - 1];
        mName = fileName.replace(".wave", "");
        Log.d("Sound", "Creating Sound");
    }
    public String getAssetPath(){
        return mAssetPath;
    }

    public String getName(){
        return mName;
    }

    public Integer getSoundId(){
        return mSoundId;
    }

    public void setSoundId(Integer soundId){
        mSoundId = soundId;
    }
}
