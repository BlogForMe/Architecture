package com.jonzhou.architecture;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends MvpActivity<MainPresenter> implements IMainContract.View{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected MainPresenter initPresenter() {
        return  new MainPresenter(this);
    }

    public  void  btClick(View view){
        mPresenter.goSwim();
    }


    @Override
    public void backSwimVie() {
        Log.i("MainActivity","回家吗   ");
    }


}
