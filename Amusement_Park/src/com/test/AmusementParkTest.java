package com.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.models.AmusementPark;
import com.models.Tickets;

import java.util.Date;
import java.util.Vector;

public class AmusementParkTest {

    private AmusementPark amusementPark;

    @Before
    public void setUp() {
        amusementPark = new AmusementPark("Test Park");
    }

    @Test
    public void testAmusementParkName() {
        assertEquals("Test Park", amusementPark.getName());
    }

    @Test
    public void testAddTicket() {
        Tickets ticket = new Tickets(101, "adult", new Date(), 500);
        amusementPark.addTicket(ticket);
        Vector<Tickets> tickets = amusementPark.getTickets();
        assertNotNull(tickets);
        assertEquals(1, tickets.size());
        assertEquals(ticket, tickets.get(0));
    }

    @Test
    public void testBookTicket() {
        Tickets ticket = new Tickets(102, "child", new Date(), 120);
        amusementPark.addTicket(ticket);
        amusementPark.bookTicket(102, "Yash Doke");
        Vector<Tickets> bookedTickets = amusementPark.bookedTickets();
        Vector<Tickets> availableTickets = amusementPark.getTickets();
        assertEquals(1, bookedTickets.size());
        assertEquals(0, availableTickets.size());
        assertEquals("Unavilable", bookedTickets.get(0).getAvalabilty());
        assertEquals("Yash Doke", bookedTickets.get(0).getHolder());
    }

    
}
