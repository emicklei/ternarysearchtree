package com.philemonworks.tst;

public class StringNode extends AbstractNode {
    public String string;
    public Object value;
    
    public Object get(String key, int from, int to) {
        if (string.length() != to-from+1) return null;
        for (int i=0;i<string.length();i++) {
            if (key.charAt(i+from) != string.charAt(i))
                return null;
        }
        return value;
    }
    public Node put(String key,int from, int to, Object value) { 
        return null;
    }
}
