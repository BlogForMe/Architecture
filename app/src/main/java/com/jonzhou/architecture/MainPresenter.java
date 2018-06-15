package com.jonzhou.architecture;

import android.util.Log;

public class MainPresenter implements IMainContract.Presenter {

    private  IMainContract.View mView;
    public MainPresenter(IMainContract.View view) {
        this.mView = view;
//        mView.setPresenter(this);
    }

    @Override
    public void goSwim() {
        Log.i("MainPresenter","去游泳吗   ");
        mView.backSwimVie();
    }

}
