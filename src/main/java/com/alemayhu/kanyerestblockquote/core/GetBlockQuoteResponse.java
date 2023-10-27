package com.alemayhu.kanyerestblockquote.core;

public class GetBlockQuoteResponse {
    public static String build(String quote) {
        return String.format("<p>%s</p>\n", quote);
    }
}
