package com.example8;

//problem statement
//to set the bit in a number n input by the user at position p input by the user

import java.util.Scanner;

public class setBit {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose bit you want to set : ");
        int number = sc.nextInt();

        System.out.println("Enter bit number from right/position/rank of bit from extreme right which you want to set : ");
        int bitPosition = sc.nextInt();

        int bitMask = 1<<bitPosition - 1;   //indexing starts from 0 in java
        //standard procedure and formula for setBit operation
        //left shift number 1 by the value of position

        int newNumber = bitMask | number;   //procedure/algorithm to set bit in java
        // | is bitwise or
        // || is logical or

        System.out.println("The new number after performing the operation of set bit is : " + newNumber);

    }
}
