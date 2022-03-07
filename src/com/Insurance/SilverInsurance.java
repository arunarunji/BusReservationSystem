package com.Insurance;

public class SilverInsurance implements Insurance {
    private final int accidentCoverage=100000;
    private final int luggageCoverage=2500;
static SilverInsurance si=new SilverInsurance();
private SilverInsurance()
{

}
public static SilverInsurance getInstance()
{
    return si;
}
    @Override
    public int accidentCoverage() {
        return accidentCoverage;   }

    @Override
    public int luggageCoverage() {
        return luggageCoverage;
    }
}
