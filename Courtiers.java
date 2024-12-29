public class Courtiers { //Придворные
    private int worryLevel;

    public Courtiers(int worryLevel) {
        this.worryLevel = worryLevel;
    }

    public void developPlan() {
        System.out.println("придворные разрабатывают план действий");
    }

    public void advise(){
        System.out.println("придворные советуют немедленно устранить запах");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Courtiers courtiers = (Courtiers) o;
        return worryLevel == courtiers.worryLevel;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(worryLevel);
    }

    @Override
    public String toString() {
        return "Courtiers{" + "worryLevel=" + worryLevel +'}';
    }
}
