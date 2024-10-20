package com.pluralsight;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     // Menu and Greeting
         double Regular = 5.45;
         double Large = 8.95;


        System.out.println("Welcome to the Sandwhich Shop!\n" + "Please choose the size of the sandwhich you would like\n" + "Reg: $5.45\n" + "Lrg: $8.95");
          String size = scanner.nextLine();
        if (size.equalsIgnoreCase(("Reg")) || size.equalsIgnoreCase(("R"))) {
            System.out.println("Current Price: "+Regular);
        } else if (size.equalsIgnoreCase(("Lrg")) || size.equalsIgnoreCase(("L"))) {
            System.out.println("Current Price: "+Large);
        }


          // Next Section
        System.out.println("Would You like the Sandwich Loaded?\n" +"Yes/No");
          String option = scanner.nextLine();


          // If Customer Said Yes
        if (option.equalsIgnoreCase(("Yes")) || option.equalsIgnoreCase(("Y"))) {


            double loadRegular = 1.00;
            double loadLarge = 1.75;
            System.out.println("How would you like the Sandwich Loaded?");
            String loadOption = scanner.nextLine();
            if (loadOption.equalsIgnoreCase(("Regular")) || loadOption.equalsIgnoreCase(("R"))) {
                System.out.println("Current Price: " + (Regular + loadRegular));
            } else if (loadOption.equalsIgnoreCase(("Large")) || loadOption.equalsIgnoreCase(("L"))) {
                System.out.println("Current Price: " + (Large + loadLarge));
            }

            double totalSandwichLarge = Large + loadLarge;
        System.out.println("How Old Are You?");
           float customerAge = scanner.nextFloat();

          if (customerAge <= 17) {
              System.out.println(Large + loadLarge*0.9);
          } else {
              System.out.println(Large + loadLarge);
          }

          }

    }
}
// Make Greeting, Make if statements for large and regular sizes, calculations should be only addition