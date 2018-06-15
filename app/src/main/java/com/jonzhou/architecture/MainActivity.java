package com.jonzhou.architecture;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends MvpActivity implements  IMainContract.View{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void  btClick(View view){
        mPresenter.goSwim();
    }

    @Override
    public void setPresenter(IMainContract.Presenter presenter) {
        this.mPresenter = presenter;
    }

    @Override
    public void backSwimVie() {
        Log.i("MainActivity","回家吗   ");
    }
}
