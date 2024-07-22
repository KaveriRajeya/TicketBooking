package com.Ticketbooking;

public class TicketCounter {
	
	    private int availableTickets = 10;

	    public synchronized boolean bookTicket(String passengerName, int numberOfTickets) {
	        System.out.println("Welcome to the ticket counter, " + passengerName);

	        if (numberOfTickets > availableTickets) {
	            System.out.println("Sorry, not enough tickets available for " + passengerName);
	            return false;
	        } else {
	            availableTickets -= numberOfTickets;
	            System.out.println("Successfully booked " + numberOfTickets + " tickets for " + passengerName);
	            System.out.println("Tickets remaining:" + availableTickets);
	            return true;
	        }
	    }
	}



