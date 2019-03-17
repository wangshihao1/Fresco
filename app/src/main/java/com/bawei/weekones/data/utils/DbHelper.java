package com.bawei.weekones.data.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.bawei.weekones.gen.DaoMaster;
import com.bawei.weekones.gen.DaoSession;
import com.bawei.weekones.gen.userDao;

public class DbHelper {


        private static volatile DbHelper instance;
        private final userDao dao;

        private DbHelper(Context context){
            DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, "userName", null);
            SQLiteDatabase db = helper.getWritableDatabase();
            DaoMaster daoMaster = new DaoMaster(db);
            DaoSession daoSession = daoMaster.newSession();
            dao = daoSession.getUserDao();
        }

        public static DbHelper getInstance(Context context) {
            if (instance == null){
                synchronized (DbHelper.class){
                    if (instance == null){
                        instance = new DbHelper(context);
                    }
                }
            }
            return instance;
        }

        public userDao getDao() {
            return dao;
        }

}
