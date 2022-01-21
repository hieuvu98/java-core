package java_collection;

import java.util.*;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        locations.put(0, new Location(0, "Location 0"));
        locations.put(1, new Location(1, "Location 1"));
        locations.put(2, new Location(2, "Location 2"));
        locations.put(3, new Location(3, "Location 3"));
        locations.put(4, new Location(4, "Location 4"));
        locations.put(5, new Location(5, "Location 5"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);
        locations.get(1).addExit("Q", 0);

        locations.get(2).addExit("N", 5);
        locations.get(2).addExit("Q", 0);

        locations.get(3).addExit("W", 1);
        locations.get(3).addExit("Q", 0);
        // find location
        int locationDefault = 1;
        while(true) {
            if(locationDefault == 0) break;
            locationDefault = scanner.nextInt();
            if(!locations.containsKey(locationDefault)) {
                System.out.println("Not found location: " + locationDefault);
            }
            System.out.println("LocationID: " + locations.get(locationDefault).getDescription());
        }
    }

//    public static void main(String[] args) {
//        Theatre theatre = new Theatre("Olympia", 8, 12);
//        ArrayList<Theatre.Seat> seatCopy =  new ArrayList<>(theatre.seats);
//        if(theatre.reserveSeat("D12")) {
//            System.out.println("Please pay for D12");
//        } else {
//            System.out.println("Seat already reserved");
//        }
//        if(theatre.reserveSeat("D4")) {
//            System.out.println("Please pay for D4");
//        } else {
//            System.out.println("Seat already reserved");
//        }
//
//        ArrayList<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
//        ArrayList<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
//        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
//        printList(reverseSeats);
//    }

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
