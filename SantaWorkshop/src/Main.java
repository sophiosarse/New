import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Elf elf1 = new Elf("Jolly", "Y", 120, 5, "Toy Maker");
        Elf elf2 = new Elf("Jingle", "J", 100, 7, "Gift Wrapper");
        elf1.makeToy();
        elf2.wrapGifts();

        Reindeer reindeer1 = new Reindeer("Sparky", "Spark", 10, 25, "Red");
        Reindeer reindeer2 = new Reindeer("Comet", "Fire", 12, 18, "Black");
        reindeer1.fly();
        System.out.println(reindeer1.checkFitnessLevel());

        Child child1 = new Child("Anna", 8);
        Child child2 = new Child("Tom", 5);
        child1.addWish("Doll");
        child1.addWish("Bicycle");
        child2.addWish("Robot");

        Santa santa = new Santa("Santa Claus", "Saint Nicholas", 500);
        santa.getChildrenList().add(child1);
        santa.getChildrenList().add(child2);
        santa.checkNaughtyOrNiceList();
        santa.deliverGifts();

        Snowman snowman = new Snowman(5, "Black", false);
        snowman.decorate("Scarf");
        snowman.melt();
        snowman.makeMagical();
    }
}