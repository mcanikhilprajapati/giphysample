package com.up.stack.app.retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.up.stack.app.AppApplication;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {


    public static final String BASE_URL = "http://api.giphy.com/v1/gifs/";
    public static Retrofit getClient() {
        return AppApplication.retrofit;
    }
}
