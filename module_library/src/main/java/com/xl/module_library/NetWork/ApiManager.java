package com.xl.module_library.NetWork;

import android.app.Application;

import com.google.gson.Gson;
import com.xl.module_library.Bean.NBA_JH;
import com.xl.module_library.Bean.User;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Retrofit;

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
                //.subscribe(new ExceptionSubscriber<User>(simpleCallback,application));
                .subscribe(new onNextSubscriber<User>(simpleCallback,application),
                        new onErrorSubscriber(simpleCallback,application),
                        new onCompeletAction(simpleCallback,application),
                        new onStartSubscriber(simpleCallback,application));
    }

    public void getNbaInfo( SimpleCallback<NBA_JH> simpleCallback){

        apiService.getNbaInfo("b03482e11e18d4a830cf47ddd78caaef")
                .concatMap(new BaseResponseFuncJH<NBA_JH>())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new onNextSubscriber<NBA_JH>(simpleCallback,application),
                        new onErrorSubscriber(simpleCallback,application),
                        new onCompeletAction(simpleCallback,application),
                        new onStartSubscriber(simpleCallback,application));

    }



}
