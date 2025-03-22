public class University {
    private String name;
    private boolean isPublic;
    private int facultyCount;

    public University(String name, boolean isPublic, int facultyCount) {
        this.name = name;
        this.isPublic = isPublic;
        this.facultyCount = facultyCount;
    }

    public void printInfo() {
        System.out.println("უნივერსიტეტის დასახელება: " + name);
        System.out.println("სტატუსი: " + (isPublic ? "სახელმწიფო უნივერსიტეტი" : "კერძო უნივერსიტეტი"));
        System.out.println("ფაკულტეტების რაოდენობა: " + facultyCount);
    }
}
