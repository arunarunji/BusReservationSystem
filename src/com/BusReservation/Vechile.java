package com.BusReservation;

 abstract public class Vechile {
    private final  String insuranceDate;
    private final  int coverage;
    private  final String fcStatus;
    private  final int maxSpeed;

    public Vechile(String insuranceDate, int coverage, String fcStatus, int maxSpeed) {
        this.insuranceDate = insuranceDate;
        this.coverage = coverage;
        this.fcStatus = fcStatus;
        this.maxSpeed = maxSpeed;
    }

     public String getInsuranceDate() {
         return insuranceDate;
     }

     public int getCoverage() {
         return coverage;
     }

     public String getFcStatus() {
         return fcStatus;
     }

     public int getMaxSpeed() {
         return maxSpeed;
     }
 }
