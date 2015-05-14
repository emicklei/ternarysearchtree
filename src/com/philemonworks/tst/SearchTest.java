package com.philemonworks.tst;

import junit.framework.TestCase;


public class SearchTest extends TestCase {
    
    public void testOneString() {
        SearchMap sm = new SearchMap();
        sm.put("top", "shop");
        assertEquals("shop", sm.get("top"));
    }
    public void testOneChar() {
        SearchMap sm = new SearchMap();
        sm.put("t", "op");
        assertEquals("op", sm.get("t"));
    }    
    public void testTwoStrings() {
        SearchMap sm = new SearchMap();
        sm.put("top", "shop");
        sm.put("her", "man");
        assertEquals("shop", sm.get("top"));
        assertEquals("her", sm.get("man"));
    }    
}
