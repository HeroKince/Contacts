package com.android.contactsbind.experiments;

import java.util.HashMap;
import java.util.Map;

/**
 * Provides getters for experiment flags.
 * This stub class is designed to be overwritten by an overlay.
 */
public final class Flags {

    private static Flags sInstance;

    private Map<String, Object> mMap;

    public static Flags getInstance() {
        if (sInstance == null) {
            sInstance = new Flags();
        }
        return sInstance;
    }

    private Flags() {
        mMap = new HashMap<>();
    }

    public boolean getBoolean(String flagName) {
        return mMap.containsKey(flagName) ? (boolean) mMap.get(flagName) : false;
    }

    public int getInteger(String flagName) {
        return mMap.containsKey(flagName) ? ((Integer) mMap.get(flagName)).intValue() : 0;
    }
}