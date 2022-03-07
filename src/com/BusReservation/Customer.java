package com.BusReservation;

public class Customer {
private final String customerName;
private final long customermobile;
private int username;
private final Address address;

    public Customer(String customerName, long customermobile, Address address) {
        this.customerName = customerName;
        this.customermobile = customermobile;
        this.address = address;
    }

    public String getCustomerName() {
        return customerName;
    }

    public long getCustomermobile() {
        return customermobile;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customermobile=" + customermobile +
                ", address=" + address +
                '}';
    }
}
