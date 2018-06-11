/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

/**
 *
 * @author Akshay16
 */
public class HashItem {
    
    private Object key;
    private Object value;
    private HashItem next=null;
    public static final int TABLE_SIZE=5;

    public HashItem(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public HashItem getNext() {
        return next;
    }

    public void setNext(HashItem next) {
        this.next = next;
    }
    
    
    
}
