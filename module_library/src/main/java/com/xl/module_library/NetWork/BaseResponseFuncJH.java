package com.xl.module_library.NetWork;

import io.reactivex.Observable;
import io.reactivex.functions.Function;

/**
 * Created by ADMIN on 2018/2/28.
 */

public class BaseResponseFuncJH<T> implements Function<BaseResponseJH<T>, Observable<T>> {
    @Override
    public Observable<T> apply(BaseResponseJH<T> tBaseResponseJH) throws Exception {
        //遇到非200错误统一处理,将BaseResponse转换成想要的对象
        if (tBaseResponseJH.getError_code()!=0) {
            return Observable.error(new Throwable(tBaseResponseJH.getReason()));
        }else{
            return Observable.just(tBaseResponseJH.getResult());
        }
    }
}
