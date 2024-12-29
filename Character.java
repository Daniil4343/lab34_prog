public abstract class Character {
    private String name;


    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void performAction();

    @Override
    public String toString() {
        return name + " " + getName();
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }

}
