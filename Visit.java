import java.util.*;

public class Visit {
    private Date arrivalTime;
    private final String visitor;

    public Visit(Date arrivalTime, PrinceLemon visitor) {
        this.arrivalTime = arrivalTime;
        this.visitor = String.valueOf(visitor);
    }

    public void prepareVisit(Aromatizable location) {
        System.out.println("Готовится визит " +visitor + " Проверяется состояние " + location);
    }
}
