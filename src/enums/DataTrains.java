package enums;

public enum DataTrains {
    POEZD("478",150,250,1000,"Green"),
    TRAINS("857",100,360,700,"Silver");
    String number;
    Integer seat;
    Integer speed;
    Integer weight;
    String color;

    DataTrains(String number, Integer seat, Integer speed, Integer weight, String color) {
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
