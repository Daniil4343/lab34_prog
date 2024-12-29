import java.util.Objects;

public class Sprayer {
    private int volume;
    private LiquidType liquidType;

    public Sprayer(int volume, LiquidType liquidType) {
        this.volume = volume;
        this.liquidType = liquidType;
    }

    public void spray(Aromatizable target) throws ExhaustedException {
        if (volume <= 0) {
            throw new ExhaustedException(liquidType + " закончился!");
        }
        volume -= 10;
        target.reduceSmell(10);
        System.out.println("Распылено " + liquidType + ". Осталось " + volume + " мл.");
    }

    public void recharge(int amount) {
        volume += amount;
        System.out.println("Распылитель " + liquidType + " пополнен на " + amount + " мл. Теперь доступно " + volume + " мл.");
    }

    public boolean hasLiquid() {
        return volume > 0;
    }

    public int getVolume() {
        return volume;
    }

    public LiquidType getLiquidType() {
        return liquidType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sprayer sprayer = (Sprayer) o;
        return volume == sprayer.volume && liquidType == sprayer.liquidType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume, liquidType);
    }

    @Override
    public String toString() {
        return "Sprayer{" + "volume=" + volume + ", liquidType=" + liquidType + '}';
    }
}
