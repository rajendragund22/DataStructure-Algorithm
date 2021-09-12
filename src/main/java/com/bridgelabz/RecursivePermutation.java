package com.bridgelabz;

import java.util.Scanner;

public class RecursivePermutation {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string which you want to find permutation");
        String string=sc.nextLine();
        int number;
        number=string.length();
        RecursivePermutation.permutationOfStringRecursive(string,0,number-1);

        sc.close();
    }


    public static void permutationOfStringRecursive(String string,int lower,int higher)
    {
        StringBuilder strB = new StringBuilder(string);
        int j;
        if(lower==higher)
        {
            System.out.print(strB+" ");
        }
        else
        {
            for(j=lower;j<=higher;j++)
            {
                char l = strB.charAt(lower) , r = strB.charAt(j);
                strB.setCharAt(lower,r);
                strB.setCharAt(j,l);
                String newval=strB.toString();
                permutationOfStringRecursive(newval,lower+1,higher);
                l = strB.charAt(lower) ; r = strB.charAt(j);
                strB.setCharAt(lower,r);
                strB.setCharAt(j,l);
            }
        }
    }


}
