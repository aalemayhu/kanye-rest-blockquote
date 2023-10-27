package com.alemayhu.kanyerestblockquote.core;

public class GetBlockQuoteResponse {
    public static String build(String quote, String author, String cite) {
        return  String.format("<blockquote cite=\"%s\">\n", cite) +
                String.format( "                <p>%s</p>\n", quote)+
                String.format("                <footer>—<cite>%s</cite></footer>\n", author) +
                "            </blockquote>";
    }
}
