public class Motherboard {
    private int ramSlots;
    private String ramType;
    private int fsbSpeed;

    public Motherboard(int ramSlots, String ramType, int fsbSpeed) {
        this.ramSlots = ramSlots;
        this.ramType = ramType;
        this.fsbSpeed = fsbSpeed;
    }

    public void printInfo() {
        System.out.println("ოპერატიული მეხსიერების სლოტების რაოდენობა: " + ramSlots);
        System.out.println("ოპერატიული მეხსიერების ტიპი: " + ramType);
        System.out.println("სიხშირე: " + fsbSpeed + " MHz");
    }
}
