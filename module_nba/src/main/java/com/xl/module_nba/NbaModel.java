package com.xl.module_nba;

import android.app.Application;
import android.content.Context;

import com.xl.module_library.Bean.NBA_JH;

/**
 * Created by ADMIN on 2018/3/1.
 */

public interface NbaModel {

    interface getDataResult{

        void onSuccess(NBA_JH nba_jh);

        void onFailure();

    }

    void getDataResultListener(Application application, getDataResult getDataResult);

}
