package com.tgt.igniteplus;
import java.util.*;
public class Switch {
    public static void main(String[] args) {
        /* Problem statement:
           Ram is playing Snake and Ladder with his friends. If 3 or 5 shows up when he rolls the die, he wins. Otherwise
           he loses the game.
           Sample testcase:
            Enter y to roll the die for Ram:
            y
            Number shown is 4
            Ram lost the game!
         */
        char ch;
        int number;
        System.out.println("Enter y to roll the die for Ram: ");
        Scanner in = new Scanner(System.in);
        ch = in.nextLine().charAt(0);
        if(ch!='y')
            return;

        Random rand=new Random();
        number=(rand.nextInt(6))+1;//rand.nextInt(6) generates any number from 0 to 5
        System.out.println("Number shown is "+number);
        switch(number)
        {
            case 3:
            case 5: System.out.println("Ram wins!");
                    break;
            case 1:
            case 2:
            case 4:
            case 6:System.out.println("Ram lost the game!");
                   break;
        }




    }

}
