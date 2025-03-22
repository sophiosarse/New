import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Snowman {
    private double height;
    private String hatColor;
    private boolean isMagical;
    private List<String> accessories;

    public Snowman(double height, String hatColor, boolean isMagical) {
        this.height = height;
        this.hatColor = hatColor;
        this.isMagical = isMagical;
        this.accessories = new ArrayList<>();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHatColor() {
        return hatColor;
    }

    public void setHatColor(String hatColor) {
        this.hatColor = hatColor;
    }

    public boolean isMagical() {
        return isMagical;
    }

    public void setMagical(boolean magical) {
        isMagical = magical;
    }

    public void decorate(String accessory) {
        accessories.add(accessory);
        System.out.println("Added " + accessory + " to the snowman.");
    }

    public void melt() {
        if (height > 0) {
            height /= 2;
            if (height < 1) height = 0;
            System.out.println("The snowman has melted. Current height: " + height);
        } else {
            System.out.println("The snowman is already completely melted.");
        }
    }

    public void makeMagical() {
        isMagical = true;
        System.out.println("The snowman is now magical!");
    }

    @Override
    public String toString() {
        return "Snowman{height=" + height + ", hatColor='" + hatColor + "', isMagical=" + isMagical + ", accessories=" + accessories + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snowman snowman = (Snowman) o;
        return Double.compare(snowman.height, height) == 0 &&
                isMagical == snowman.isMagical &&
                hatColor.equals(snowman.hatColor) &&
                accessories.equals(snowman.accessories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, hatColor, isMagical, accessories);
    }
}