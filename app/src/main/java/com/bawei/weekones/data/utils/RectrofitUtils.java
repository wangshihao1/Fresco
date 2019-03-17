package com.bawei.weekones.data.utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RectrofitUtils {

        private static  RectrofitUtils instance;
        private Retrofit retrofit;

        private RectrofitUtils(String url){
            retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(url)
                    .build();
        }
        public static RectrofitUtils getInstance(String url) {
            if (null == instance){
                synchronized (RectrofitUtils.class){
                    if (instance == null){
                        instance = new RectrofitUtils(url);
                    }
                }
            }
            return instance;
        }
        public Retrofit getRetrofit() {
            return retrofit;
        }

}
