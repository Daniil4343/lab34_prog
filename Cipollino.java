import java.util.Arrays;

public class Cipollino extends Character {
    private Cipollone father;
    private Cipollino[] brothers;
    private boolean isSneezing;

    public Cipollino(String name, Cipollone father) {
        super(name);
        this.father = father;
        this.brothers = new Cipollino[0];
        this.isSneezing = false;
    }

    public void startSneezing() {
        this.isSneezing = true;
        System.out.println(getName() + " начинает чихать из-за сильного запаха!");
    }

    public void setBrothers(Cipollino[] brothers) {
        this.brothers = brothers;
    }

    public Cipollino[] getBrothers() {
        return brothers;
    }

    @Override
    public void performAction() {
        System.out.println(getName() + " ищет способ помочь своему отцу, " + father.getName());
    }
}
