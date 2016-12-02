package video.youruier.com.video.application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.lqs.fast.mvpframework.app.BaseApplication;
import com.lqs.fast.mvpframework.utils.HttpUtil;
import com.lqs.fast.mvpframework.utils.ImageUtils;
import com.lqs.fast.mvpframework.utils.UiUtils;

/**
 * Created by dell on 2016/12/2.
 */

public class MyApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        HttpUtil.initVolley(Volley.newRequestQueue(this)); //初始化Volley
        ImageUtils.initFresco(this); //初始化Fresco
        UiUtils.initUiUtils(this);
    }
}
