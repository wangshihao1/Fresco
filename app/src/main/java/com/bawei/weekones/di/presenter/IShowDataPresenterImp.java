package com.bawei.weekones.di.presenter;

import com.bawei.weekones.data.bean.InfoBean;
import com.bawei.weekones.di.contract.IShowDataContract;
import com.bawei.weekones.di.model.IShowModelmp;

import java.lang.ref.SoftReference;

public class IShowDataPresenterImp implements IShowDataContract.IShowDataContractPresenter<IShowDataContract.IShowDataContractView> {

    private IShowDataContract.IShowDataContractModel contractModel;
    private IShowDataContract.IShowDataContractView contractView;
    private SoftReference<IShowDataContract.IShowDataContractView> reference;

    @Override
    public void atteachView(IShowDataContract.IShowDataContractView iShowDataContractView) {
        this.contractView = iShowDataContractView;
        contractModel = new IShowModelmp();
        reference = new SoftReference<>(contractView);
    }

    @Override
    public void deatachView(IShowDataContract.IShowDataContractView iShowDataContractView) {
         reference.clear();
    }

    @Override
    public void responseData() {
         contractModel.requestData(new IShowDataContract.IShowDataContractModel.CallBack() {
             @Override
             public void onCallBack(InfoBean infoBean) {
                 contractView.showData(infoBean);
             }
         });
    }
}
