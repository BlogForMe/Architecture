package com.jonzhou.architecture;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class MvpActivity extends AppCompatActivity  implements IMainContract.View {

    protected   IMainContract.Presenter mPresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new MainPresenter(this);
    }

    @Override
    public void setPresenter(IMainContract.Presenter presenter) {
        this.mPresenter = presenter;
    }
}
