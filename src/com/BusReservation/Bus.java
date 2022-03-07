package com.BusReservation;

import java.util.Arrays;
import java.util.HashMap;

public class Bus  extends Vechile {
    HashMap<Integer, Object> seatMap = new HashMap<>();
   private final int busNo;
   private final boolean aCorNONAC;
   private final int capacity;

    public HashMap<Integer, Object> getSeatMap() {
        return seatMap;
    }

    private final Trip trip;
    private boolean[] seat;
    private int booked;
    private int seatNo;

    public Bus(String insuranceDate, int coverage, String fcStatus, int maxSpeed, int busNo, boolean aCorNONAC, int capacity, Trip trip) {
        super(insuranceDate, coverage, fcStatus, maxSpeed);
        this.busNo = busNo;
        this.aCorNONAC = aCorNONAC;
        this.capacity = capacity;
        this.trip = trip;

seat=new boolean[capacity];
    }








    //getter and setters
    public boolean[] getSeat() {
        return seat;
    }

    public void setSeat(boolean[] seat) {
        this.seat = seat;
    }

    public int getBooked() {
        return booked;
    }

    public void setBooked(int booked) {
        this.booked = booked;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }


    //Methods and Functionality

    public Boolean isSeatAvailable(int seatNo) {

        return seat[seatNo - 1];

    }

    public void bookSeat(int seatNo,Customer customer) {

        if (!isSeatAvailable(seatNo)) {
            seat[seatNo - 1] = true;
            booked++;
             seatMap.put(seatNo,customer);
        } else
            System.out.println("Seat are not available, pls Try with available Seating Position ");

    }
    public void bookSeat(int seatNo1,int seatNo2 )
    {
        if (!isSeatAvailable(seatNo1) &&!isSeatAvailable(seatNo2)){
            seat[seatNo1-1] = true;
            seat[seatNo2-1]=true;
            booked+=2;
        } else
            System.out.println("Seat are not available, pls Try with available Seating Position ");

    }
    public void bookSeat(int seatNo1,int seatNo2,int seatNo3 )
    {
        if (!isSeatAvailable(seatNo1) &&!isSeatAvailable(seatNo2)&&!isSeatAvailable(seatNo3)){
            seat[seatNo1-1] = true;
            seat[seatNo2-1]=true;
            seat[seatNo3-1]=true;
            booked+=3;
        } else
            System.out.println("Seat are not available, pls Try with available Seating Position ");

    }


    public void cancelSeat(int seatNo)
    {
        seat[seatNo-1]=false;
        booked--;

    }
    public void cancelSeat(int seatNo1,int seatNo2)
    {
        seat[seatNo1-1] = false;
        seat[seatNo2-1]=false;
        booked-=2;
    }
    public void cancelSeat(int seatNo1,int seatNo2,int seatNo3)
    {
        seat[seatNo1-1] = false;
        seat[seatNo2-1]=false;
        seat[seatNo3-1]=false;
        booked-=3;

    }

    public int getBusNo() {
        return busNo;
    }

    public boolean isaCorNONAC() {
        return aCorNONAC;
    }

    public int getCapacity() {
        return capacity;
    }

    public Trip getTrip() {
        return trip;
    }

    public void seatDisplay()
    {


        for(int i=0;i<seat.length;i++) {
            int val=i;
            if (i % 5 == 0)
                System.out.println();
            if (!seat[i])

                System.out.printf( ++val + ".Vacant  ");
            else
                System.out.printf( ++val +".RESERVED   ");

        }
    }

   /* public static void main(String[] args) {
        Seat seat=new Seat(20);


        seat.bookSeat(9,20,8);
        seat.seatDisplay();
        System.out.println(seat.booked);
        seat.cancelSeat(15);
        seat.seatDisplay();
        System.out.println(seat.booked);


    } */





 /*  public static void displayseat(int busNo) {
      for (Bus b : bus) {
         if (busNo == b.getBusNo()) {
            for (int i = 0; i < 8; i++) {
               for (int j = 0; j < 5; j++) {
                  System.out.print("* ");
               }
               System.out.println(" ");
            }
         }
      }
   } */


    @Override
    public String toString() {
        return "Bus{" +
                "seatMap=" + seatMap +
                ", busNo=" + busNo +
                ", aCorNONAC=" + aCorNONAC +
                ", capacity=" + capacity +
                ", trip=" + trip +
                ", seat=" + Arrays.toString(seat) +
                ", booked=" + booked +
                ", seatNo=" + seatNo +
                '}';
    }
}

