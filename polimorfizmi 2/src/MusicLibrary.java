import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class MusicLibrary {
    private List<Artist> artists;
    private List<Album> albums;
    private List<Music> songs;

    public MusicLibrary() {
        this.artists = new ArrayList<>();
        this.albums = new ArrayList<>();
        this.songs = new ArrayList<>();
    }

    public void addArtist(Artist artist) {
        artists.add(artist);
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public void addMusic(Music music) {
        songs.add(music);
    }

    public Music searchMusic(String title) {
        for (Music music : songs) {
            if (music.getTitle().equalsIgnoreCase(title)) {
                return music;
            }
        }
        return null;
    }

    public Music giveRandomMusic() {
        Random random = new Random();
        return songs.get(random.nextInt(songs.size()));
    }

    public void displayLibraryInfo() {
        System.out.println("Music Library:");
        for (Artist artist : artists) {
            artist.displayInfo();
        }
    }
}