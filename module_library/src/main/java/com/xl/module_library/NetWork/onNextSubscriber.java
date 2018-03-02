package com.xl.module_library.NetWork;

import android.app.Application;

import io.reactivex.functions.Consumer;


/**
 * 错误统一处理
 *
 * Created by wanglj on 16/7/4.
 */

public class onNextSubscriber<T> implements Consumer<T> {

    private SimpleCallback<T> simpleCallback;
    private Application application;

    public onNextSubscriber(SimpleCallback simpleCallback, Application application){
        this.simpleCallback = simpleCallback;
        this.application = application;
    }

    @Override
    public void accept(T t) throws Exception {
        simpleCallback.onNext(t);
    }


}
