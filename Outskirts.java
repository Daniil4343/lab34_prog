public class Outskirts implements Aromatizable {
    private final String name;
    SmellRecord smellLevel;

    public Outskirts(String name, SmellRecord smellLevel) {
        this.name = name;
        this.smellLevel = smellLevel;
    }

    public String getName() {
        return name;
    }

    public SmellRecord getSmellLevel() {
        return smellLevel;
    }

    @Override
    public void reduceSmell(int amount) {
        int newLevel = Math.max(0, smellLevel.level() - amount);
        smellLevel = new SmellRecord(newLevel, smellLevel.description());
        System.out.println("запах в " + name + " уменьшился до " + smellLevel.level());
    }
}
