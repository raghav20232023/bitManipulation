package com.example8;

//problem statement
//to get the bit in a number n input by the user at position p input by the user

import java.util.Scanner;

public class getBit {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose bit you want to get : ");
        int number = sc.nextInt();

        System.out.println("Enter the position at which you want to get the bit : ");
        int bitPosition = sc.nextInt();

        int bitMask = 1<<bitPosition-1; //indexing starts from 0 in java
        //standard procedure and formula for getBit operation
        //left shift number 1 by the value of position

        if ((bitMask & number) == 0){   //& is bitwise and operator
            System.out.println("the bit at chosen position was 0");

        }
        else {
            System.out.println("the bit at chosen position was 1");
        }

        //how does it work
        //1 in binary contains arbitrary number of zeroes before 1
        //1 is shifted left by specified position,
        //as bitwise ranking or indexing starts from the extreme right hand side
        //if bitmask & 1 = 0 then this means that the bit was 0
        //else the bit was 1
    }

}
