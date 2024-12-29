public class LocalResident extends Character implements Aromatizable {
    private SmellRecord smellImpact;

    public LocalResident(String name, SmellRecord smellImpact) {
        super(name);
        this.smellImpact = smellImpact;
    }

    @Override
    public void reduceSmell(int amount) {
        int newLevel = Math.max(0, smellImpact.level() - amount);
        smellImpact = new SmellRecord(newLevel, smellImpact.description());
        System.out.println(getName() + " теперь чувствует запах на уровне " + smellImpact.level() + ".");
    }

    @Override
    public void performAction() {
        if (smellImpact.level() >= 50) {
            System.out.println(getName() + " жалуется на запах.");

        }else{
            System.out.println(getName() + " не жалуется запах");
        }
    }
}
