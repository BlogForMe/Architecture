package com.jonzhou.architecture.yzs;

/**
 * @author : John
 * @date : 2018/7/15
 */
public class TestPresenter implements TestContract.Presenter{
    private TestContract.Model model;
    private TestContract.View view;

    public TestPresenter(TestContract.Model model, TestContract.View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void getData() {
        view.showData(model.doData());
    }
}
