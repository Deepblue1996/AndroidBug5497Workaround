package com.prohua.androidbug5497workaround;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.prohua.workaround.WorkAround;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 添加监听
        WorkAround workAround = new WorkAround(this);
        workAround.addOnGlobalLayoutListener();
        //workAround.reMoveOnGlobalLayoutListener();
    }
}
