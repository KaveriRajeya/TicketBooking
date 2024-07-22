package com.Ticketbooking;

public class MainClass {

    public static void main(String[] args) throws InterruptedException {
        TicketCounter ticketCounter = new TicketCounter();

        Thread t1 = new Thread(new BookingThread(ticketCounter, "Alice", 4));
        Thread t2 = new Thread(new BookingThread(ticketCounter, "Bob", 2));
        Thread t3 = new Thread(new BookingThread(ticketCounter, "Charlie", 5));
        Thread t4 = new Thread(new BookingThread(ticketCounter, "Dave", 3));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        t1.join();
        t2.join();
        t3.join();
        t4.join();
    }
}
