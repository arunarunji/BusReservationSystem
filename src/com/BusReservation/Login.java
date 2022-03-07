package com.BusReservation;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Login {
    private String userName;
    private String password;
    private String repassword;

    public static HashMap<String, String> login = new HashMap<String, String>() {{
        put("admin", "admin");
        put("arun", "arun");
    }};

    private static Scanner in = new Scanner(System.in);


    public boolean checklogin() {
        System.out.println("Enter the User Name:");
        this.userName = in.nextLine().trim();
        System.out.println("Enter the Password");
        this.password = in.nextLine().trim();
        if (login.containsKey(userName))
            return Objects.equals(login.get(userName), password);
        return false;
    }

    public void createLogin() {
        TryAgain:
        while (true) {
            System.out.println("Enter the User Name:");
            this.userName = in.nextLine().trim();
            System.out.println("Enter a password with following criteria" +
                    "\n\t*Should contain atleast 8 letters" +
                    "\n\t*Should contain atleast one Special character" +
                    "\n\t*Should contain atleast one Capital letter" +
                    "\n\t*Should contain atleast one Numeric");

            System.out.println("Enter the Password");
            this.password = in.nextLine().trim();
            System.out.print("Re-Enter new password: ");
            this.repassword = in.nextLine().trim();
            if (password.equals(repassword)) {
                if (DataValidator.checkSymbol(password) && DataValidator.checkNumeric(password) && DataValidator.checkCapital(password) &&
                        DataValidator.checkLength(password)) {
                    login.put(userName, password);
                    System.out.println("you have successfully created the login  ");
break;
                } else {
                    System.out.println("Please enter the password with following criteria\n");
                    continue TryAgain;
                }
            } else {
                System.out.println("New passwords mismatched. Please try again\n");
                continue TryAgain;
            }

        }
    }

    }

