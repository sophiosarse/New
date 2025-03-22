import java.util.ArrayList;
import java.util.List;

public class Santa extends WorkshopMember implements ChristmasSpirit {
    private List<Child> childrenList;

    public Santa(String name, String nickName, int age) {
        super(name, nickName, age);
        this.childrenList = new ArrayList<>();
    }

    public List<Child> getChildrenList() {
        return childrenList;
    }

    public void setChildrenList(List<Child> childrenList) {
        this.childrenList = childrenList;
    }

    public void deliverGifts() {
        System.out.println(getName() + " is delivering gifts to all good children!");
    }

    public List<Child> checkNaughtyOrNiceList() {
        List<Child> goodChildren = new ArrayList<>();
        for (Child child : childrenList) {
            if (child.getBehaviorScore() > 5) {
                goodChildren.add(child);
            }
        }
        System.out.println("Checked naughty or nice list. " + goodChildren.size() + " children are on the nice list.");
        return goodChildren;
    }

    @Override
    public void spreadJoy() {
        System.out.println(getName() + " is spreading joy around the world!");
    }

    @Override
    public void singCarols() {
        System.out.println(getName() + " is singing Christmas carols!");
    }

    @Override
    public void decorateTree() {
        System.out.println(getName() + " is decorating a grand Christmas tree!");
    }
}