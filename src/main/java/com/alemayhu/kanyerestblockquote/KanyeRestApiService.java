package com.alemayhu.kanyerestblockquote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class KanyeRestApiService {

    @Autowired
    private RestTemplate restTemplate;

    public KanyeRestApiResponse getQuote(String apiUrl) {
        return restTemplate.getForObject(apiUrl, KanyeRestApiResponse.class);
    }
}
