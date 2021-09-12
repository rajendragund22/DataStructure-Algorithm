package com.bridgelabz;

public class InsersionSortString {

    public static String[] sort(String array[], int length) {
        String temp = " ";
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i].compareToIgnoreCase(array[j]) > 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] arr = { "one", "two", "three", "four", "five", "six", "seven", "eight" };
        String sortedArray[] = sort(arr, arr.length);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }
    }

}