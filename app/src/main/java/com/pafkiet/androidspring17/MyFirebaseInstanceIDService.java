package com.pafkiet.androidspring17;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by khawar on 26/04/2017.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    static final String TAG = "FirebaseInstance";

    @Override
    public void onTokenRefresh() {
        String strToken = FirebaseInstanceId.getInstance().getToken();
        Log.i(TAG, strToken);
        //super.onTokenRefresh();
    }
}
