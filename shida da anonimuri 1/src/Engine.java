public class Engine {
    private String fuelType;
    private int cylinderCount;
    private int resource;

    public Engine(String fuelType, int cylinderCount, int resource) {
        this.fuelType = fuelType;
        this.cylinderCount = cylinderCount;
        this.resource = resource;
    }

    public void printInfo() {
        System.out.println("საწვავის ტიპი: " + fuelType);
        System.out.println("ცილინდრების რაოდენობა: " + cylinderCount);
        System.out.println("რესურსი (კმ): " + resource);
    }

    public int getResource() {
        return resource;
    }
}
