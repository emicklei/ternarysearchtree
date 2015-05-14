package com.philemonworks.tst;

public class AbstractNode implements Node {
    public Node less = NoNode.singleton;
    public Node equal = NoNode.singleton;
    public Node greater = NoNode.singleton;
    
    /* (non-Javadoc)
     * @see com.philemonworks.tst.Node#get(java.lang.String, int, int)
     */
    public Object get(String key, int from, int to) {
        return null;
    }
    /* (non-Javadoc)
     * @see com.philemonworks.tst.Node#put(java.lang.String, int, int, java.lang.Object)
     */
    public Node put(String key,int from, int to, Object value) {
        return this;
    }
}
