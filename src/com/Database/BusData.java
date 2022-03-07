package com.Database;

import com.BusReservation.Bus;
import com.BusReservation.Trip;

import java.util.ArrayList;

public class BusData {
static public   ArrayList<Bus> bus =new ArrayList<>();

static {
    bus.add(new Bus("12-07-2022", 200000, "live", 80, 1,true, 1, new Trip("9.00AM","10.00PM","SRM agency","chennai-Pondy", 200)));
    bus.add(new Bus("12-07-2022", 200000, "live", 80, 2, true,  20 , new Trip("10.00AM","12.00PM","PPM agency","chennai-Salem", 300)));
    bus.add(new Bus("12-07-2022", 200000, "live", 80, 3, true, 20,  new Trip("  3.00AM","10.00PM","SRM agency","Salem-Pondy", 500)));


}
}
