package com.BusReservation;

import java.util.ArrayList;
import java.util.HashMap;

public class Driver {
    private String name;
    private int driverID;
    private long phoneNo;
    static final ArrayList<Driver> drivers=new ArrayList<>();


    public Driver(String name, int driverID, long phoneNo) {
        this.name = name;
        this.driverID = driverID;
        this.phoneNo = phoneNo;
    }
   static {
       drivers.add(new Driver("gopal", 1211, 9874745764L));
       drivers.add(new Driver("sharan",1244,9940787348L));
       drivers.add(new Driver("balaji",1288,9887987987L));
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDriverID() {
        return driverID;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }
}
