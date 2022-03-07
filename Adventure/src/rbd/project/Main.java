package rbd.project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You are at 0 location"));
        locations.put(1, new Location(1, "You are at 1 location"));
        locations.put(2, new Location(2, "You are at 2 location"));
        locations.put(3, new Location(3, "You are at 3 location"));
        locations.put(4, new Location(4, "You are at 4 location"));
        locations.put(5, new Location(5, "You are at 5 location"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);
        locations.get(1).addExit("Q", 0);

        int loc = 1;

        while (true) {
            loc = scanner.nextInt();

            if (loc == 0) {
                break;
            }

            if (!locations.containsKey(loc)) {
                System.out.println("You cannot move in that location");
            } else {
                System.out.println(locations.get(loc).getDescription());
            }
        }
    }
}
