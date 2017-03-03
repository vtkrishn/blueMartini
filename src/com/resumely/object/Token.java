package com.resumely.object;

public class Token {
    char character;
               
    public Token(char ch) {
        this.character = ch;
    }

    @Override
    public boolean equals(Object obj) {
        return this.character == ((Token)obj).character;
    }

    @Override
    public int hashCode() {
        return this.character % 31;
    }
}
