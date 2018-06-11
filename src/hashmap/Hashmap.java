/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

/**
 *
 * @author AKshay16
 */
public class Hashmap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashTable hashtable=new HashTable();
        hashtable.put("1","12");
        hashtable.put("1","13");
        hashtable.put("3","14");
        hashtable.put("4","15");
        hashtable.put("5","16");
        hashtable.put("6","17");
        
        Object res=hashtable.getValue("6");
       System.out.println(res);
    }
    
}
