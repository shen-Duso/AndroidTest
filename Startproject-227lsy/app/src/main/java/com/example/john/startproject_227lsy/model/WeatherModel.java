package com.example.john.startproject_227lsy.model;

import com.example.john.startproject_227lsy.bean.WeatherReault;
import com.example.john.startproject_227lsy.iface.WeatherListener;
import com.example.john.startproject_227lsy.iface.Weatheriface;
import com.example.john.startproject_227lsy.service.WeatherService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by john on 2017/3/14.
 */

public class WeatherModel implements Weatheriface {
    private Retrofit retrofit;
    private String BASEURL="http://www.weather.com.cn/";
    private WeatherService weatherService;
    public WeatherModel(){
        retrofit = new Retrofit.Builder()
                .baseUrl(BASEURL)
                .addConverterFactory (GsonConverterFactory.create())
                .build();
    }
    @Override
    public void getWeather(String cityno,final WeatherListener listener) {
        weatherService=retrofit.create(WeatherService.class);
        Call<WeatherReault> call=weatherService.getResult(cityno);
        call.enqueue(new Callback<WeatherReault>() {
            @Override
            public void onResponse(Call<WeatherReault> call, Response<WeatherReault> response) {

                if (response.isSuccessful()&&response.body()!=null) {
                    listener.onResponse(response.body().getWeatherinfo());
                }
               else
                    listener.onFail("onresponse fail");
            }

            @Override
            public void onFailure(Call<WeatherReault> call, Throwable t) {
                listener.onFail(t.toString());

            }
        });
    }
}
