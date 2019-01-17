package com.fxj.orientationtest;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public final class OnConfigChangeActivity extends Activity {

    private static final String TAG = OnConfigChangeActivity.class.getSimpleName();
    private TextView tvDegree;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.on_config_change_activity_layout);
        tvDegree = findViewById(R.id.tv_degree);
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d(TAG, "**onConfigurationChanged**orientation(1:竖屏,2:横屏)=" + (newConfig != null ? newConfig.orientation : null));
        if(newConfig.orientation==Configuration.ORIENTATION_PORTRAIT){
            tvDegree.setText("当前是竖屏");
        }else if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE){
            tvDegree.setText("当前是横屏");
        }
    }

}

