package com.example.john.startproject_227lsy.iface;

import com.example.john.startproject_227lsy.bean.WeatherInfo;

/**
 * Created by john on 2017/3/14.
 */

public interface WeatherListener {
    void onResponse(WeatherInfo weatherInfo);
    void onFail(String msg);
}
