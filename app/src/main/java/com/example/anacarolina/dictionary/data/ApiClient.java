package com.example.anacarolina.dictionary.data;

import io.reactivex.Single;
import retrofit2.Retrofit;

public class ApiClient {

    private final Retrofit retrofit;
    private final ApiService apiService;

    public ApiClient(Retrofit retrofit, ApiService apiService) {
        this.retrofit = retrofit;
        this.apiService = apiService;
    }

    // api methods

    public Single<ApiWord> searchDefinition(String word) {
        return null; //apiService.searchDefinition(word).subscribe();
    }


}