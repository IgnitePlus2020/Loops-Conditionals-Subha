package com.tgt.igniteplus;
import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        /* Problem statement:
           Given a number N. Check if N is divisible by 3 or not.
           Sample testcase:
           Enter a number:
           11
           It is not divisible by 3
         */
        int N,i,sum=0,digit;
        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        while(N!=0)
        {   digit=N%10;
            sum+=digit;
            N/=10;
        }
        if(sum%3==0)
            System.out.println("It is divisible by 3");
        else
            System.out.println("It is not divisible by 3");

    }
}
