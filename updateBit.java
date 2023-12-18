package com.example8;

//problem statement
// to update the bit in a number n input by the user at position p input by the user

import java.util.Scanner;

public class updateBit {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose bit you want to update : ");
        int number = sc.nextInt();

        System.out.println("Enter bit number from right/position/rank of bit from extreme right which you want to update : ");
        int bitPosition = sc.nextInt();

        //algorithm for updating bit

        //case 1 :
        // update bit to 0 : (same condition as that of clear)
        //step 1 : create int bitMask : 1<<bitPosition - 1
        //(left shift)
        //step 2 :  and of number with (not of bitMask)

        //case 2 :
        // update bit to 1 : (same condition as that of set)
        //step 1 : create int bitMask : 1<<bitPosition - 1
        //(left shift)
        //step 2 : or of number and bitMask

        System.out.println("Enter whether you want to update the bit to 0 or 1 (enter 0/1) : ");
        int operation = sc.nextInt();

        if (operation == 0){
            //same condition as that of clear
            int bitMask = 1<<bitPosition - 1;

            int newNumber = number & ~(bitMask);
            System.out.println("The new number with cleared bit is : "+newNumber);
        }

        else if (operation ==1){
            //same condition as that of set
            int bitMask = 1<<bitPosition - 1;   //indexing starts from 0 in java
            //standard procedure and formula for setBit operation
            //left shift number 1 by the value of position

            int newNumber = bitMask | number;   //procedure/algorithm to set bit in java
            // | is bitwise or
            // || is logical or

            System.out.println("The new number after performing the operation of set bit is : " + newNumber);

        }
    }
}
