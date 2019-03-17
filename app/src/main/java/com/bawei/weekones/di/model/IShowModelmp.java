package com.bawei.weekones.di.model;

import android.util.Log;

import com.bawei.weekones.data.bean.InfoBean;
import com.bawei.weekones.data.utils.ApiService;
import com.bawei.weekones.data.utils.Apis;
import com.bawei.weekones.di.contract.IShowDataContract;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class IShowModelmp implements IShowDataContract.IShowDataContractModel {
    @Override
    public void requestData(final CallBack callBack) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Apis.SHOW_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiService apiService = retrofit.create(ApiService.class);
        Observable<InfoBean> observable = apiService.getInfoData();
        observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<InfoBean>() {
                    @Override
                    public void accept(InfoBean infoBean) throws Exception {
                        callBack.onCallBack(infoBean);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        Log.e("WSH","失败"+throwable.getMessage());
                    }
                });
    }
}
