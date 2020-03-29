package com.tgt.igniteplus;
import java.util.Scanner;
public class IfElseIf {
    public static void main(String[] args) {
         /* Problem statement: Suresh wrote Unit test-1 last month. He is waiting for his results.
          The unit test comprised of 4 questions each of 10 marks.
          Grades are assigned based on the marks obtained as follows:
          31-40 marks ->A grade
          21-30 marks ->B grade
          11-20 marks ->C grade
          01-10 marks ->D grade
          Please enter Suresh's marks to know his grade.
          Sample testcase:
            Enter Suresh's marks:
            23
            B grade

          */
        float marks;
        System.out.println("Enter Suresh\'s marks: ");
        Scanner in = new Scanner(System.in);
        marks = in.nextFloat();
        char grade;
        if(marks>30)
            grade='A';
        else if(marks>20)
            grade='B';
        else if(marks>10)
            grade='C';
        else
            grade='D';
        System.out.println(grade+" grade");


    }
}
