package Dome_2;

public class Dome_5Car {
    private String  car;
    public Dome_5Car() {
    }

    @Override
    public String toString() {
        return "Dome_5Car{" +
                "car='" + car + '\'' +
                '}';
    }

    public Dome_5Car(String car) {

        this.car = car;
    }

    public String getCar() {

        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }


    }



