package viikko4.lab;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("No animal!");
        }
        this.name = name;
    }

    public abstract String sound();
}