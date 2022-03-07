package com.BusReservation;

import java.util.Date;

public class Ticket {

    private static int ticketID = 100;
    private Date Date;
    private String from;
    private String to;



    public Ticket(java.util.Date date, String from, String to) {
        Date = date;
        this.from = from;
        this.to = to;
        ticketID++;
    }

    public static int getTicketID() {
        return ticketID;
    }

    public static void setTicketID(int ticketID) {
        Ticket.ticketID = ticketID;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }



}