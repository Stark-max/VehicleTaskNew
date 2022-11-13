package controllers;

import enums.DataAirplanes;
import enums.DataCar;
import enums.DataTrains;
import models.Airplane;
import models.Car;
import models.Train;

import java.util.ArrayList;

public class Loading {
    public ArrayList<Car> initializeCar() {
        ArrayList<Car> carArrayList = new ArrayList<>();
        for (int i = 0; i < DataCar.values().length; i++) {
            Car car = new Car(DataCar.values()[i].getNumber(),DataCar.values()[i].getSeat(),DataCar.values()[i].getSpeed(),DataCar.values()[i].getWeight(),DataCar.values()[i].getColor());
            carArrayList.add(car);
        }
        return carArrayList;
    }

    public ArrayList<Train> initializeTrain() {
        ArrayList<Train> trainArrayList = new ArrayList<>();
        for (int i = 0; i < DataTrains.values().length; i++) {
            Train train = new Train(DataTrains.values()[i].getNumber(), DataTrains.values()[i].getSeat(), DataTrains.values()[i].getSpeed(), DataTrains.values()[i].getWeight(), DataTrains.values()[i].getColor());
            trainArrayList.add(train);
        }
        return trainArrayList;
    }
    public ArrayList<Airplane> initializeAirplane() {
        ArrayList<Airplane> airplaneArrayList = new ArrayList<>();
        for (int i = 0; i < DataAirplanes.values().length; i++) {
            Airplane airplane = new Airplane(DataAirplanes.values()[i].getNumber(), DataAirplanes.values()[i].getSeat(), DataAirplanes.values()[i].getSpeed(), DataAirplanes.values()[i].getWeight(), DataAirplanes.values()[i].getColor());
            airplaneArrayList.add(airplane);
        }
        return airplaneArrayList;
    }
}