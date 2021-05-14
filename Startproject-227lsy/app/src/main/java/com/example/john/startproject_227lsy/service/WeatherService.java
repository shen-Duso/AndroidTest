package com.example.john.startproject_227lsy.service;

import com.example.john.startproject_227lsy.bean.WeatherReault;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by john on 2017/3/15.
 */

public interface WeatherService {
    @GET("data/sk/{cityNumber}.html")
    Call<WeatherReault>getResult(@Path("cityNumber")String cityNumber);
}
