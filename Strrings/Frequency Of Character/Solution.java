/*
 * logic : Using Hashmap  
    keep element in hashmap 
    convert the hashmap into the list entry
    sort the list
    append it 
    
    
    Logic Using Array : 
     arr[128] 
     arr[ch]++   a=97 and then A = 65 this will range in 128 

     use a Bucket easy to sort freq as a index 
     then append to the result 
 */

import java.util.*;
class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        StringBuilder res = new StringBuilder();
        //keep element in the hashmap 
        for(int i = 0; i < s.length(); i++)
        {
            int count = 1;
            if(map.containsKey(s.charAt(i)))
            {   
                int pc = map.get(s.charAt(i));
                count = pc + 1;
                map.put(s.charAt(i), count);
            }
            else{
                map.put(s.charAt(i), count);
            }
        }


        //convert the hashmap into the list entry 
        List<Map.Entry<Character, Integer>>list = new ArrayList<>(map.entrySet());


        //sort the list 
        list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        for (Map.Entry<Character, Integer> entry : list) {
            for (int i = 0; i < entry.getValue(); i++) {
                res.append(entry.getKey());
            }
        }
        return res.toString();




    }
}