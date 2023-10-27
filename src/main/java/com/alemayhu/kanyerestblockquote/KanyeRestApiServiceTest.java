package com.alemayhu.kanyerestblockquote;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class KanyeRestApiServiceTest {

    @Mock
    private KanyeRestApiService service;

    @Test
    public void test_returnsQuote() {
        // Arrange
        String quote = "For me to say I wasn't a genius I'd just be lying to you and to myself";

        MockitoAnnotations.initMocks(this);
        when(service.getQuote("")).thenReturn(new KanyeRestApiResponse());

        // Act
        KanyeRestApiResponse response = service.getQuote("");

        // Assert
        assertEquals(response.getQuote(), quote);
    }
}
