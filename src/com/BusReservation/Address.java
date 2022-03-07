package com.BusReservation;

public class Address {
    private final int doorNO;
    private final String street;
    private final String area;
    private final String city;
    private final String state;
    private final int pinCode;

    public Address(int doorNO, String street, String area, String city, String state, int pinCode) {
        this.doorNO = doorNO;
        this.street = street;
        this.area = area;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }

    public int getDoorNO() {
        return doorNO;
    }

    public String getStreet() {
        return street;
    }

    public String getArea() {
        return area;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getPinCode() {
        return pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "doorNO=" + doorNO +
                ", street='" + street + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
