package LOOPS;

import java.util.Arrays;
import java.util.Scanner;
public class WhileLoops {

    public static void main(String[] args) {
printFactorial( n:5 );// za 0
printFactorial (n:7); //za 1


        System.out.println("Enter positive number: ");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        printFactorial(userNumber);
    }

    public static void printFactorial(int n) {
        //variables - da sa positive
        int factorial = 1;
        int i = 1;

        while (i<=n){
            factorial *=i; // factorial = factorial +i;
            i++;
        }
        System.out.printf("You have entered: %d . The factoriel is: %d.\n",  n, factorial);

    }


}
