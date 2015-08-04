package arraysandstrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by tylerfolkman on 8/2/15.
 */
public class q1 {

    HashMap<Character, Integer> hashMap = new HashMap<>();

    public boolean unique(String string){
        for (int i = 0; i < string.length(); i++){
            Character currentChar = string.charAt(i);
            if (hashMap.keySet().contains(currentChar)){
                return false;
            }
            hashMap.put(string.charAt(i), 1);
        }
        return true;
    }

    public boolean unique2(String string){
        char [] chars = string.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i++){
            if (i > 0 && chars[i] == chars[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args){

        q1 q = new q1();
        String string = "a";
        System.out.println("Unique: " + q.unique(string));
        System.out.println("Unique 2: " + q.unique2(string));


    }

}
