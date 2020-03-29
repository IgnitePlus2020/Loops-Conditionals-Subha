package com.tgt.igniteplus;
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
    /* Problem statement: Leena works in a company. Whenever she goes for shopping in the month end, she shops for atleast Rs.500.
       If she's not left with a minimum of Rs.500 after her monthly expenditure then she saves that amount. Please enter Leena's monthly income and
       her monthly expenditure to decide if she goes for shopping or she saves some amount.
       Sample testcase:
        Enter Leena's monthly income:
        1000
        Enter Leena's monthly expenditure:
        700
        Leena saves Rs.300.0
     */
        float salary,expense,savings;
        System.out.println("Enter Leena\'s monthly income: ");
        Scanner in = new Scanner(System.in);
        salary = in.nextFloat();
        System.out.println("Enter Leena\'s monthly expenditure: ");
        expense = in.nextFloat();
        savings=salary-expense;
        if(savings>=500)
        {
            System.out.println("Leena goes for shopping.");
        }
        else
        {
            System.out.println("Leena saves Rs."+savings);
        }
    }
}
