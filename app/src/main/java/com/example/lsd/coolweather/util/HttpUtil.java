package com.example.lsd.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by lsd on 2018/1/25.
 * 服务器交互
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request requset = new Request.Builder().url(address).build();
        client.newCall(requset).enqueue(callback);
    }
}
