package com.indiepopcorn.gradu.Networking;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by softmarshmallow on 2/11/18.
 */

public class ApiController
{
        private static ApiServer service = null;
        private static final String API_URL = "http://45.77.23.197:3000";
        public static ApiServer getService() {
                if(service == null) {
                        Retrofit retrofit = new Retrofit.Builder()
                                .baseUrl(API_URL)
                                .addConverterFactory(GsonConverterFactory.create())
                                .build();
                        service = retrofit.create(ApiServer.class);
                }
                return service;
        }
}
