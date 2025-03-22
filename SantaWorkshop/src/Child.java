import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Child {
    private String name;
    private int behaviorScore;
    private List<String> wishList;

    public Child(String name, int behaviorScore) {
        this.name = name;
        this.behaviorScore = behaviorScore;
        this.wishList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBehaviorScore() {
        return behaviorScore;
    }

    public void setBehaviorScore(int behaviorScore) {
        this.behaviorScore = behaviorScore;
    }

    public List<String> getWishList() {
        return wishList;
    }

    public void addWish(String wish) {
        wishList.add(wish);
    }

    @Override
    public String toString() {
        return "Child{name='" + name + "', behaviorScore=" + behaviorScore + ", wishList=" + wishList + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Child child = (Child) o;
        return behaviorScore == child.behaviorScore && name.equals(child.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, behaviorScore);
    }
}