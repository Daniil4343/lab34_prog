import java.util.*;

public class Soldiers {
    private int soldierCount;
    private Sprayer[] sprayers;

    public Soldiers(int soldierCount, Sprayer[] sprayers) {
        this.soldierCount = soldierCount;
        this.sprayers = sprayers;
    }

    public void spray(Aromatizable target) throws ExhaustedException {
        for (Sprayer sprayer : sprayers) {
            if (sprayer.hasLiquid()) {
                sprayer.spray(target);
                return;
            }
        }
        throw new ExhaustedException("все распылители пусты, солдаты не могут продолжить.");
    }

    public int getSoldierCount() {
        return soldierCount;
    }

    public Sprayer[] getSprayers() {
        return sprayers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Soldiers soldiers = (Soldiers) o;
        return soldierCount == soldiers.soldierCount && Arrays.equals(sprayers, soldiers.sprayers);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(soldierCount);
        result = 31 * result + Arrays.hashCode(sprayers);
        return result;
    }

    @Override
    public String toString() {
        return "Soldiers{" + "soldierCount=" + soldierCount + ", sprayers=" + Arrays.toString(sprayers) +   '}';
    }

}
