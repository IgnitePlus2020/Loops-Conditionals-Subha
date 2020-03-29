package com.tgt.igniteplus;
import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
        /* Problem statement: George is an obedient boy. If he wants to play, he asks his mom's permission.
         He goes to play only if she allows. On the other hand, if he's not in a mood to play then even if
         his mother gives permission, he won't play. Find whether he goes out to play or not.
         Sample testcase:
            George wants to play or not?(y/n) :
            y
            Did George's mom allow him to play?(y/n) :
            n
            George won't play
         */
        char ch1,ch2;
        System.out.println("George wants to play or not?(y/n) : ");
        Scanner in = new Scanner(System.in);
        ch1 = in.nextLine().charAt(0);
        if(ch1=='n')
            System.out.println("George won't play");
        else
        {
            System.out.println("Did George\'s mom allow him to play?(y/n) :");
            ch2 = in.nextLine().charAt(0);
            if(ch2=='y')
                System.out.println("George goes out to play");
            else
                System.out.println("George won't play");
        }

    }
}
