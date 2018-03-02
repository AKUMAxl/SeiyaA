package com.xl.module_library.NetWork;


import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import com.orhanobut.logger.Logger;

import io.reactivex.functions.Consumer;

/**
 * Created by ADMIN on 2018/1/23.
 */

public class onErrorSubscriber implements Consumer<Throwable> {

    private Application application;
    private SimpleCallback simpleCallback;

    public onErrorSubscriber(SimpleCallback simpleCallback, Application application){
        this.application = application;
        this.simpleCallback = simpleCallback;
    }

    @Override
    public void accept(Throwable throwable) throws Exception {
        throwable.printStackTrace();
        Logger.i("xl",throwable.getMessage());
        if (throwable.toString().contains("codeError:")){
            simpleCallback.onError(throwable.getMessage().replace("codeError:",""));
            Toast.makeText(application,throwable.getMessage().replace("codeError:",""),Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(application,"发生网络错误",Toast.LENGTH_SHORT).show();
        }
    }
}
