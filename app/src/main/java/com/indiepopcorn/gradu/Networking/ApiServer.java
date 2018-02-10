package com.indiepopcorn.gradu.Networking;

import com.indiepopcorn.gradu.Models.IdRequestModel;
import com.indiepopcorn.gradu.Models.ResponseModel;
import com.indiepopcorn.gradu.Models.SchoolModel;
import com.indiepopcorn.gradu.Models.StatModel;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by dream on 2018-02-11.
 */

public interface ApiServer {
        @GET("/schools")
        Call<Map<String, SchoolModel>> updateSchools();

        @GET("/stats")
        Call<StatModel> updateStatus();

        @POST("/schools")
        Call<ResponseModel> createSchool(@Body SchoolModel school);

        @POST("/done")
        Call<ResponseModel> requestDone(@Body IdRequestModel requestData);

        @POST("/diploma")
        Call<ResponseModel> requestDiploma(@Body IdRequestModel requestData);
}
