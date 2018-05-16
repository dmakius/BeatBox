package com.bignerdranch.android.beatbox;


public class BeatBoxActivity extends SingleFragmentActivity {

    @Override
    protected android.support.v4.app.Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }

}
