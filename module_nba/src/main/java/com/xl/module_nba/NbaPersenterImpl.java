package com.xl.module_nba;

import android.app.Application;
import android.content.Context;

import com.xl.module_library.Bean.NBA_JH;

/**
 * Created by ADMIN on 2018/3/1.
 */

public class NbaPersenterImpl implements NbaPsersenter,NbaModel.getDataResult {

    private NbaView nbaView;
    private NbaModel nbaModel;

    public NbaPersenterImpl(NbaView nbaView){
        this.nbaView = nbaView;
        nbaModel = new NbaModelImpl();
    }

    @Override
    public void getData(Application application) {
        nbaModel.getDataResultListener(application,this);
    }

    @Override
    public void onDestory() {
        if (nbaView!=null)
            nbaView = null;
    }

    @Override
    public void onSuccess(NBA_JH nba_jh) {
        nbaView.setData(nba_jh);
    }

    @Override
    public void onFailure() {

    }
}
