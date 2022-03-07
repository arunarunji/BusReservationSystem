package com.BusReservation;

import static com.Database.BusData.bus;


public class DataValidator {
    public static boolean checkLength(String password) {
        if (password.length() < 8)
            return false;
        return true;
    }

    public static boolean checkSymbol(String password) {
        int symbolCount = 0;
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i))
                    && !Character.isWhitespace(password.charAt(i))) {
                symbolCount++;
            }
        }
        if (symbolCount > 0)
            return true;
        return false;
    }

    public static boolean checkNumeric(String password) {
        int numberCount = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                numberCount++;
            }
        }

        if (numberCount > 0)
            return true;
        return false;
    }

    public static boolean checkCapital(String password) {
        int capitalCount = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                capitalCount++;
            }
        }

        if (capitalCount > 0)
            return true;
        return false;
    }

    public static boolean isAvailable(int busNo) {
        int capacity = 0;
        int booked = 0;
        for (Bus b : bus) {

            if (b.getBusNo() == busNo) {

                capacity = b.getCapacity();
                booked=b.getBooked();

            }
        }
return booked<capacity;
    }

}