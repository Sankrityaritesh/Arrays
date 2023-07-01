package com.ritesh;

import java.util.Arrays;

public class Permutation {
//Build Array from permutation
    public static void main(String[] args) {
        int[] permutation = {2,0,1,4,3};
        int n = permutation.length;
        int[] arr = new int[n];

        for (int i = 0; i < n ; i++) {
            arr[i]= permutation[i];
        }
        System.out.println("Permutation: " + Arrays.toString(permutation));
        System.out.println("Array: " + Arrays.toString(arr));
    }
}