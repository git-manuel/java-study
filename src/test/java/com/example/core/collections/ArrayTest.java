package com.example.core.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayTest {

    private String entry = "AA BB CC DD EE";


    @Test
    void initiazie2DArrayByCharAT() {
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
        Arrays.sort(rectangle, Comparator.comparing(a -> a[0]));


        for (int i = 0; i < rectangle.length; i++) {
            Arrays.sort(rectangle[i]);
            for (int j = 0; j < rectangle[i].length; j++) {
                System.out.print(rectangle[i][j]);

            }
            System.out.println("");
        }

    }


}
