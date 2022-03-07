package com.BusReservation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class Booking {
HashMap<Integer,Booking> reserve=new HashMap<>();
    private final String insuranceType;
    private final Customer customer;
    public final int busno;
    public  static int reservationID=1000; ;
    private boolean[] seat;
    private final int seatNo;

    public Booking(String insuranceType, Customer customer, int busno, int seatNo) {
        this.insuranceType = insuranceType;
        this.customer = customer;
        this.busno = busno;
        this.seatNo = seatNo;

    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getBusno() {
        return busno;
    }

    public static int getReservationID() {
        return reservationID;
    }


    public int generateReservationID()
    {
        return reservationID++;

    }

    public HashMap<Integer, Booking> getReserve() {
        return reserve;
    }
/*  public void checkAvailability(int busNo) {
        int capacity = 0;
        for (Bus b : bus) {
            if (busNo == b.getBusNo()) {
                capacity = b.getCapacity();
            }
        }
            for (Booking B : bookings) {


                if (B.busno == busNo && B.travelDate.equals(date)) ;
            {

                booked++;

            }
        }
        System.out.println(booked<capacity);
        //return booked<capacity;
    }
    */

    @Override
    public String toString() {
        return "Booking{" +
                "insuranceType='" + insuranceType + '\'' +
                ", customer=" + customer +
                ", busno=" + busno +
                ", seat=" + Arrays.toString(seat) +
                ", seatNo=" + seatNo +
                '}';
    }
}