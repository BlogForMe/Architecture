package com.jonzhou.architecture.yzs.more;

/**
 * @author : John
 * @date : 2018/7/15
 */
public class MorePresenterModeOne implements  MorePresenterContract.ModelOne{
    private  static MorePresenterModeOne model;
    public  static MorePresenterModeOne getInstance(){
        if (model==null){
            model = new MorePresenterModeOne();
        }
        return  model;
    }

    @Override
    public String doData1() {
        return "doData1";
    }
}
