package com.lvpeiling.belibeli.network;

import com.lvpeiling.belibeli.entity.Project;
import com.lvpeiling.belibeli.entity.ResponseData;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by lpl72 on 2017/9/3.
 */

public interface ApiService {
    /**
     * 示例：https://api.behance.net/v2/projects?q=motorcycle&client_id=1234567890
     * q  Free text query string.
     sort  The order the results are returned in. Possible values: featured_date (default), appreciations, views, comments, published_date.
     time  Limits the search by time. Possible values: all (default), today, week, month.
     field  Limits the search by creative field. Accepts a URL-encoded field name from the list of defined creative fields.
     country  Limits the search by a 2-letter FIPS country code.
     state  Limits the search by state or province name.
     city  Limits the search by city name.
     page  The page number of the results, always starting with 1.
     tags  Limits the search by tags. Accepts one tag name or a pipe-separated list of tag names.
     color_hex  Limit results to an RGB hex value (without #)
     color_range  How closely to match the requested color_hex, in color shades (default:20) [0-255]
     license
     */
    @GET("projects?client_id="+ApiConstant.API_KEY)
    public Observable<ResponseData> getProjects(@Query("q") String query, @Query("sort") String sort, @Query("time") String time,
                                                @Query("field") String field, @Query("country") String country, @Query("state") String state,
                                                @Query("city") String city, @Query("page") String page, @Query("tags") String tags,
                                                @Query("color_hex") String color_hex);
}
