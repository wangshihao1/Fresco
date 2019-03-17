package com.bawei.weekones.di.contract;

import com.bawei.weekones.data.bean.InfoBean;

public interface IShowDataContract {

    public interface IShowDataContractView{

        void showData(InfoBean infoBean);
    }

    public interface IShowDataContractPresenter<IShowDataContractView>{

        void atteachView(IShowDataContractView dataContractView);

        void deatachView(IShowDataContractView dataContractView);

        void responseData();
    }

    public interface IShowDataContractModel{

        public interface CallBack{

            void onCallBack(InfoBean infoBean);
        }

        void requestData(CallBack callBack);
    }
}
