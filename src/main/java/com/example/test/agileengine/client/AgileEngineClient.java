package com.example.test.agileengine.client;

import feign.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(url = "interview.agileengine.com", name = "agile")
public interface AgileEngineClient {

    @GetMapping("auth")
    Token getAuthToken(ApiKey token);

    @GetMapping("images")
    Response getImages(@RequestHeader("Authorization") String bearerToken);
}
