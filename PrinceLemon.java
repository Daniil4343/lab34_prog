public final class PrinceLemon extends Character {
    final String title;

    public PrinceLemon(String title, String name, int patienceLevel) {
        super(name);
        this.title = title;
    }

    public void arrive(String location) {
        System.out.println(title + " " + getName()+ " прибыл в " + location);
    }

    public void expressOpinion(int smellLevel){
        if (smellLevel > 50){
            System.out.println(title + " " + getName() + " говорит: Запах меня раздражает!");
        }else{
            System.out.println(title + " " + getName() + " говорит: здесь приятно пахнет");
        }
    }

    @Override
    public void performAction() {
        System.out.println(getName() + "думает над ситуацией");
    }
}
