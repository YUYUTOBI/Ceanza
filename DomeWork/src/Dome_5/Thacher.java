package Dome_5;

public class Thacher {
    private String name;

    @Override
    public String toString() {
        return "Thacher{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Thacher(String name) {

        this.name = name;
    }

    public Thacher() {

    }
}
