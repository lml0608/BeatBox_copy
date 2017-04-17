package com.bignerdranch.android.beatox;


import android.content.Context;
import android.content.res.AssetManager;
import android.os.ParcelUuid;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lfs-ios on 2017/4/14.
 */

public class BeatBox {


    private static final String TAG = "BeatBox";

    private static final String SOUNDS_FOLDER = "sample_sounds";

    private AssetManager mAssets;

    private List<Sound> mSounds = new ArrayList<>();


    public BeatBox(Context context) {

        mAssets = context.getAssets();
        loadSounds();
    }

    private void loadSounds() {
        String[] soundNames;

        try {

            soundNames = mAssets.list(SOUNDS_FOLDER);
            Log.i(TAG, "Found " + soundNames.length + "sounds");//22
        } catch (IOException e) {
            Log.e(TAG, "Could not list assets", e);
            return;
        }
        Log.i(TAG, "soundName[1]" + soundNames[1]); //66_indios.wav

        for (String filename : soundNames) {
            String assetPath = SOUNDS_FOLDER + "/" + filename;

            Log.i(TAG, "assetPath = " + assetPath); // sample_sounds/65_cjipie.wav ...
            Sound sound = new Sound(assetPath);
            mSounds.add(sound);
        }
    }

    //返回sound列表
    public List<Sound> getSounds() {
        return mSounds;
    }
}
