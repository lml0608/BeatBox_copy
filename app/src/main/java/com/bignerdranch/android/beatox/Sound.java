package com.bignerdranch.android.beatox;

import android.util.Log;

/**
 * Created by lfs-ios on 2017/4/14.
 */

public class Sound {

    private static final String TAG = "Sound";

    private String mAssetPath;

    private String mName;

    public Sound(String assetPath) {

        mAssetPath = assetPath;//sample_sounds/65_cjipie.wav ..

        String[] components = assetPath.split("/");

        Log.i(TAG, "components[0] = " + components[0]);//sample_sounds
        Log.i(TAG, "components[1] = " + components[1]);//65_cjipie.wav

        String filename =
                components[components.length - 1];//最后一个元素，65_cjipie.wav
        Log.i(TAG, "filename = " + filename);

        mName = filename.replace(".wav", ""); //.wav替换为"",mName=65_cjipie
        Log.i(TAG, "mName = " + mName);
    }



    public String getAssetPath() {
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }
}
