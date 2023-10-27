package com.alemayhu.kanyerestblockquote.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetBlockQuoteResponseTest {

    @Test
    public void returnsCorrectResponse() {
        // Arrange
        String quote = "For me to say I wasn't a genius I'd just be lying to you and to myself";

        // Act
        String actual = GetBlockQuoteResponse.build(quote);
        String expected = "<p>For me to say I wasn't a genius I'd just be lying to you and to myself</p>\n";

        // Assert
        assertEquals(actual, expected);
    }
}
