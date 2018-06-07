package com.bignerdranch.android.beatbox;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;

public class SoundViewModel extends BaseObservable {
    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox beatbox){
        Log.d("SoundViewModel", "Starting Sound View Model");
        mBeatBox = beatbox;
    }

    public Sound getSound(){
        return mSound;
    }

    @Bindable
    public String getTitle(){
        Log.d("SoundViewModel", "Getting title");
        return mSound.getName();
    }
    public void setSound(Sound sound){
        Log.d("SoundViewModel", "Setting Sound");
        mSound = sound;
        notifyChange();
    }

    public void onButtonClicked() {
        Log.d("SoundViewModel", "Clicking Button");
        mBeatBox.play(mSound);
    }
}
