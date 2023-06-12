package com.example.core.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayTest {

    private String entry = "AA BB CC DD EE";


    @Test
    void initialize2DArrayByCharAT() {
        String[] entryArray = entry.split(" ");

        String[][] rectangle = new String[entryArray.length][entryArray[0].length()];

        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                rectangle[i][j] = String.valueOf(entryArray[i].charAt(j));
                System.out.print(rectangle[i][j]);
            }
            System.out.println();
        }
    }


    @Test
    void initiazie2DArrayBySplit() {
        String[] entryArray = entry.split(" ");
        String[][] rectangle = new String[entryArray.length][entryArray[0].length()];

        for (int i = 0; i < rectangle.length; i++) {
            rectangle[i] = entryArray[i].split("");
        }

        for (String[] strings : rectangle) {
            for (int j = 0; j < strings.length; j++) {

                System.out.print(strings[j]);
            }
            System.out.println();
        }
    }


    @Test
    void sort2DArrayInverse() {
        String entry = "ZYWR BCDA BCDA";

        String[] entryArray = entry.split(" ");
        String[][] rectangle = new String[entryArray.length][entryArray[0].length()];

        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                rectangle[i][j] = String.valueOf(entryArray[i].charAt(j));

            }
        }


        //Comparing, given a complex element (a) sort by property (a[0] )
        Arrays.sort(rectangle, Comparator.comparing((String[] a) -> a[0]).reversed());


        for (int i = 0; i < rectangle.length; i++) {
            Arrays.sort(rectangle[i]);
            for (int j = 0; j < rectangle[i].length; j++) {
                System.out.print(rectangle[i][j]);
            }
            System.out.println("");
        }
    }


    @Test
    void sort2DArrayInverse2() {
        int[][] rectangle = {
                {5, 10, 15, 20},
                {2, 7, 12, 17},
                {4, 9, 14, 19},
                {3, 8, 13, 18},
                {1, 6, 11, 16}
        };


        //Comparing, given a complex element (a) sort by property (a[0] )
        Arrays.sort(rectangle, Comparator.comparing((int[] a) -> a[0]).reversed());


        for (int i = 0; i < rectangle.length; i++) {
            Arrays.sort(rectangle[i]);
            for (int j = 0; j < rectangle[i].length; j++) {
                System.out.print(rectangle[i][j]);
            }
            System.out.println("");
        }
    }

    @Test
    void turnArrayIntoList() {
        int[] arr = {1, 2, 3, 4, 5};

        Arrays.stream(arr).sorted()
                .forEach((a) -> System.out.println(a + 100));
    }


}
