package com.fxj.orientationtest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.OrientationEventListener;

public class OrientationEventListenerActivity extends Activity {

    private String TAG=OrientationEventListenerActivity.class.getSimpleName();
    private OrientationEventListener orientationEventListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orientation_event_listener_activity_layout);
        orientationEventListener = new OrientationEventListener(this) {
            @Override
            public void onOrientationChanged(int orientation) {
                Log.d(TAG,"**onOrientationChanged**orientation="+orientation);
            }
        };

        if(orientationEventListener.canDetectOrientation()){
            orientationEventListener.enable();
        }else{
            orientationEventListener.disable();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        orientationEventListener.disable();
    }
}
