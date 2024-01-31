package hw1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //this will print the text in the console
        System.out.println(2+5);
        System.out.println("12+89");

        //Scanner class build in method + read from console
        System.out.println("Please enter your name:");
        Scanner scanner= new Scanner(System.in);

        //defined variable to store the user input
        String name = scanner.nextLine();
        //print final message
        System.out.println("Hello " +name+ ". abc");


    }

}
