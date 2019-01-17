package com.fxj.orientationtest;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class GetRotationByWMActivity extends Activity {

    private TextView tvDegree;
    private Button btnGetRotation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_rotation_by_wm_activity_layout);
        tvDegree = findViewById(R.id.tv_degree);
        btnGetRotation = findViewById(R.id.btn_get_rotation);
        btnGetRotation.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                tvDegree.setText("当前旋转角度:"+getRotation(v.getContext()));
            }
        });
    }

    public int getRotation(Context mContext){
        WindowManager wm = (WindowManager) mContext.getSystemService(Context.WINDOW_SERVICE);
        return wm.getDefaultDisplay().getRotation();
    }
}
