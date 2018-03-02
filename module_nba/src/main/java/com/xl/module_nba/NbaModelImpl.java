package com.xl.module_nba;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.orhanobut.logger.Logger;
import com.xl.module_library.Bean.NBA_JH;
import com.xl.module_library.NetWork.ApiManager;
import com.xl.module_library.NetWork.SimpleCallback;

/**
 * Created by ADMIN on 2018/3/1.
 */

public class NbaModelImpl implements NbaModel {


    @Override
    public void getDataResultListener(Application application, final getDataResult getDataResult) {
        ApiManager apiManager = new ApiManager(application);
        apiManager.getNbaInfo(new SimpleCallback<NBA_JH>() {
            @Override
            public void onStart() {

            }

            @Override
            public void onNext(NBA_JH nba_jh) {
                Logger.i("nba_jh:"+nba_jh.toString());
                getDataResult.onSuccess(nba_jh);
            }

            @Override
            public void onComplete() {

            }

            @Override
            public void onError(String errorStr) {

            }
        });


    }

}
