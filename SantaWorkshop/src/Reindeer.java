public class Reindeer extends WorkshopMember {
    private int flyingSpeed;
    private String noseColor;

    public Reindeer(String name, String nickName, int age, int flyingSpeed, String noseColor) {
        super(name, nickName, age);
        this.flyingSpeed = flyingSpeed;
        this.noseColor = noseColor;
    }

    public int getFlyingSpeed() { return flyingSpeed; }
    public void setFlyingSpeed(int flyingSpeed) { this.flyingSpeed = flyingSpeed; }

    public String getNoseColor() { return noseColor; }
    public void setNoseColor(String noseColor) { this.noseColor = noseColor; }

    public void fly() {
        System.out.println(getName() + " is flying at " + flyingSpeed + " speed!");
    }

    public void trainForChristmas() {
        System.out.println(getName() + " is training for Christmas!");
    }

    public char checkFitnessLevel() {
        if (flyingSpeed >= 25) return 'A';
        if (flyingSpeed >= 20) return 'B';
        if (flyingSpeed >= 15) return 'C';
        if (flyingSpeed >= 10) return 'D';
        return 'F';
    }

    @Override
    public String toString() {
        return super.toString() + ", Flying Speed: " + flyingSpeed + ", Nose Color: " + noseColor;
    }
}