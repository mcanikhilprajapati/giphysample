package com.up.stack.app;

import android.content.Context;
import android.os.StrictMode;
import android.support.multidex.MultiDexApplication;

import com.up.stack.app.database.MyObjectBox;
import com.up.stack.app.retrofit.ApiClient;

import java.io.File;
import java.util.concurrent.TimeUnit;

import io.objectbox.BoxStore;
import io.objectbox.BoxStoreBuilder;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class AppApplication extends MultiDexApplication {

    public static final String BASE_URL = ApiClient.BASE_URL;
    public static float dip;
    public static Retrofit retrofit = null;
    public static NetworkConnectivity networkConnectivity;
    private static AppApplication mInstance;
   // public BoxStoreBuilder boxStoreBuilder;
    String TAG = AppApplication.class.getSimpleName();
    private BoxStore boxStore;

    public static AppApplication getInstance() {
        return mInstance;

    }

    public static void deleteCache(Context context) {
        try {
            File dir = context.getCacheDir();
            deleteDir(dir);
        } catch (Exception ignored) {
        }
    }

    public static boolean deleteDir(File dir) {
        if (dir != null && dir.isDirectory()) {
            String[] children = dir.list();
            for (String aChildren : children) {
                boolean success = deleteDir(new File(dir, aChildren));
                if (!success) {
                    return false;
                }
            }
            return dir.delete();
        } else
            return dir != null && dir.isFile() && dir.delete();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());

        dip = getResources().getDisplayMetrics().widthPixels;
        dip = dip / 320;

        networkConnectivity = new NetworkConnectivity(getApplicationContext());

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.connectTimeout(60, TimeUnit.SECONDS);
        httpClient.writeTimeout(60, TimeUnit.SECONDS);
        httpClient.readTimeout(60, TimeUnit.SECONDS);
        httpClient.addInterceptor(logging);

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();

     //   boxStoreBuilder.androidContext(AppApplication.this).build();
        boxStore = MyObjectBox.builder().androidContext(AppApplication.this).build();
    }

    public BoxStore getBoxStore() {
        return boxStore;
    }

    @Override
    public void onTerminate() {
        try {
            deleteCache(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onTerminate();
    }


}