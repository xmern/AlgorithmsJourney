package com.algo;

import java.util.HashMap;

public class IsAnagram {
    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        boolean isanagram = true;
        HashMap<Character, Integer> wordHash = new HashMap<>();
        HashMap<Character, Integer> wordHash2 = new HashMap<>();

        for (int i = 0; i < s.length() ; i++){
            char currentChar = s.charAt(i);
            if (wordHash.containsKey(currentChar)){
                wordHash.put(currentChar, wordHash.get(currentChar) + 1); 
            }else {
                wordHash.put(currentChar, 1);
            }
            
        }

        for (int i = 0; i < t.length() ; i++){
            char currentChar = t.charAt(i);
            if (wordHash2.containsKey(currentChar)){
                wordHash2.put(currentChar, wordHash2.get(currentChar) + 1); 
            }else {
                wordHash2.put(currentChar, 1);
            }
            
        }    

        // for (int i = 0; i < t.length(); i++){
        //     char letter = t.charAt(i);
        //     if (wordHash.containsKey(letter) && (wordHash.get(letter) == wordHash2.get(letter))){
        //        isanagram = true;
        //     }
        //     else{
        //         return false;
        //     }
        //     //wordHash.put(s.charAt(i), s.charAt(i));
        // } 
        if (!wordHash.equals(wordHash2)){
            return false;
        }
        return isanagram;


    }
}
