package com.jonzhou.architecture.mi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class MvpActivity extends AppCompatActivity implements  IBaseView {

//    protected   P mPresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        new MainPresenter(this);
    }




}
