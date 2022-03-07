package com.BusReservation;

public class Trip {
    private final String arrivalTime;
    private final String depatureTime;
    private final String busagencyName;
    private final String busDestination;
    private final int cost;

    public Trip(String arrivaltime, String depaturetime, String busagencyName, String busDestination, int cost) {
        this.arrivalTime = arrivaltime;
        this.depatureTime = depaturetime;
        this.busagencyName = busagencyName;
        this.busDestination = busDestination;
        this.cost = cost;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public int getCost() {
        return cost;
    }

    public String getArrivaltime() {
        return arrivalTime;
    }

    public String getDepatureTime() {
        return depatureTime;
    }

    public String getBusagencyName() {
        return busagencyName;
    }

    public String getBusDestination() {
        return busDestination;
    }


}
