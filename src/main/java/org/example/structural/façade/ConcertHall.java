package org.example.structural.façade;

import org.example.structural.façade.model.Concert;

public class ConcertHall {

    public static void main(String[] args) {
        Concert concert = new Concert();
        concert.doConcert();
    }
}
