package com;

public class Token {
    public TokenType type;
    public String symbolText;
    public int index;
    public int to;
    public Token (TokenType value, String symbolText, int index, int matched) {
        type = value;
        this.symbolText = symbolText;
        this.index = index;
        to = matched;
    }
}