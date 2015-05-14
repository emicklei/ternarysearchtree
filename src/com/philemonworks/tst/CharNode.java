package com.philemonworks.tst;

public class CharNode extends AbstractNode {
    public char character;
    public Object value; 
    
    public Object get(String key, int from, int to) {
        if (0 != to-from) return null;
        return character == key.charAt(from) ? value : null;
    }    
}
