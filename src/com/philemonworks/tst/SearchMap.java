package com.philemonworks.tst;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class SearchMap implements Map<String,Object> {
    public Node root = new NoNode();

    public void clear() {
        // TODO Auto-generated method stub
        
    }

    public boolean containsKey(java.lang.Object key) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean containsValue(java.lang.Object value) {
        // TODO Auto-generated method stub
        return false;
    }

    public Set<java.util.Map.Entry<String, Object>> entrySet() {
        // TODO Auto-generated method stub
        return null;
    }

    public Object get(java.lang.Object key) {
        // TODO Auto-generated method stub
        return null;
    }
    
    public Object get(String key) {
        return root.get(key,0,key.length()-1);
    }
    
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    public Set<String> keySet() {
        // TODO Auto-generated method stub
        return null;
    }

    public Object put(String key, Object value) {
        // TODO Auto-generated method stub
        root = root.put(key,0, key.length()-1, value);
        return value;
    }

    public void putAll(Map<? extends String, ? extends Object> t) {
        // TODO Auto-generated method stub
        
    }

    public Object remove(java.lang.Object key) {
        // TODO Auto-generated method stub
        return null;
    }

    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    public Collection<Object> values() {
        // TODO Auto-generated method stub
        return null;
    }
}