public class LimonCourtier extends Courtiers {
    public LimonCourtier(int worryLevel) {
        super(worryLevel);
    }

    public void adjustForPrinceVisit() {
        System.out.println("Придворные корректируют план визита для Его Высочества.");
    }
}
