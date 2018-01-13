package com.xl.module_library.NetWork;

import com.xl.module_library.Bean.User;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;


/**
 * Created by wanglj on 16/7/4.
 */

public interface ApiService {

    @Headers(
            {"imei:sdfkj","name:xl"})
    @POST("user/getUserById")
    Observable<BaseResponse<User>> getUser(@Query("id") int id);
}
