package org.learning;

import java.util.HashMap;
import java.util.Map;

public class NumberOfCharactersInAString {
    public static void main(String[] args) {

        String myArray = "This is My Array";
        Map<Character, Integer> carMap = new HashMap<Character, Integer>();
        for(char c : myArray.toCharArray())
        {
            if(c != ' ') {
                if (carMap.containsKey(c)) {
                    carMap.put(c, carMap.get(c) + 1);
                } else {
                    carMap.put(c, 1);
                }
            }
        }
        System.out.println(myArray + " : " + carMap);
    }
}
