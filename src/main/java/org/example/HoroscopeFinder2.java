package org.example;

import java.util.Scanner;

// Finding horoscope sign by entering the month as String and the day as int (not very good version)

public class HoroscopeFinder2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month: ");
        String month = scanner.next();

        System.out.print("Enter the day: ");
        int day = scanner.nextInt();

        String horoscope = "";


        if ((month.equalsIgnoreCase("December") && day <= 31)
                || (month.equalsIgnoreCase("January") && day <= 21)) {
            horoscope = "Capricorn";
        } else if ((month.equalsIgnoreCase("January") && day <= 31)
                || (month.equalsIgnoreCase("February") && day <= 19)) {
            horoscope = "Aquarius";
        } else if ((month.equalsIgnoreCase("February") && day <= 29)
                || (month.equalsIgnoreCase("March") && day <= 20)) {
            horoscope = "Pisces";
        } else if ((month.equalsIgnoreCase("March") && day <= 31)
                || (month.equalsIgnoreCase("April") && day <= 20)) {
            horoscope = "Aries";
        } else if ((month.equalsIgnoreCase("April") && day <= 30)
                || (month.equalsIgnoreCase("May") && day <= 21)) {
            horoscope = "Taurus";
        } else if ((month.equalsIgnoreCase("May") && day <= 31)
                || (month.equalsIgnoreCase("June") && day <= 22)) {
            horoscope = "Gemini";
        } else if ((month.equalsIgnoreCase("June") && day <= 30)
                || (month.equalsIgnoreCase("July") && day <= 22)) {
            horoscope = "Cancer";
        } else if ((month.equalsIgnoreCase("July") && day <= 31)
                || (month.equalsIgnoreCase("August") && day <= 22)) {
            horoscope = "Leo";
        } else if ((month.equalsIgnoreCase("August") && day <= 31)
                || (month.equalsIgnoreCase("September") && day <= 22)) {
            horoscope = "Virgo";
        } else if ((month.equalsIgnoreCase("September") && day <= 30)
                || (month.equalsIgnoreCase("October") && day <= 22)) {
            horoscope = "Libra";
        } else if ((month.equalsIgnoreCase("October") && day <= 31)
                || (month.equalsIgnoreCase("November") && day <= 21)) {
            horoscope = "Scorpio";
        } else if ((month.equalsIgnoreCase("November") && day <= 30)
                || (month.equalsIgnoreCase("December") && day <= 21)) {
            horoscope = "Sagittarius";
        } System.out.println("The horoscope sign: " + horoscope);


    }
}
