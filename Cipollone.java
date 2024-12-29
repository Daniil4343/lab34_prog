public class Cipollone extends LocalResident {
    private String houseSize;

    public Cipollone(String name, SmellRecord smellImpact, String houseSize) {
        super(name, smellImpact);
        this.houseSize = houseSize;
    }

    public void complain() {
        System.out.println(getName() + " жалуется на запах в доме размером " + houseSize + ".");
    }

    public String getHouseSize() {
        return houseSize;
    }
}
