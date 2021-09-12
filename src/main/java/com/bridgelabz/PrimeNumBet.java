package com.bridgelabz;

public class PrimeNumBet {
    public static void main(String[] args) {

        // Declare the variables
        int a = 0, b = 1000;
        primeNumbersBetween(a, b);

    }

    private static void primeNumbersBetween(int a, int b) {
        int i, j, flag;


        // Print display message
        System.out.println(" Prime numbers between and are  " );

        // Traverse each number in the interval
        // with the help of for loop
        for (i = a; i <= b; i++) {

            // Skip 0 and 1 as they are
            // neither prime nor composite
            if (i == 1 || i == 0)
                continue;

            // flag variable to tell
            // if i is prime or not
            flag = 1;

            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1)
                System.out.print(i + ", ");

        }

    }
}
