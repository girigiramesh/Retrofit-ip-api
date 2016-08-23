package com.retrofit_ip_api;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Ramesh on 8/23/16.
 */
public class RetrofitHandler {
    private static RetrofitHandler ourInstance = new RetrofitHandler();

    public static RetrofitHandler getInstance() {
        return ourInstance;
    }

    private Retrofit ipApiService = new Retrofit.Builder()
            .baseUrl("http://ip-api.com")
            .addConverterFactory(StringConverterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build();
   private Interface service = ipApiService.create(Interface.class);

    private RetrofitHandler() {
    }

    Call<String> getLocationInfo() {
        return service.getInfo();
    }
}
