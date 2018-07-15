package com.jonzhou.architecture.mi;

public interface IMainContract {

    interface  View  /* extends  IBaseView<Presenter>*/{

        void backSwimVie();
    }


    interface Presenter {

      void goSwim();
   }
}
