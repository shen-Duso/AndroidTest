package com.example.john.startproject_227lsy.service;

import com.example.john.startproject_227lsy.bean.WeatherReault;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by john on 2017/3/15.
 */

public interface Weather51Service {
    @GET("GetMoreWeather")
    Call<WeatherReault> getResult(@Query("cityCode")String cityNumber,@Query("weatherType")int weatherType);
}
