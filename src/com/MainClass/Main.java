package com.MainClass;

import com.BusReservation.*;
import com.Insurance.BookInsuranceAgent;
import com.Insurance.BronzeInsurance;
import com.Insurance.GoldInsurance;
import com.Insurance.SilverInsurance;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import static com.Database.BusData.bus;

public class Main {
    static Booking booking;
    static Login log ;
    private static Scanner in = new Scanner(System.in);

    public static final ArrayList<Booking> bookings = new ArrayList<>();

    public static void main(String[] args) {

        Login log ;
        System.out.println("********************************************************************************");
        System.out.println("\t\t\t\t\tWELCOME TO BUS RESERVATION SYSTEM ");
        System.out.println("********************************************************************************");
        while (true) {
            System.out.println();
            System.out.println("********************************************************************************");

            System.out.println("\t\t\t\t\t\t\t\tHOME PAGE  ");
            System.out.println("********************************************************************************");

            System.out.println("\t\t\t\t\t1. Go to Main Menu");
            System.out.println("\t\t\t\t\t2. Quit Application");

            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(in.nextLine().trim());
            if (choice != 1) {
                System.out.println();
                System.out.println("Thank you for using the application!!");
                break;
            } else {

                   log=new Login();
                System.out.println("Enter 1 for New User");
                System.out.println("Enter 2 for Existing User");

                int choice1 = Integer.parseInt(in.nextLine().trim());
                if (choice1 == 1) {

                    log.createLogin();

                } else {
                    if (!log.checklogin())

                        System.out.println("Pls Enter correct User and password");
                    else {
                        System.out.println("LOGGED IN SUCCESSFULLY ....");
                        System.out.println();
                        System.out.println();
                        ClassDisplay.MainMenuDisplay();
                        System.out.println("Pls Enter your choice");
                        int ch2 = Integer.parseInt(in.nextLine().trim());
                        switch (ch2) {
                            case 1:
                                ClassDisplay.busInfo();
                                break;
                            case 2:
                                String customerName, street, area, city, state, from, to, dateinput;
                                int doorNO, pinCode, customerID;

                                long customermobile;
                                System.out.println("Enter the CUSTOMER NAME ");
                                customerName = in.nextLine().trim();
                                System.out.println("Enter the CUSTOMERID ");
                                customerID = Integer.parseInt(in.nextLine().trim());
                                System.out.println("Enter the CUSTOMER MOBILE NUMBER");
                                customermobile = Long.parseLong(in.nextLine().trim());
                                System.out.println("Enter the Door Number");
                                doorNO = Integer.parseInt(in.nextLine().trim());
                                System.out.println("Enter the Street");
                                street = in.nextLine().trim();
                                System.out.println("Enter the Area");
                                area = in.nextLine().trim();
                                System.out.println("Enter the City");
                                city = in.nextLine().trim();
                                System.out.println("Enter the State");
                                state = in.nextLine().trim();
                                System.out.println("Enter the Pincode");
                                pinCode = Integer.parseInt(in.nextLine().trim());
                                Address address = new Address(doorNO, street, area, city, state, pinCode);
                                Customer customer = new Customer(customerName, customermobile, address);
                                System.out.println("Pls Enter your Bus Number from option below");
                                ClassDisplay.busInfo();
                                System.out.println("Enter the Bus Number");
                                int busNo = Integer.parseInt(in.nextLine().trim());
                                System.out.println("BUS SEATING INFORMATION");
                                DataProvider.seatInfoOfBus(busNo);
                                System.out.println("BUS SEATING INFORMATION");
                                System.out.println("Enter the SeatNo that you need to Book");
                                int seatNo = Integer.parseInt(in.nextLine().trim());
if(DataValidator.isAvailable(busNo))
{

}
                                /*System.out.println("Choose the Insurance policy that you are Interested");
                                String insurance;
                            {
                                System.out.println("\n1.Bronze-rs.100\n2.Silver-rs.150 \n3.Gold-rs.200\n4.Not Interested");
                                int ch3 = Integer.parseInt(in.nextLine().trim());

                                if (ch3 == 1) {
                                    BookInsuranceAgent a = new BookInsuranceAgent();
                                    a.setI(BronzeInsurance.getInstance());
                                    a.accidentCoverage();
                                    a.luggageCoverage();
                                    insurance = "BronzeInsurance";
                                } else if (ch3 == 2) {
                                    BookInsuranceAgent a = new BookInsuranceAgent();
                                    a.setI(SilverInsurance.getInstance());
                                    a.accidentCoverage();
                                    a.luggageCoverage();
                                    insurance = "SilverInsurance";
                                } else if (ch3 == 3) {
                                    BookInsuranceAgent a = new BookInsuranceAgent();
                                    a.setI(GoldInsurance.getInstance());
                                    a.accidentCoverage();
                                    a.luggageCoverage();
                                    insurance = "GoldInsurance";

                                } else
                                    insurance = "Not Interested";
                            } */

                               /* Address address = new Address(122, "dsf", "asdf", "adf", "edfds", 7647);
                                Customer customer = new Customer("Arun",  83746, address);
                                booking = new Booking("Bronze", customer, 1, 1); */

for(Bus b:bus)
    if(b.getBusNo()==2)
    {
        b.seatDisplay();
    }
}
                            {
if(DataValidator.isAvailable(2))
{   for(Bus b:bus)
{
    if(b.getBusNo()==2)
    {b.bookSeat(10,10);
        System.out.println(b.getSeatMap());

    }
}
    bookings.add(booking);
    System.out.println("Thanks "+booking.getCustomer().getCustomerName()+"  your Booking is Confirmed ! Thanks for choosing Our service");
    System.out.println("ReservationID :  "+booking.generateReservationID());
    booking.getReserve().put(booking.generateReservationID(), booking);
    System.out.println("Pls Note Down your ReservationID ,it will Useful While Cancellation of Ticket ");
    System.out.println(bookings);


}
                                for(Bus b:bus)
                                {
                                    if(b.getBusNo()==2)
                                    {
                                        b.seatDisplay();
                                    }
                                }




                        }
                    }
                }
            }
        }


    }
}




