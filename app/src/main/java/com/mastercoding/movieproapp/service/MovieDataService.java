package com.mastercoding.movieproapp.service;

import com.mastercoding.movieproapp.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieDataService {
    @GET("movie/now_playing")
    Call<Result> getPopularMovies(@Query("api_key") String apiKey);

}
