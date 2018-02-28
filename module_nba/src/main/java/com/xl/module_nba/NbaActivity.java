package com.xl.module_nba;

import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.orhanobut.logger.Logger;
import com.xl.module_library.Base.BaseActivity;
import com.xl.module_library.Bean.NBA_JH;
import com.xl.module_library.NetWork.ApiManager;
import com.xl.module_library.NetWork.SimpleCallback;



/**
 * Created by ADMIN on 2018/2/28.
 */

@Route(path = "/module_nba/nba_activity")
public class NbaActivity extends BaseActivity {


    @Override
    public void loadView() {
        setContentView(R.layout.activity_nba);
    }

    @Override
    public void initData() {
        ApiManager apiManager = new ApiManager(getApplication());
        apiManager.getNbaInfo(new SimpleCallback<NBA_JH>() {
            @Override
            public void onStart() {

            }

            @Override
            public void onNext(NBA_JH nba_jh){
                Log.i("xl","nba_jh:"+nba_jh.toString());

            }

            @Override
            public void onComplete() {

            }
        });
    }
}
