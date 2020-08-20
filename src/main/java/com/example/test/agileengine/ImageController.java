package com.example.test.agileengine;

import com.example.test.agileengine.client.AgileEngineClient;
import com.example.test.agileengine.client.ApiKey;
import com.example.test.agileengine.client.Token;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/images")
@RestController
@RequiredArgsConstructor
public class ImageController {
    private final AgileEngineClient client;

    @GetMapping
    public ResponseEntity<?> getImages() {
        final Token authToken = client.getAuthToken(ApiKey.builder().apiKey("23567b218376f79d9415").build());
        client.getImages(authToken.getToken());
        return ResponseEntity.ok().build();
    }
}
