package models;

public class Airplane extends Vehicle{
    public Airplane() {
    }

    public Airplane(String number, Integer seat, Integer speed, Integer weight, String color) {
        super(number, seat, speed, weight, color);
    }
}
