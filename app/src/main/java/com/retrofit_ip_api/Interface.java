package com.retrofit_ip_api;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Ramesh on 8/23/16.
 */
public interface Interface {
    @GET("/json")
    Call<String> getInfo();
}
