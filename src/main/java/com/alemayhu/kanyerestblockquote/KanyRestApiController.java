package com.alemayhu.kanyerestblockquote;

import com.alemayhu.kanyerestblockquote.core.GetBlockQuoteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KanyRestApiController {
    @Autowired
    private KanyeRestApiService service;

    @GetMapping("/quote")
    public String getData() {
        KanyeRestApiResponse response = service.getQuote("http://api.kanye.rest");
        return GetBlockQuoteResponse.build(response.getQuote(), "Kanye West", "http://api.kanye.rest");
    }
}
