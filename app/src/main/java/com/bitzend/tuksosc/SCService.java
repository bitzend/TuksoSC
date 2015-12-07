package com.bitzend.tuksosc;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by echessa on 6/18/15.
 */
public interface SCService {

    @GET("/tracks?client_id=" + Config.CLIENT_ID)
    void getRecentTracks(@Query("user_id") String date, Callback<List<Track>> cb);

}
