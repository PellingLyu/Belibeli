package com.lvpeiling.belibeli.network;

import android.support.annotation.Nullable;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.lvpeiling.belibeli.entity.ResponseData;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lpl72 on 2017/8/2.
 */

public class RetrofitManager {
    private Retrofit retrofit;
    private static final int DEFAULT_TIMEOUT = 10;
    private ApiService mApiService;

    private RetrofitManager(){
        OkHttpClient.Builder okhttpBuilder = new OkHttpClient.Builder();
        okhttpBuilder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(DEFAULT_TIMEOUT,TimeUnit.SECONDS)
                .writeTimeout(DEFAULT_TIMEOUT,TimeUnit.SECONDS);
        retrofit = new Retrofit.Builder().client(okhttpBuilder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(ApiConstant.BASEURL).build();
        mApiService = retrofit.create(ApiService.class);
    }
    public static RetrofitManager getInstance(){
        return RetrofitManagerHolder.instance;
    }
    private static class RetrofitManagerHolder{
        static final RetrofitManager instance = new RetrofitManager();
    }
    public Observable<ResponseData> getProjectList(Map<String, String> queryParam, int mPage){
        String query = null,sort = null,time =null ,field = null,country =null ,state =null,city =null ,page =null ,tags = null,color_hex = null;
        if(queryParam!=null){
            query = queryParam.get("query");
            sort = queryParam.get("sort");
            time = queryParam.get("time");
            field = queryParam.get("field");
            country = queryParam.get("country");
            state = queryParam.get("state");
            city = queryParam.get("city");
            page = String.valueOf(mPage);
            tags = queryParam.get("tags");
            color_hex = queryParam.get("color_hex");
        }
        return mApiService.getProjects(query, sort, time, field, country, state, city, page, tags, color_hex);
    }

}
