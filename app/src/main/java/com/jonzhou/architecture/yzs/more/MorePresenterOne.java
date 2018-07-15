package com.jonzhou.architecture.yzs.more;

/**
 * @author : John
 * @date : 2018/7/15
 */
public class MorePresenterOne implements  MorePresenterContract.PresenterOne {

    private MorePresenterContract.ModelOne modelOne;
    private MorePresenterContract.View view;

    public MorePresenterOne(MorePresenterContract.ModelOne modelOne, MorePresenterContract.View view) {
        this.modelOne = modelOne;
        this.view = view;
    }

    @Override
    public void getData1() {
        view.showData1(modelOne.doData1());
    }
}
