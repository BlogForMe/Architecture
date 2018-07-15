package com.jonzhou.architecture.yzs.more;

/**
 * @author : John
 * @date : 2018/7/15
 */
public class MorePresenterTwo implements  MorePresenterContract.PresenterTwo {
    private  MorePresenterContract.ModelTwo modelTwo;
    private  MorePresenterContract.View view;

    public MorePresenterTwo(MorePresenterContract.ModelTwo modelTwo, MorePresenterContract.View view) {
        this.modelTwo = modelTwo;
        this.view = view;
    }

    @Override
    public void getData2() {
        view.showData1(modelTwo.doData2());
    }
}
