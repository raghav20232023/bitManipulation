package com.example8;

//problem statement
// to clear the bit in a number n input by the user at position p input by the user

import java.util.Scanner;

public class clearBit {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose bit you want to clear : ");
        int number = sc.nextInt();

        System.out.println("Enter bit number from right/position/rank of bit from extreme right which you want to clear : ");
        int bitPosition = sc.nextInt();

        //algorithm for clearing bit

        //step 1:
        //create int bitMask : 1<<position
        //take not of bitMask
        //logical not : !
        //bitwise not : ~

        //step 2:
        //take and with (not of bitMask) to get newNumber with cleared bit

        int bitMask = 1<<bitPosition - 1;

        int newNumber = number & ~(bitMask);
        System.out.println("The new number with cleared bit is : "+newNumber);

    }
}
