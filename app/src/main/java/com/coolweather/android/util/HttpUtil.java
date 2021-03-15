package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @author zhangw
 * @name coldweather
 * @class name：com.coolweather.android.util
 * @class describe
 * @time 21-3-15 下午5:38
 * @change
 * @chang time
 * @class describe
 */
public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
