package com.exercise;

import java.util.Stack;

public class StringUtil {

    /*
     * splits the string into pairs of two characters. If the string contains an odd
     * number of characters then it should replace the missing second character of
     * the final pair with an underscore ('_').
     */
    public static String[] StringSplit(String sentence) {

        Integer lengthOfSentence = sentence.length();
        Integer sizeOfResultArray = lengthOfSentence / 2;
        Boolean isOdd = lengthOfSentence % 2 != 0;
        if (isOdd) {
            sizeOfResultArray += 1;
            sentence = sentence + "_";
        }

        String[] result = new String[sizeOfResultArray];
        for (Integer i = 0; i < sizeOfResultArray; i++) {
            Integer beginIndex = i * 2;
            Integer endIndex = beginIndex + 2;
            result[i] = sentence.substring(beginIndex, endIndex);
        }
        return result;
    }

    public static String backspaceNumberSignInString(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!stack.empty()) {
                    stack.pop();
                }
                continue;
            }
            stack.push(s.charAt(i));
        }
        String result = "";

        for (Character character : stack) {
            result += character;
        }
        return result;
    }

}