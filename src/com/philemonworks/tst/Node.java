package com.philemonworks.tst;

public interface Node {
    public abstract Object get(String key, int from, int to);

    public abstract Node put(String key, int from, int to, Object value);
}