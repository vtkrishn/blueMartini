package com.resumely.object;

import java.util.Iterator;

public class Token<T> implements Iterable,Comparable{
    T token;
               
    public Token(T ch) {
        this.token = ch;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Token)
            return this.token == ((Token)obj).token;
        return false;
    }

    @Override
    public int hashCode() {
        return this.token.hashCode() % 31;
    }

    public Iterator iterator() {
        return null;
    }

    public int compareTo(Object o) {
        return 0;
    }
}
