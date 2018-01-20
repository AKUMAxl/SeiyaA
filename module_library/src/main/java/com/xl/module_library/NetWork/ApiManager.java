package com.xl.module_library.NetWork;

import android.app.Application;

import com.google.gson.Gson;
import com.xl.module_library.Bean.User;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

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
                .subscribe(new ExceptionSubscriber<User>(simpleCallback,application));

    }

    public void InputStreamTest(SimpleCallback simpleCallback){
        JSONObject object = new JSONObject();

        try {
            object.put("terminal","1");
            object.put("version","1.0.1");
            object.put("imei","MI 2,5.0.2,Xiaomi,98544789");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Gson g = new Gson();
        test t = new test("123","123","234");
        String postInfoStr = g.toJson(t);

        RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"),postInfoStr);

        apiService.InputStreamTest(body)
                .concatMap(new BaseResponseFunc())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new ExceptionSubscriber(simpleCallback,application));
    }

    class test{
        String terminal;
        String version;
        String imei;

        public test(String terminal, String version, String imei) {
            this.terminal = terminal;
            this.version = version;
            this.imei = imei;
        }

        public test() {
        }


        public String getTerminal() {
            return terminal;
        }

        public void setTerminal(String terminal) {
            this.terminal = terminal;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getImei() {
            return imei;
        }

        public void setImei(String imei) {
            this.imei = imei;
        }

        @Override
        public String toString() {
            return "test{" +
                    "terminal='" + terminal + '\'' +
                    ", version='" + version + '\'' +
                    ", imei='" + imei + '\'' +
                    '}';
        }
    }

}
