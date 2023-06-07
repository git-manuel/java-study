package com.example.core.string;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexText {


    @Test
    public void findWhiteSpaceInAString() {
        Pattern pattern = Pattern.compile("\\s", Pattern.CASE_INSENSITIVE);
        var matcher = pattern.matcher("hello world!");
        assertTrue(matcher.find(), "");
        System.out.println(matcher.group());
    }


    /*You have a test string . Your task is to match the pattern XXxXXxXX
    Here, x  denotes whitespace characters, and X denotes non-white space characters.
    */
    @Test
    public void findWhiteSpaceAndNoWhiteSpace() {
        var pattern = Pattern.compile("[^\\s]{2}\\s[^\\s]{2}\\s[^\\s]{2}");

        assertTrue(  pattern.matcher("__ __ __").find());
    }

    @Test
    public void  removeDuplicateWordsCaseInsensitive(){
        String source = "Hello hello Ab aB";
        String regex = "(?i)(\\b\\w+)(\\s\\1\\b)+";

        System.out.println(source.replaceAll(regex,"$2"));


    }


}
