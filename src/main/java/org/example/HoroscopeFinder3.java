package org.example;

import java.util.Scanner;

// Finding horoscope sign by entering the month and the day as int

public class HoroscopeFinder3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int month = scanner.nextInt();

        System.out.print("Enter the day: ");
        int day = scanner.nextInt();

        String horoscope = "";
        String errorMessage = "You entered wrong information!";
        boolean isError = false;

        switch (month){
            case 1:
                if(day >= 1 && day <= 31) {
                    if (day <= 21) {
                        horoscope = "Capricorn";
                    } else {
                        horoscope = "Aquarius";
                    }
                } else {
                    isError = true;
                }
                break;
            case 2:
                if(day >= 1 && day <= 29) {
                    if (day <= 19) {
                        horoscope = "Aquarius";
                    } else {
                        horoscope = "Pisces";
                    }
                } else {
                    isError = true;
                }
                break;
            case 3:
                if(day >= 1 && day <= 31) {
                    if (day <= 20) {
                        horoscope = "Pisces";
                    } else {
                        horoscope = "Aries";
                    }
                } else {
                    isError = true;
                }
                break;
            case 4:
                if(day >= 1 && day <= 30) {
                    if (day <= 20) {
                        horoscope = "Aries";
                    } else {
                        horoscope = "Taurus";
                    }
                } else {
                    isError = true;
                }
                break;
            case 5:
                if(day >= 1 && day <= 31) {
                    if (day <= 21) {
                        horoscope = "Taurus";
                    } else {
                        horoscope = "Gemini";
                    }
                } else {
                    isError = true;
                }
                break;
            case 6:
                if(day >= 1 && day <= 30) {
                    if (day <= 22) {
                        horoscope = "Gemini";
                    } else {
                        horoscope = "Cancer";
                    }
                } else {
                    isError = true;
                }
                break;
            case 7:
                if(day >= 1 && day <= 31) {
                    if (day <= 22) {
                        horoscope = "Cancer";
                    } else {
                        horoscope = "Leo";
                    }
                } else {
                    isError = true;
                }
                break;
            case 8:
                if(day >= 1 && day <= 31) {
                    if (day <= 20) {
                        horoscope = "Leo";
                    } else {
                        horoscope = "Virgo";
                    }
                } else {
                    isError = true;
                }
                break;
            case 9:
                if(day >= 1 && day <= 30) {
                    if (day <= 22) {
                        horoscope = "Virgo";
                    } else {
                        horoscope = "Libra";
                    }
                } else {
                    isError = true;
                }
                break;
            case 10:
                if(day >= 1 && day <= 31) {
                    if (day <= 22) {
                        horoscope = "Libra";
                    } else {
                        horoscope = "Scorpio";
                    }
                } else {
                    isError = true;
                }
                break;
            case 11:
                if(day >= 1 && day <= 30) {
                    if (day <= 21) {
                        horoscope = "Scorpio";
                    } else {
                        horoscope = "Sagittarius";
                    }
                } else {
                    isError = true;
                }
                break;
            case 12:
                if(day >= 1 && day <= 31) {
                    if (day <= 21) {
                        horoscope = "Sagittarius";
                    } else {
                        horoscope = "Capricorn";
                    }
                } else {
                    isError = true;
                }
                break;
            default:
                isError = true;
        }

        if(isError){
            System.out.println(errorMessage);
        } else {
            System.out.println("Your Horoscope Sign: " + horoscope);
        }

    }
}
