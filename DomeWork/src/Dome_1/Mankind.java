package Dome_1;

import java.util.Objects;

public class Mankind {
    private String  name;
    private int age;

    @Override
    public String toString() {
        return "Mankind{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Mankind() {
    }

    public Mankind(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mankind mankind = (Mankind) o;
        return age == mankind.age &&
                Objects.equals(name, mankind.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    public void setAge(int age) {
        this.age = age;
    }
}
