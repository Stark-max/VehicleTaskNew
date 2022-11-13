package controllers;

import models.Airplane;
import models.Car;
import models.Train;
import services.DataOutput;
import services.Reservation;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu implements DataOutput, Reservation {
    private Car car;
    private Train train;
    private Airplane airplane;

    private ArrayList<Car> carArrayList = new ArrayList<>();
    private ArrayList<Train> trainArrayList = new ArrayList<>();
    private ArrayList<Airplane> airplaneArrayList = new ArrayList<>();

    @Override
    public void console() {
        Scanner sc = new Scanner(System.in);
        Loading loading = new Loading();
        carArrayList.addAll(loading.initializeCar());
        trainArrayList.addAll(loading.initializeTrain());
        airplaneArrayList.addAll(loading.initializeAirplane());
        boolean active = true;
        while (active) {
            System.out.println("1.Вывод информации\n2.Резервирование посадочного места\n3.Удаление резервации\n4.Резервированный транспорт\n0.Выход");
            switch (sc.nextInt()) {
                case 1:
                    displayInfo();
                    break;
                case 2:
                    reserve();
                    textIndent();
                    break;
                case 3:
                    deleteReserve();
                    break;
                case 4:
                    displayReservation();
                    textIndent();
                    break;
                case 0:
                    active = false;
                    break;
                default:
                    System.out.println("Введите все повторно!");
                    console();
                    break;
            }
        }
    }

    @Override
    public void displayReservation() {
        if (car != null) {
            System.out.println("Номер машины: " + car.getNumber() + "\nПосадочные места: " + car.getSeat() + "\nМакс. скорость: " + car.getSpeed() + "\nВес машины: " + car.getWeight() + "\nЦвет машины: " + car.getColor());
            textIndent();
        } else {
            System.out.println("Вы не резервировали место в машине!");
        }
        if (train != null) {
            System.out.println("Номер поезда: " + train.getNumber() + "\nПосадочные места: " + train.getSeat() + "\nМакс. скорость: " + train.getSpeed() + "\nВес поезда: " + train.getWeight() + "\nЦвет поезда: " + train.getColor());
            textIndent();
        } else {
            System.out.println("Вы не резервировали место в поезде!");
        }
        if (airplane != null) {
            System.out.println("Название самолета: " + airplane.getNumber() + "\nПосадочные места: " + airplane.getSeat() + "\nМакс. скорость: " + airplane.getSpeed() + "\nВес самолета: " + airplane.getWeight() + "\nЦвет самолета: " + airplane.getColor());
            textIndent();
        } else {
            System.out.println("Вы не резервировали место в самолете!");
        }
    }

    @Override
    public void deleteReserve() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Машина\n2.Поезд\n3.Самолет\nВыберите транспорт: ");
        switch (sc.nextInt()) {
            case 1:
                this.car = null;
                break;
            case 2:
                this.train = null;
                break;
            case 3:
                this.airplane = null;
                break;
        }
    }

    @Override
    public void reserve() {
        Scanner sc = new Scanner(System.in);
        int transportChoose, seatPlace = 0;
        System.out.println("Можно бранировать только по одному транспорту!");
        System.out.println("1.Машина\n2.Поезд\n3.Самолет\nВыберите транспорт: ");
        switch (sc.nextInt()) {
            case 1:
                for (Car car : carArrayList) {
                    System.out.println("Номер машины: " + car.getNumber() + "\nПосадочные места(" + car.getSeat() + "): " + "0" + "\nМакс. скорость: " + car.getSpeed() + "\nВес машины: " + car.getWeight() + "\nЦвет машины: " + car.getColor());
                    textIndent();
                }
                System.out.println("Выберите машину: ");
                transportChoose = sc.nextInt();
                textIndent();
                System.out.println("Выберите посадочное место: ");
                seatPlace = sc.nextInt();
                for (Car cars : carArrayList) {
                    if (transportChoose == 1) {
                        cars.setSeat(seatPlace);
                        this.car = cars;
                        break;
                    } else if (transportChoose == 2) {
                        cars.setSeat(seatPlace);
                        this.car = cars;
                        break;
                    }
                }
                break;
            case 2:
                for (Train train : trainArrayList) {
                    System.out.println("Номер поезда: " + train.getNumber() + "\nПосадочные места(" + train.getSeat() + "): " + "0" + "\nМакс. скорость: " + train.getSpeed() + "\nВес поезда: " + train.getWeight() + "\nЦвет поезда: " + train.getColor());
                    textIndent();
                }
                System.out.println("Выберите поезд: ");
                transportChoose = sc.nextInt();
                System.out.println("Выберите посадочное место: ");
                seatPlace = sc.nextInt();
                for (Train trains : trainArrayList) {
                    if (transportChoose == 1) {
                        trains.setSeat(seatPlace);
                        this.train = trains;
                        break;
                    } else if (transportChoose == 2) {
                        trains.setSeat(seatPlace);
                        this.train = trains;
                        break;
                    }
                }
                break;
            case 3:
                for (Airplane airplane : airplaneArrayList) {
                    System.out.println("Название самолета: " + airplane.getNumber() + "\nПосадочные места(" + airplane.getSeat() + "): " + "0" + "\nМакс. скорость: " + airplane.getSpeed() + "\nВес самолета: " + airplane.getWeight() + "\nЦвет самолета: " + airplane.getColor());
                    textIndent();
                }
                System.out.println("Выберите самолет: ");
                transportChoose = sc.nextInt();
                System.out.println("Выберите посадочное место: ");
                seatPlace = sc.nextInt();
                for (Airplane airplanes : airplaneArrayList) {
                    if (transportChoose == 1) {
                        airplanes.setSeat(seatPlace);
                        this.airplane = airplanes;
                        break;
                    } else if (transportChoose == 2) {
                        airplanes.setSeat(seatPlace);
                        this.airplane = airplanes;
                        break;
                    }
                }
                break;
        }
    }

    @Override
    public void displayInfo() {
        for (Car car : carArrayList) {
            System.out.println("Номер машины: " + car.getNumber() + "\nПосадочные места: " + car.getSeat() + "\nМакс. скорость: " + car.getSpeed() + "\nВес машины: " + car.getWeight() + "\nЦвет машины: " + car.getColor());
            textIndent();
        }


        for (Train train : trainArrayList) {
            System.out.println("Номер поезда: " + train.getNumber() + "\nПосадочные места: " + train.getSeat() + "\nМакс. скорость: " + train.getSpeed() + "\nВес поезда: " + train.getWeight() + "\nЦвет поезда: " + train.getColor());
            textIndent();
        }


        for (Airplane airplane : airplaneArrayList) {
            System.out.println("Название самолета: " + airplane.getNumber() + "\nПосадочные места: " + airplane.getSeat() + "\nМакс. скорость: " + airplane.getSpeed() + "\nВес самолета: " + airplane.getWeight() + "\nЦвет самолета: " + airplane.getColor());
            textIndent();
        }
    }

    @Override
    public void textIndent() {
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");
    }
}
