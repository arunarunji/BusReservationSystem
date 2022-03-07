package com.Insurance;

public class BronzeInsurance implements Insurance {
    private final int accidentCoverage=100000;
    private final int luggageCoverage=0;
    static BronzeInsurance bi = new BronzeInsurance();

    private BronzeInsurance() {

    }

    public static BronzeInsurance getInstance() {
        return bi;
    }

    @Override
    public int accidentCoverage() {
        return accidentCoverage;
    }

    @Override
    public int luggageCoverage() {
        return luggageCoverage;
    }
}
