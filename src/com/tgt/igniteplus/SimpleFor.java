package com.tgt.igniteplus;
import java.util.Scanner;
public class SimpleFor {
    public static void main(String[] args) {
        /* Problem statement: Given a number N. Print all the even numbers from 0 to N.
         Sample testcase:
            Enter a number:
            7
            Even numbers till 7 :
            0 2 4 6
         */
        int N,i;
        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        System.out.println("Even numbers till "+N+" : ");
        for(i=0;i<=N;i+=2)
            System.out.print(i+" ");

    }
}
