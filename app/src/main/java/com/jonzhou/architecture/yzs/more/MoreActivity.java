package com.jonzhou.architecture.yzs.more;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.jonzhou.architecture.R;

/**
 * @author : John
 * @date : 2018/7/15
 */
public class MoreActivity extends AppCompatActivity implements MorePresenterContract.View {
    private MorePresenterOne morePresenterOne;
    private MorePresenterTwo morePresenterTwo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        morePresenterOne = new MorePresenterOne(MorePresenterModeOne.getInstance(),this);
        morePresenterTwo = new MorePresenterTwo(MorePresenterModeTwo.getInstance(),this);
        findViewById(R.id.bt_one).setOnClickListener(v -> {
            morePresenterOne.getData1();
        });
        findViewById(R.id.bt_two).setOnClickListener(v -> {
            morePresenterTwo.getData2();
        });
    }

    @Override
    public void showData1(String str) {
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showData2(String str) {
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }
}
