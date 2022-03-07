package com.BusReservation;

import java.util.Scanner;

import static com.Database.BusData.bus;
import static com.MainClass.Main.bookings;

public class ClassDisplay {
    private static Scanner in = new Scanner(System.in);

public static void MainMenuDisplay()
{
    System.out.println("*********************************** MAIN MENU **************************************");
    System.out.println("\t\t\t\t\t1. BUS LIST\n");
    System.out.println("\t\t\t\t\t2. BOOK TICKETS\n");
    System.out.println("\t\t\t\t\t3. CANCEL BOOKING\n");
    System.out.println("\t\t\t\t\t4. BOOKING HISTORY\n");
    System.out.println("\t\t\t\t\t5. BOOK SEATS INFO\n");
    System.out.println("\t\t\t\t\t6. EXIT\n");
}
    public static void busInfo() {
        System.out.println("*********************************** BUS LIST **************************************");
        System.out.println();
        System.out.println();
        System.out.println("*******************************************************************************************************************");
        System.out.println("BusNo             BusName                           Destination                Arrival time           Depature time");
        System.out.println("*******************************************************************************************************************");
        for (Bus b : bus) {
            System.out.println(b.getBusNo() + "                   " + b.getTrip().getBusagencyName() + "                   " + b.getTrip().getBusDestination()
                    + "                   "+ b.getTrip().getArrivaltime() + "                   " + b.getTrip().getDepatureTime());
        }
        System.out.println("*******************************************************************************************************************");

    }
   /* public static  void CancelBooking()
    {
        System.out.println("Are you Sure Want to Cancel the Booking \n Enter 1 to CONFIRM YOUR CANCELLATION  \n Enter 2 to EXIT FROM CANCELLATION");
        int choice=Integer.parseInt(in.nextLine().trim());
        if(choice==3)
        {
            System.out.println("Enter the Booking ID");
            for(Booking b:bookings)
            {
                if(b.getBookingID)
            }
        }

    }*/



}
