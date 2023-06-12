package com.example.challanger.answer;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class AnswserQuestions {

    // input : aa aa x bb bb bb z bb
    // output : 3
    @Test
    public void largestFrequencyOfDuplicatedWords() {
        String input = "cc cc aa aa x bb bb bb z bb";
        String[] arr = input.split(" ");
        int largestFreq = 0;
        Map<String, Integer> freq = new HashMap<>();


        for (int i = 0; i < arr.length; i++) {
            var key = arr[i];
            if (freq.containsKey(arr[i])) {
                var increment = freq.get(key) + 1;
                largestFreq = Math.max(largestFreq, increment);
                freq.put(arr[i], increment);
            } else {
                freq.put(key, 1);
            }
        }


        System.out.println(largestFreq);

    }

    // input : aaccccbb
    // output :  3
    @Test
    void LargestFrequencyOfCharacter() {
        String input = "aaccccbb";
        int largestFreq = 0;
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.substring(i - 1, i).equals(input.substring(i, i + 1))) {
                count++;
            } else {
                if (count > largestFreq) {
                    largestFreq = count;
                }
                count = 1;
            }
        }
        System.out.println(largestFreq);
    }

    // input : aaccccbb
    // output :  b - 2 , c-2, c-4
    @Test
    void tFrequencyOfCharacterInverseOrder() {
        String input = "aaccccbb";
        int largestFreq = 0;

        Map<String, Integer> freqMap = new TreeMap<>(Comparator.reverseOrder()); // reversed
        //Map<String,Integer> freqMap = new TreeMap<>(); //natural

        for (int i = 0; i < input.length(); i++) {
            var key = input.substring(i, i + 1);
            if (freqMap.containsKey(key)) {
                freqMap.put(key, freqMap.get(key) + 1);
            } else {
                freqMap.put(key, 1);
            }
        }
        freqMap.forEach((k, v) -> System.out.println(k + "-" + v));
    }


    @Test

    void romanNumber(){

        String s = "LVIII";

            int count = 0;
            Map<Character, Integer> map = new HashMap<>();
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);

            for (int i = 0; i < s.length(); i++) {

                if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                    count -= map.get(s.charAt(i));
                } else {
                    count += map.get(s.charAt(i));
                }
            }

        System.out.println(count);
        }


}
