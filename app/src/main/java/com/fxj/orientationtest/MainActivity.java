package com.fxj.orientationtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button btnOnConfigChanged;
    private Button btnGetRetationByWM;
    private Button btnOrientationEventListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOnConfigChanged = findViewById(R.id.btn_on_config_change);
        btnOnConfigChanged.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,OnConfigChangeActivity.class));
            }
        });

        btnGetRetationByWM = findViewById(R.id.btn_get_rotation);
        btnGetRetationByWM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,GetRotationByWMActivity.class));
            }
        });

        btnOrientationEventListener = findViewById(R.id.btn_orientation_event_listener);
        btnOrientationEventListener.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,OrientationEventListenerActivity.class));
            }
        });
    }
}
