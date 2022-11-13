package models;

public class Car extends Vehicle{
    public Car() {
    }

    public Car(String number, Integer seat, Integer speed, Integer weight, String color) {
        super(number, seat, speed, weight, color);
    }
}
