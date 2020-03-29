package com.tgt.igniteplus;
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        /* Problem statement: Asha goes out to play with her friends at 5pm everyday. But she returns home immediately
        when her mom informs her that her father has returned home. Since her mom is busy today, please inform Asha if her
        father returned home or not.
         Sample testcase:
            Asha goes out to play with her friends.
            Asha continues to play.
            Did her father return home?(y/n) :
            n
            Asha continues to play.
            Did her father return home?(y/n) :
            y
            Asha returns home.
         */
        char ch1;
        System.out.println("Asha goes out to play with her friends. ");
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Asha continues to play. ");
            System.out.println("Did her father return home?(y/n) : ");
            ch1 = in.nextLine().charAt(0);
        }while(ch1!='y');
        System.out.println("Asha returns home.");

    }
}
