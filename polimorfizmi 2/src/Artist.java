import java.util.ArrayList;
import java.util.List;

class Artist {
    private String name;
    private List<Album> albums;

    public Artist(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public void removeAlbum(Album album) {
        albums.remove(album);
    }

    public void displayInfo() {
        System.out.println("Artist: " + name);
        for (Album album : albums) {
            album.displayInfo();
        }
    }
}