package com.jonzhou.architecture.yzs;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.jonzhou.architecture.R;

public class TestActivity extends AppCompatActivity implements  TestContract.View {
    private TestContract.Presenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        presenter= new TestPresenter(TestModel.getInstance(),this);
        findViewById(R.id.bt_click).setOnClickListener(v->{
            presenter.getData();
        });
    }

    @Override
    public void showData(String str) {
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }
}
