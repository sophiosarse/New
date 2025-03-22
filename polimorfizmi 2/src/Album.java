import java.util.ArrayList;
import java.util.List;

class Album {
    private String name;
    private int releaseYear;
    private List<Music> musics;

    public Album(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.musics = new ArrayList<>();
    }

    public void addMusic(Music music) {
        musics.add(music);
    }

    public void removeMusic(Music music) {
        musics.remove(music);
    }

    public void displayInfo() {
        System.out.println("Album: " + name + " (" + releaseYear + ")");
        for (Music music : musics) {
            music.displayInfo();
        }
    }

    public List<Music> getMusics() {
        return musics;
    }
}