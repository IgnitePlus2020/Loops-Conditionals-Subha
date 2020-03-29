package com.tgt.igniteplus;
import java.util.Scanner;
public class SimpleIf {

    public static void main(String[] args) {
    /* Problem statement: Ramu goes to Fun World with his family.There are certain age restrictions for some of the rides.
       Children below 8 years are not allowed. Please enter Ramu's age below to know if he's allowed to go on the ride or not.
       Sample testcase:
       Enter Ramu's age:
       10
       Please proceed to the ticket counter.
     */
        int age;
        System.out.println("Enter Ramu\'s age: ");
        Scanner in = new Scanner(System.in);
        age = in.nextInt();
        if(age<=8)
        {
            System.out.println(" Kids not allowed!");
            return;
        }
        System.out.println("Please proceed to the ticket counter.");
    }
}
