package co3;

import java.util.*;

class Team<T> {
    private ArrayList<T> players = new ArrayList<>();

    public void addPlayer(T player) { players.add(player); }
    public void displayPlayers() { players.forEach(System.out::println); }
}

public class TeamDemo {
    public static void main(String[] args) {
        Team<String> cricketTeam = new Team<>();
        cricketTeam.addPlayer("Virat Kohli");
        cricketTeam.addPlayer("Rohit Sharma");

        Team<String> footballTeam = new Team<>();
        footballTeam.addPlayer("Messi");
        footballTeam.addPlayer("Ronaldo");

        System.out.println("🏏 Cricket Team:");
        cricketTeam.displayPlayers();

        System.out.println("\n⚽ Football Team:");
        footballTeam.displayPlayers();
    }
}
