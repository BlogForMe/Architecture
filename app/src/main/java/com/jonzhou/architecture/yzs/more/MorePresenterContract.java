package com.jonzhou.architecture.yzs.more;

/**
 * @author : John
 * @date : 2018/7/15
 */
public class MorePresenterContract {
    interface  View{
        void  showData1(String str);
        void  showData2(String str);
    }

    public    interface  PresenterOne{
        void  getData1();
    }

    public   interface  PresenterTwo{
        void  getData2();
    }

    public    interface  ModelOne{
        String doData1();
    }
    public    interface  ModelTwo{
        String doData2();
    }

}
