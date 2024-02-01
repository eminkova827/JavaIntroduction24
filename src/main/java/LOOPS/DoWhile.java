package LOOPS;

import java.util.Arrays;

public class DoWhile {

    public static void main(String[] args) {
        printPositiveNumbersToN( n=5);
        System.out.println("--------------------");

    }

    public static void printPositiveNumbersToN(int n){
        int start = 0;
        do {
            System.out.println("n = " + start);
            start++;
        } while (start <= n);
        }


    }


