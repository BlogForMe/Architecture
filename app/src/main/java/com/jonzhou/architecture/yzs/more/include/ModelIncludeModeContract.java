package com.jonzhou.architecture.yzs.more.include;

/**
 * @author : John
 * @date : 2018/7/15
 */
public interface ModelIncludeModeContract {
    interface View{
        void  showData(String str);
    }

    interface Presenter{
        void  getData();
    }

    interface  Model{
        String doOtherDataOne();
        String doOhterDatTwo();
    }

}
