package com.jonzhou.architecture;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class MvpActivity<P extends  IMainContract.Presenter> extends AppCompatActivity  {

    protected   P mPresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       mPresenter = initPresenter();
    }

    protected abstract P initPresenter();



}
