package com.xl.module_library.NetWork;

import android.app.Application;

import com.xl.module_library.Bean.User;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;


/**
 * Created by wanglj on 16/7/4.
 */

public class ApiManager {

    private ApiService apiService;

    private final Application application;


    public ApiManager(Application application) {
        this.apiService = apiService = RetrofitClient.getIntance().getServiec();
        this.application = application;
    }

    public void getUser(int userID, SimpleCallback<User> simpleCallback){

        apiService.getUser(1)
                .concatMap(new BaseResponseFunc<User>())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new ExceptionSubscriber<User>(simpleCallback,application));

    }

}
