package com.Ticketbooking;

public class BookingThread implements Runnable {
    private TicketCounter ticketCounter;
    private String passengerName;
    private int numberOfTickets;

    public BookingThread(TicketCounter ticketCounter, String passengerName, int numberOfTickets) {
        this.ticketCounter = ticketCounter;
        this.passengerName = passengerName;
        this.numberOfTickets = numberOfTickets;
    }

    @Override
    public void run() {
        ticketCounter.bookTicket(passengerName, numberOfTickets);
    }
}


