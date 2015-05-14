package com.philemonworks.tst;

public class NoNode implements Node {
    public static final Node singleton = new NoNode();

    public Node put(String key,int from, int to, Object value) {
        if (key.length() > 1) {
            StringNode node = new StringNode();
            node.string = key;
            node.value = value;
            return node;
        } else if (key.length() == 1) {
            CharNode node = new CharNode();
            node.character = key.charAt(0);
            node.value = value;
            return node;
        } else return null;
    }

    public Object get(String key, int from, int to) {
        return null;
    }    
}
