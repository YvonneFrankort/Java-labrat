package viikko4.lab;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        /* TODO validate */ this.name = name;
    }

    public abstract String sound();
}