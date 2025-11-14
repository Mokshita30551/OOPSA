// MusicStreamApp.java
import java.util.*;
import java.util.stream.*;

class Song {
    String title;
    String artist;
    double duration; // in minutes

    public Song(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return title + " by " + artist + " (" + duration + " mins)";
    }
}

public class MusicStreamApp {
    public static void main(String[] args) {
        // Step 1: Create a list of Song objects
        List<Song> songs = Arrays.asList(
            new Song("Blinding Lights", "The Weeknd", 3.2),
            new Song("Perfect", "Ed Sheeran", 4.0),
            new Song("Shape of You", "Ed Sheeran", 3.5),
            new Song("Stay", "Justin Bieber", 2.9),
            new Song("Believer", "Imagine Dragons", 3.1),
            new Song("Peaches", "Justin Bieber", 2.7)
        );

        // Step 2: Use Stream API to filter and map
        List<String> longSongs = songs.stream()
            .filter(song -> song.duration > 3.0)      // keep songs longer than 3 mins
            .map(song -> song.title)                  // extract only titles
            .collect(Collectors.toList());            // collect into list

        // Step 3: Display the results
        System.out.println("🎧 Songs longer than 3 minutes:");
        longSongs.forEach(System.out::println);
    }
}
