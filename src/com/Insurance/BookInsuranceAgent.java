package com.Insurance;

public class BookInsuranceAgent {
    Insurance i;

    public void setI(Insurance i) {
        this.i = i;
    }

    public void accidentCoverage()
    {
        i.accidentCoverage();
    }
    public void luggageCoverage()
    {
        i.luggageCoverage();
    }



}
