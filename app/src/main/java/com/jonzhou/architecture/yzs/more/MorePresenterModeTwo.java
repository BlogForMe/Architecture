package com.jonzhou.architecture.yzs.more;

/**
 * @author : John
 * @date : 2018/7/15
 */
public class MorePresenterModeTwo implements  MorePresenterContract.ModelTwo{
    private  static MorePresenterModeTwo model;
    public  static MorePresenterModeTwo getInstance(){
        if (model==null){
            model = new MorePresenterModeTwo();
        }
        return  model;
    }

    @Override
    public String doData2() {
        return "doData2";
    }
}
