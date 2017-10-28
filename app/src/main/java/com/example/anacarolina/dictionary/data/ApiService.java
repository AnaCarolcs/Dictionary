package com.example.anacarolina.dictionary.data;

import io.reactivex.Single;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

interface ApiService {

    @GET("/word.json/{word}/definitions")
    Single<Response<ApiWord>> searchDefinition(@Path("word") String word);

    //@POST("")
    //Single<Response<>>

}