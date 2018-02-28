package com.xl.module_library.NetWork;


import io.reactivex.Observable;
import io.reactivex.functions.Function;



public class BaseResponseFunc<T> implements Function<BaseResponse<T>, Observable<T>> {

    @Override
    public Observable<T> apply(BaseResponse<T> tBaseResponse) throws Exception {
        //遇到非200错误统一处理,将BaseResponse转换成想要的对象
        if (tBaseResponse.getCode() != 200) {
            return Observable.error(new Throwable(tBaseResponse.getMessage()));
        }else{
            return Observable.just(tBaseResponse.getResult());
        }
        /*if (tBaseResponse.getError_code()!=0) {
            return Observable.error(new Throwable(tBaseResponse.getReason()));
        }else{
            return Observable.just(tBaseResponse.getResult());
        }*/
        //return null;
    }

}
