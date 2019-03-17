package com.bawei.weekones.data.utils;

import com.bawei.weekones.data.bean.InfoBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {

    @GET("api/news/news.php?page=1")
    Observable<InfoBean> getInfoData();
}
