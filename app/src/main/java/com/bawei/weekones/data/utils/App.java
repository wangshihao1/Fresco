package com.bawei.weekones.data.utils;

import android.app.Application;

import com.bawei.weekones.data.bean.InfoBean;
import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.core.ImagePipelineConfig;

import java.util.ArrayList;
import java.util.List;

public class App extends Application {
    private static App instance;
    private List<InfoBean> list;

    @Override
    public void onCreate() {
        super.onCreate();
        //磁盘缓存的配置
        DiskCacheConfig diskCacheConfig = DiskCacheConfig.newBuilder(this)
                .setBaseDirectoryPath(getCacheDir())
                .setMaxCacheSize(8*1024*1024)
                .build();
        //把磁盘缓存的设置，设置到三级缓存中
        ImagePipelineConfig pipelineConfig = ImagePipelineConfig.newBuilder(this)
                .setMainDiskCacheConfig(diskCacheConfig)
                .build();
        Fresco.initialize(this,pipelineConfig);
         instance = this;
    }

    public static App getInstance() {
        return instance;
    }

    public List<InfoBean> getList() {
        if (list == null){
            list = new ArrayList<>();
        }
        return list;
    }

    public void setList(List<InfoBean> list) {
        this.list = list;
    }


}
