package com.Insurance;

public class GoldInsurance implements Insurance {
private final int accidentCoverage=500000;
private final int luggageCoverage=5000;
    static GoldInsurance gi=new GoldInsurance();
private GoldInsurance()
{

}
public static GoldInsurance getInstance()
{
    return gi;
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
