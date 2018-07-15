package com.jonzhou.architecture.yzs;

/**
 * @author : John
 * @date : 2018/7/15
 */
public class TestContract {
    interface  View{
        void  showData(String str);
    }

    interface  Presenter{
        void  getData();
    }
    interface  Model{
        String doData();
    }

}
