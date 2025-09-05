package org.learning;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CountNumberOfWords {
    public static void main(String[] args) {
        String str = "I am learning java";
        long count = Arrays.stream(str.split("\\s+")).count();
        System.out.println(count);
    }
}
