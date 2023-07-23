package org.example;

import java.util.Scanner;

/**
 * Exercise: https://www.youtube.com/watch?v=4taqT2a2h_M&list=PLEcJSEQK_cD4HTOlqV7xxMH0CYi29adgX&index=15
 * @author Farida Fatali
 */

// Finding horoscope sign by choosing the month and entering the day

public class HoroscopeFinder1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the number of the month: " +
                "\n1. January \n2. February \n3. March" +
                "\n4. April \n5. May \n6. June \n7. July" +
                "\n8. August \n9. September \n10. October" +
                "\n11. November \n12. December");
        int month = scanner.nextInt();


        String horoscope = "";

        if (month > 0 && month < 13){
            System.out.print("Enter the day: ");
            int day = scanner.nextInt();

            if ((month == 12 && day <= 31) || (month == 1 && day <= 21)) {
                horoscope = "Capricorn";
            } else if ((month == 1 && day <= 31) || (month == 2 && day <= 19)) {
                horoscope = "Aquarius";
            } else if ((month == 2 && day <= 29) || (month == 3 && day <= 20)) {
                horoscope = "Pisces";
            } else if ((month == 3 && day <= 31) || (month == 4 && day <= 20)) {
                horoscope = "Aries";
            } else if ((month == 4 && day <= 30) || (month == 5 && day <= 21)) {
                horoscope = "Taurus";
            } else if ((month == 5 && day <= 31) || (month == 6 && day <= 22)) {
                horoscope = "Gemini";
            } else if ((month == 6 && day <= 30) || (month == 7 && day <= 22)) {
                horoscope = "Cancer";
            } else if ((month == 7 && day <= 31) || (month == 8 && day <= 22)) {
                horoscope = "Leo";
            } else if ((month == 8 && day <= 31) || (month == 9 && day <= 22)) {
                horoscope = "Virgo";
            } else if ((month == 9 && day <= 30) || (month == 10 && day <= 22)) {
                horoscope = "Libra";
            } else if ((month == 10 && day <= 31) || (month == 11 && day <= 21)) {
                horoscope = "Scorpio";
            } else if ((month == 11 && day <= 30) || (month == 12 && day <= 21)) {
                horoscope = "Sagittarius";
            }
            System.out.println("The horoscope sign: " + horoscope);

        } else {
            System.out.println("Month you entered is wrong!");
        }
    }
}
