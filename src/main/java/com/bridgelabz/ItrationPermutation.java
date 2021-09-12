package com.bridgelabz;

import java.util.Scanner;

public class ItrationPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string which you want to find the permutation:");
        String string = sc.nextLine();
        ItrationPermutation.permutationOfStringIterative(string);
        sc.close();
    }


    public static void permutationOfStringIterative(String string) {
        int k = string.length();
        int[] p = new int[k];
        int i;
        for (i = 0; i < k; i++) {
            p[i] = 0;
        }
        System.out.print(string);
        i = 1;
        int j = 0;
        while (i < k) {
            if (p[i] < i) {
                j = (i % 2) * p[i];
                StringBuilder strB = new StringBuilder(string);
                char l = strB.charAt(i), r = strB.charAt(j);
                strB.setCharAt(i, r);
                strB.setCharAt(j, l);
                System.out.print(" " + strB);
                p[i]++;
                i = 1;
            } else {
                p[i] = 0;
                i++;
            }
        }
    }

}

