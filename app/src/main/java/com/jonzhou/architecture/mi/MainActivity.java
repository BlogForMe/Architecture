package com.jonzhou.architecture.mi;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.jonzhou.architecture.R;

public class MainActivity extends MvpActivity implements IMainContract.View{

    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         presenter = new MainPresenter(this);
    }

    public  void  btClick(View view){
        presenter.goSwim();
    }


    @Override
    public void backSwimVie() {
        Log.i("MainActivity","回家吗   ");
    }


}
