package HWL1Java;

import java.util.Scanner;

public class NameHoby {

    public static void main(String[] args) {
        //ask for name
        System.out.println("Въведете своето име:");
        Scanner scanner= new Scanner(System.in);
        String name = scanner.nextLine();
//Ask for hoby
        System.out.println("Какво е Вашето хоби:");
        Scanner scanner1= new Scanner(System.in);
        String hoby = scanner1.nextLine();

        //print final message
        System.out.println("здравей " +name+ " с хоби " + hoby+ ". ..");

    }
}
