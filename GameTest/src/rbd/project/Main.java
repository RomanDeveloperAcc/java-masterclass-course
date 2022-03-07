package rbd.project;

import com.example.game.Player;

public class Main {

    public static void main(String[] args) {
        Player player = new Player("testName", 20, 15);
        System.out.println(player.toString());
    }
}
