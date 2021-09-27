package com.kunal;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Please enter a number : ");
       int rollno = input.nextInt();
       System.out.println("Your number is " + rollno);
    
       System.out.print("Please enter a string : ");
       String name = input.next();
       System.out.println(name);

       System.out.print("Please enter a string sentence : ");
        
       input.nextLine();
       String sentence = input.nextLine();
       System.out.println(sentence);

       System.out.print("Please enter a float : ");
       float marks = input.nextFloat();
       System.out.println(marks);
    }
}
