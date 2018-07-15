package com.jonzhou.architecture.yzs.more.include;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.jonzhou.architecture.R;

/**
 * @author : John
 * @date : 2018/7/15
 */
public class IncludeModelActivity extends AppCompatActivity implements  ModelIncludeModeContract {
    private OneModelIncludeOhter oneModelIncludeOhter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
    }

    //没弄完

}
