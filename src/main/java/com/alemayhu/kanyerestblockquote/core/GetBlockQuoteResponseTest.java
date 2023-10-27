package com.alemayhu.kanyerestblockquote.core;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetBlockQuoteResponseTest {

    @Test
    public void returnsCorrectResponse() {
        // Arrange
        String quote = "For me to say I wasn't a genius I'd just be lying to you and to myself";
        String cite = "http://api.kanye.rest";
        String author = "Kanye West";

        // Act
        String actual = GetBlockQuoteResponse.build(quote, author, cite);

        String expected = "<blockquote cite=\"http://api.kanye.rest\">\n" +
                "                <p>For me to say I wasn't a genius I'd just be lying to you and to myself</p>\n" +
                "                <footer>—<cite>Kanye West</cite></footer>\n" +
                "            </blockquote>";

        // Assert
        assertEquals(actual, expected);
    }
}
