import java.util.*;

public class Main {
    public static void main(String[] args) {


        int randomSmellLevel = RandomizeSmellLevel.generate();
        PrinceLemon prince = new PrinceLemon("Его Высочество","Лимон",  100);
        Outskirts outskirts = new Outskirts("Бедная окраина", new SmellRecord(randomSmellLevel, "Луковый запах"));
        Courtiers courtiers = new Courtiers(50);
        Cipollone cipollone = new Cipollone("Чиполлоне", new SmellRecord(80, "Острый запах"), "Большой");
        Cipollino cipollino = new Cipollino("Чиполлино", cipollone);

        cipollino.setBrothers(new Cipollino[]{
                new Cipollino("Чиполлетто", cipollone),
                new Cipollino("Чиполлотто", cipollone),
                new Cipollino("Чиполлочча", cipollone),
                new Cipollino("Чиполлучча ", cipollone)
        });

        List<LocalResident> residents = Arrays.asList(
                new LocalResident("Анна", new SmellRecord(randomSmellLevel, "")),
                new LocalResident("Иван", new SmellRecord(randomSmellLevel, "")),
                new LocalResident("Мария", new SmellRecord(randomSmellLevel, ""))
        );

        Sprayer cologne = new Sprayer(randomSmellLevel, LiquidType.COLOGNE);
        Sprayer violetEssence = new Sprayer(randomSmellLevel, LiquidType.VIOLET_ESSENCE);
        Sprayer roseWater = new Sprayer(randomSmellLevel, LiquidType.ROSE_WATER);
        Soldiers soldiers = new Soldiers(randomSmellLevel, new Sprayer[]{cologne, violetEssence, roseWater});

        AromatizationTeam team = new AromatizationTeam("лимончики", soldiers);

        Visit visit = new Visit(new Date(), prince);

        LimonCourtier limonCourtier = new LimonCourtier(30);







        prince.arrive(outskirts.getName());
        courtiers.developPlan();
        courtiers.advise();

        try {
            Random random = new Random();
            for (LocalResident resident : residents) {
                if (random.nextBoolean()) {
                    System.out.println("солдаты опрыскивают " + resident.getName());
                    soldiers.spray(resident);
                } else {
                    System.out.println("солдаты не добрались до " + resident.getName());
                }
            }

            for (LocalResident resident : residents) {
                resident.performAction();
            }

            System.out.println("солдаты опрыскивают местность...");
            soldiers.spray(outskirts);

            prince.expressOpinion(outskirts.getSmellLevel().level());

            if (outskirts.getSmellLevel().level() > 50) {
                System.out.println("запах остаётся сильным! Придворные предлагают новый план...");
                courtiers.developPlan();
                System.out.println("солдаты проверяют запасы...");
                for (Sprayer sprayer : soldiers.getSprayers()) {
                    sprayer.recharge(30);
                }
                System.out.println("команда начинает повторную ароматизацию...");
                team.performAromatization(outskirts);
            }

            prince.expressOpinion(outskirts.getSmellLevel().level());

            cipollone.complain();

            for (Cipollino brother : cipollino.getBrothers()) {
                System.out.println(brother.getName() + " вышел из дома и построился");
            }

            System.out.println("Солдаты начали опрыскивать Чиполлоне и его сыновей");

            visit.prepareVisit(outskirts);

            cipollino.startSneezing();


            System.out.println("Визит Его Высочества завершен. Местность теперь пахнет лучше!");

        } catch (ExhaustedException e) {
            System.err.println("ошибка: " + e.getMessage());
        } catch (InvalidActionException e) {
            System.err.println("некорректное действие: " + e.getMessage());
        }



    }
}

