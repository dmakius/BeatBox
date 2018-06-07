package com.bignerdranch.android.beatbox;


import android.util.Log;

public class BeatBoxActivity extends SingleFragmentActivity {

    @Override
    protected android.support.v4.app.Fragment createFragment() {
        Log.d("BeatBoxActivity", "Starting Beat Box Activity");
        return BeatBoxFragment.newInstance();
    }

}
