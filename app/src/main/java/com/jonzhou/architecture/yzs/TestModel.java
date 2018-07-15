package com.jonzhou.architecture.yzs;

/**
 * @author : John
 * @date : 2018/7/15
 */
public class TestModel implements  TestContract.Model {
    private  static TestModel model;
    public  static TestModel getInstance(){
        if (model==null){
            model = new TestModel();
        }
        return  model;
    }

    @Override
    public String doData() {
        return "mvp架构";
    }
}
