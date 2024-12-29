import java.util.Objects;

public class AromatizationTeam {
    private String teamName;
    private Soldiers soldiers;

    public AromatizationTeam(String teamName, Soldiers soldiers) {
        this.teamName = teamName;
        this.soldiers = soldiers;
    }

    public void performAromatization(Aromatizable target) {
        try {
            System.out.println("Команда " + teamName + " начинает ароматизацию...");
            soldiers.spray(target);
            System.out.println("Ароматизация объекта завершена.");
        } catch (ExhaustedException e) {
            System.err.println("Команда " + teamName + " столкнулась с проблемой: " + e.getMessage());
        }
    }

    public String getTeamName() {
        return teamName;
    }

    public Soldiers getSoldiers() {
        return soldiers;
    }

    @Override
    public String toString() {
        return "AromatizationTeam{" + "teamName='" + teamName + '\'' + ", soldiers=" + soldiers + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamName, soldiers);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AromatizationTeam that = (AromatizationTeam) obj;
        return Objects.equals(teamName, that.teamName) &&
                Objects.equals(soldiers, that.soldiers);
    }
}
