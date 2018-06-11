/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

/**
 *
 * @author AKShay16
 */
public class HashTable {
    
    private HashItem[] hashTable;

    public HashTable() {
        this.hashTable = new HashItem[HashItem.TABLE_SIZE];
    }
    
    
    private int compressioMap(Object value)
    {
        return Integer.parseInt((String) value)%HashItem.TABLE_SIZE;
    }
    
    public boolean put(Object key,Object value)
    {
       int index=compressioMap(key);
       if(hashTable[index]==null)
       {
           hashTable[index]=new HashItem(key,value);
           return true;
       }
       else
       {
           HashItem temp=hashTable[index];
           while(temp!=null)
           {
               if(temp.getNext()==null)
               {
                   if(temp.getKey().equals(key))
                   {
                       System.out.println("duplicate keys are not allowed   "+key);
                       return false;
                   }
                   temp.setNext(new HashItem(key,value));
                   return true;
               }
               else
               {
                   temp=temp.getNext();
               }
           }
           
           return true;
       }
    
       
    }
    
    public Object getValue(Object key)
    {
        int index=compressioMap(key);
        if(hashTable[index]==null)
        {
            return null;
        }
        else
        {
            HashItem temp=hashTable[index];
            while(temp!=null)
            {
                if(temp.getKey()==key)
                {
                    return temp.getValue();
                }
                else
                {
                    temp=temp.getNext();
                }
            }
            return null;
        }
    }
    
    
    
    
}
