package com.bignerdranch.android.beatbox;

public class SoundViewModel {
    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox beatbox){
        mBeatBox = beatbox;
    }

    public Sound getSound(){
        return mSound;
    }

    public String getTitle(){
        return mSound.getName();
    }
    public void setSound(Sound sound){
        mSound = sound;
    }
}
