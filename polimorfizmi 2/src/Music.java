class Music extends Playable {
    private String title;
    private int duration;
    private String genre;

    public Music(String title, int duration, String genre) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void play() {
        System.out.println("Playing music: " + title);
    }

    @Override
    public void stop() {
        System.out.println("Stopped music: " + title);
    }

    //7
    public void displayInfo() {
        System.out.println("Title: " + title + ", Duration: " + duration + "s, Genre: " + genre);
    }
}
