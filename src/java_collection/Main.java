package java_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympia", 8, 12);
        ArrayList<Theatre.Seat> seatCopy =  new ArrayList<>(theatre.seats);
        if(theatre.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");
        }
        if(theatre.reserveSeat("D4")) {
            System.out.println("Please pay for D4");
        } else {
            System.out.println("Seat already reserved");
        }

        ArrayList<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        ArrayList<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(reverseSeats);
    }

    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat : list) {
            System.out.println(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("================================");
    }

    public static void sortList(List <? extends Theatre.Seat> list) {
        for(int i = 0; i < list.size() - 1; i++) {
            for(int j = 0; j < list.size(); j++) {
                if(list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
