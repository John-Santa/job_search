package com.johncode.functional.jobsearch.api;

import feign.Feign;
import feign.gson.GsonDecoder;

public interface APIFunctions {
    static <T> T buildAPI(Class<T> classBuild, String url){
        return Feign.builder()
                .decoder(new GsonDecoder())
                .target(classBuild, url);
    }

}
