package com.example.core.string;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringTests {
    private String expected = "HelloWorld";


    @Test
    void substring() {

        System.out.println(expected.substring(1, 20));
    }

    @Test
    void navigatingThroughString() {
        String actual = "";
        for (int i = 0; i < expected.length(); i++) {
            actual += expected.substring(i, i + 1);
        }
        System.out.println(actual);
        Assert.isTrue(expected.equals(actual), "");
    }


    @Test
    void chartToStringConversion() {
        char actual = 'H';
        assertEquals(expected, String.valueOf(actual));
    }

    @Test
    void leftRotateStringByNPositions() {
        int n = 2;
        String st = "GeeksforGeeks";
        String rotationPart = st.substring(0, n);
        String rest = st.substring(n - 1);
        System.out.println(rest + rotationPart);
    }

    @Test
    void FrequencyOfEachCharacterAlphabeticalOrderStreamApprocha() {
        String st = "cccbba";
        List<String> arr = Arrays.asList(st.split(""));

        arr.stream()
                .sorted()
                .distinct()
                .forEach(s -> {
                    int count = 0;
                    for (int i = 0; i < st.length(); i++) {
                        if (s.equalsIgnoreCase(st.substring(i, i + 1))) {
                            count++;
                        }
                    }
                    System.out.println(count);
                    count = 0;
                });
    }

    @Test
    void FrequencyOfEachCharacterAlphabeticalOrderMapApproach() {
        String st = "cccbba";

        Map<String, Integer> freq = new HashMap<>();

        for (int i = 0; i < st.length(); i++) {
            String key = st.substring(i, i + 1);
            if (!freq.containsKey(key)) {
                freq.put(key, 1);
            } else {
                freq.put(key, freq.get(key) + 1);
            }
        }

        for (Map.Entry entry : freq.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
    }

    @Test
        //Given a String S of length N, two integers B and C, the task is to traverse characters starting from the beginning,
        // swapping a character with the character after C places from it, i.e.
        // swap characters at position i and (i + C)%N. Repeat this process B times, advancing one position at a time.
        // Your task is to find the final String after B swaps.
    void swap() {
        String s = "ABCDE";
        char[] arr = s.toCharArray();
        int b = 10;
        int c = 6;

        for (int j = 0; j < b; j++) {
            int i = (j % s.length());
            int k = (j + c) % s.length();
            char aux = arr[i];
            arr[i] = arr[k];
            arr[k] = aux;

            System.out.println(new String(arr));
        }
    }

    @Test
        //Given a string str and an array of indices chars[] that describes the indices in the original string where the characters will be added.
        //For this post, let the character to be inserted in star (*).
        // Each star should be inserted before the character at the given index.
        // Return the modified string after the stars have been added.

    void insertCharInPonsition() {

    }

    @Test
        //Remove charaters from string
    void removeCharacter() {


        String remove = "e";
        String s = "geeksforgeeks";

        System.out.println(s.replace("e","")); // string , string
        System.out.println(s.replaceAll("e","")); // regex , string

    }

    @Test
    void compareLiteralAndObjectString(){

        System.out.println( "hello".equals(new String("hello")));
    }




}
