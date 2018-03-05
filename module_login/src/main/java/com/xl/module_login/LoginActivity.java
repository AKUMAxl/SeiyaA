package com.xl.module_login;

import android.content.Context;
import android.net.NetworkInfo;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.orhanobut.logger.Logger;
import com.xl.module_library.Base.BaseActivity;
import com.xl.module_library.Bean.User;
import com.xl.module_library.NetWork.ApiManager;
import com.xl.module_library.NetWork.ApiService;
import com.xl.module_library.NetWork.SimpleCallback;
import com.xl.module_library.Util.ChangeActivityUtil;
import com.xl.module_library.Util.LocationUtils;

@Route(path = "/module_login/login_activity")
public class LoginActivity extends BaseActivity{

    TextView textView,is_tv;

    private AdView mAdView;

    @Override
    public void loadView() {
        setContentView(R.layout.activity_login);
    }

    @Override
    public void initData() {
        textView = findViewById(R.id.login_tv);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("xl","点击登录");

                //LocationUtils.getIntance(oThis.getApplicationContext()).locationStart();
                ChangeActivityUtil.getIntance().ToNextActivity(LoginActivity.this,"/module_main/main_activity",null,true);

            }
        });

        is_tv = findViewById(R.id.is_tv);
        is_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChangeActivityUtil.getIntance().ToNextActivity(LoginActivity.this,"/module_nba/nba_activity",null,false);

            }
        });
        //ca-app-pub-3940256099942544~3347511713  demo
        //ca-app-pub-9643696608722970~7343467312  SeiyaA
        /*MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");
        mAdView = findViewById(R.id.ad_view);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();

        // Start loading the ad in the background.
        mAdView.loadAd(adRequest);*/

    }


}
