package debug;

import android.app.Application;
import android.content.Context;

import com.xl.module_library.Base.BaseApplication;

/**
 * Created by ADMIN on 2018/2/28.
 */

public class Nba_Application extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();

    }


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        // dex突破65535的限制
        //MultiDex.install(this);
    }

}
