import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Music song1 = new Music("Song One", 200, "Pop");
        Music song2 = new Music("Song Two", 180, "Rock");
        Music song3 = new Music("Song Three", 240, "Jazz");

        Album album1 = new Album("First Album", 2020);
        album1.addMusic(song1);
        album1.addMusic(song2);

        Album album2 = new Album("Second Album", 2021);

        Artist artist = new Artist("One Two");
        artist.addAlbum(album1);
        artist.addAlbum(album2);

        MusicLibrary library = new MusicLibrary();
        library.addArtist(artist);
        library.addAlbum(album1);
        library.addAlbum(album2);
        library.addMusic(song1);
        library.addMusic(song2);
        library.addMusic(song3);

        Music foundSong = library.searchMusic("Song One");
        if (foundSong != null) {
            System.out.println("Found song:");
            foundSong.displayInfo();
        }

        library.displayLibraryInfo();

        song1.play();
        song1.stop();

        System.out.println("Random Music:");
        library.giveRandomMusic().displayInfo();
    }
}
