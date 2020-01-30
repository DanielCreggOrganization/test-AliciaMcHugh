package ie.gmit.scannerpack;

import java.util.Scanner;

public class ScanFlow {
    public static void main(String[] args) {

    }//end main

    void birthMonthFinder(){
               Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter the number of the month you were born. (e.g May)");
        int birthMonth = userInput.nextInt();

        userInput.close();

        if (birthMonth == 1) {
            System.out.println("You were born in January");

        } else if (birthMonth == 2) {
            System.out.println("You were born in February");

         } else if (birthMonth == 3) {
            System.out.println("You were born in March");

        } else {
            System.out.println("Invalid input please enter number between 1 and 12");

        }
    }
}

//end class