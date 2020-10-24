package com.exercise;

import java.util.Arrays;

public class ArrayUtil {

    /*
     * Given two arrays a and b write a function comp(a, b) (compSame(a, b) in
     * Clojure) that checks whether the two arrays have the "same" elements, with
     * the same multiplicities. "Same" means, here, that the elements in b are the
     * elements in a squared, regardless of the order.
     * 
     */
    public static boolean isArrayBExponentiationOfTwoOfArrayA(int[] a, int[] b) {

        if (a == null || b == null || a.length != b.length) {
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            
            if (a[i] * a[i] == b[i]) {
                continue;
            }
            return false;
        }

        return true;
    }

    /* You are going to be given an array of integers. 
    Your job is to take that array and find an 
    index N where the sum of the integers to the left of N
     is equal to the sum of the integers to the right of N.
      If there is no index that would make this happen, return -1. */
    public static int findIndexForEvenBothSides(int[] arr) {
        // your code

        return -1;
      }
}
