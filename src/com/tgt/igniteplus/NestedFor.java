package com.tgt.igniteplus;
import java.util.Scanner;
public class NestedFor {
    public static void main(String[] args) {
        /* Problem statement: Given a number N. Print an identity matrix of order N(size= N*N).
            Sample testcase:
            Enter a number:
            3
            Identity matrix of order 3 :
            1 0 0
            0 1 0
            0 0 1
         */
        int N,i,j;
        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        System.out.println("Identity matrix of order "+N+" : ");
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                if(i==j)
                    System.out.print(1+" ");
                else
                    System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}
