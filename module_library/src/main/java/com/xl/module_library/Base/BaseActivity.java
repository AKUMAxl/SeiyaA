package com.xl.module_library.Base;


import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.xl.module_library.Manager.ViewManager;
import com.xl.module_library.NetState.NetManagerUtil;
import com.xl.module_library.NetState.NetStateChangeReceiver;
import com.xl.module_library.R;
import com.xl.module_library.Util.Utils;



//import butterknife.ButterKnife;


/**
 * Created by ADMIN on 2017/11/6.
 */

public abstract class BaseActivity extends AppCompatActivity implements NetStateChangeReceiver.netStateChangeListener{

    public static NetStateChangeReceiver.netStateChangeListener netStateChangeListener;

    public Boolean crrentHasNet = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //butterknife.ButterKnife.inject(this);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        ViewManager.getInstance().addActivity(this);
        //检测网络状态 以决定是否加载网络错误页
        if (checkNetState()){
            loadView();
            initData();
            firstRequestNet();
            fresh();
        }else{
            setContentView(R.layout.activity_error);
            findViewById(R.id.net_error).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (checkNetState()){
                        loadView();
                        initData();
                        firstRequestNet();
                        fresh();
                    }
                }
            });
        }

    }


    @Override
    protected void onResume() {
        super.onResume();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        ViewManager.getInstance().finishActivity(this);
    }

    @Override
    public void finish() {
        super.finish();
        this.overridePendingTransition(R.anim.fragment_slide_in_from_left,R.anim.fragment_slide_out_from_right);
    }

    private boolean checkNetState(){
        int currentNetState = NetManagerUtil.getNEtState(this);
        if (currentNetState==NetManagerUtil.NET_NONE){
            return false;
        }
        return true;
    }

    /**
     * 在网络恢复后加载正确页面
     */
    public abstract void loadView();

    /**
     * 初始化操作
     */
    public abstract void initData();

    /**
     * 首次请求网络数据 子类可重写
     */
    public void firstRequestNet(){}

    /**
     * 刷新页面  子类可重写
     */
    public void fresh(){}

    /**
     * 当前网络状态
     * @param state  0：网络未连接   1：wifi  2：mobile
     */
    @Override
    public void netStateChange(int state) {
        if (state==0){
            crrentHasNet = false;
        }else {
            crrentHasNet = true;
        }
    }

    /**
     * 添加fragment
     *
     * @param fragment
     * @param frameId
     */
    protected void addFragment(BaseFragment fragment, @IdRes int frameId) {
        Utils.checkNotNull(fragment);
        getSupportFragmentManager().beginTransaction()
                .add(frameId, fragment, fragment.getClass().getSimpleName())
                .addToBackStack(fragment.getClass().getSimpleName())
                .commitAllowingStateLoss();

    }


    /**
     * 替换fragment
     * @param fragment
     * @param frameId
     */
    protected void replaceFragment(BaseFragment fragment, @IdRes int frameId) {
        Utils.checkNotNull(fragment);
        getSupportFragmentManager().beginTransaction()
                .replace(frameId, fragment, fragment.getClass().getSimpleName())
                .addToBackStack(fragment.getClass().getSimpleName())
                .commitAllowingStateLoss();

    }


    /**
     * 隐藏fragment
     * @param fragment
     */
    protected void hideFragment(BaseFragment fragment) {
        Utils.checkNotNull(fragment);
        getSupportFragmentManager().beginTransaction()
                .hide(fragment)
                .commitAllowingStateLoss();

    }


    /**
     * 显示fragment
     * @param fragment
     */
    protected void showFragment(BaseFragment fragment) {
        Utils.checkNotNull(fragment);
        getSupportFragmentManager().beginTransaction()
                .show(fragment)
                .commitAllowingStateLoss();

    }


    /**
     * 移除fragment
     * @param fragment
     */
    protected void removeFragment(BaseFragment fragment) {
        Utils.checkNotNull(fragment);
        getSupportFragmentManager().beginTransaction()
                .remove(fragment)
                .commitAllowingStateLoss();

    }


    /**
     * 弹出栈顶部的Fragment
     */
    protected void popFragment() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 1) {
            getSupportFragmentManager().popBackStack();
        } else {
            finish();
        }
    }

}
