package com.up.stack.app.retrofit;

import com.up.stack.app.model.response.GetGiphy;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface ApiInterface {



    @GET("search")
    Call<GetGiphy> getGiphy(@Query("q") String q, @Query("api_key") String api_key);
    //2R9DJPARIpK8MixQ3kI2UVjjQf3WsqBR
    //http://api.giphy.com/v1/gifs/search?q=funny+cat&api_key=2R9DJPARIpK8MixQ3kI2UVjjQf3WsqBR


}


