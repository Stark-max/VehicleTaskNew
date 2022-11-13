package enums;

public enum DataAirplanes {
    SAMOLET("AirDubai",250,450,500,"White-Red"),
    AIRPLANE("AirMoscow",200,400,550,"Red");

    String number;
    Integer seat;
    Integer speed;
    Integer weight;
    String color;

    DataAirplanes(String number, Integer seat, Integer speed, Integer weight, String color) {
        this.number = number;
        this.seat = seat;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
