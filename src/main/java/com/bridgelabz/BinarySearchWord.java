package com.bridgelabz;

import java.util.Arrays;

public class BinarySearchWord {
    public static void main(String[] args) {
        String[] arr = {"Rajendra", "Sushant", "Megha", "Raghul", "Manu"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        String x = "Sushant";
        int result = binarySearch(arr, x);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }

    static int binarySearch(String[] arr, String x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int res = x.compareTo(arr[m]);
            if (res == 0)
                return m;
            if (res > 0)
                l = m + 1;
            else
                r = m - 1;
        }

        return -1;
    }
}
