package com.bignerdranch.android.beatox;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by lfs-ios on 2017/4/14.
 */

public class SoundViewModel extends BaseObservable {



    private Sound mSound;
    private BeatBox mBeatBox;


    public SoundViewModel(BeatBox beatBox) {
        mBeatBox = beatBox;
    }

    @Bindable
    public String getTitle() {

        return mSound.getName();
    }

    public Sound getSound() {

        return mSound;
    }

    public void setSound(Sound sound) {

        mSound = sound;
        notifyChange();
    }


}
