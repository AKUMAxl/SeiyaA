package com.xl.module_login;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xl.module_library.Base.BaseActivity;
import com.xl.module_library.Bean.User;
import com.xl.module_library.NetWork.ApiManager;
import com.xl.module_library.NetWork.ApiService;
import com.xl.module_library.NetWork.SimpleCallback;
import com.xl.module_library.Util.ChangeActivityUtil;

@Route(path = "/module_login/login_activity")
public class LoginActivity extends BaseActivity{

    TextView textView;

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
                //ChangeActivityUtil.getIntance().ToNextActivity(oThis,"/module_main/main_activity",null,true);
                ApiManager manager = new ApiManager(getApplication());
                manager.getUser(1, new SimpleCallback<User>() {
                    @Override
                    public void onStart() {

                    }

                    @Override
                    public void onNext(User user) {
                        Log.i("xl","---"+user.toString());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
            }
        });
    }


}
