package com.sda.ex13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    private List<Car> carList;

    public CarService() {
        this.carList = new ArrayList<>();
    }

    public void addCarsToTheList(Car car) {
        carList.add(car);

    }

    public void removeCarFromList(Car car) {
        carList.remove(car);
    }

    public List<Car> getCarList() {
        return this.carList;
    }

    public List<Car> getCarsWithEngineV12() {
        return carList
                .stream().filter((Car car) -> car.getEngine().equals("v12"))
                .collect(Collectors.toList());
    }

    public List<Car> getCarYearOfFabrication(int year) {
        return carList
                .stream()
                .filter((Car car) -> car.getYearManufacturer() < year)
                .collect(Collectors.toList());
    }

    public Car mostExpensiveCar() {
        double maxPrice = 0;
        Car expensiveCar = null;
        for (Car car : carList) {
            if (maxPrice < car.getPrice()) {
                maxPrice = car.getPrice();
                expensiveCar = car;
            }
        }
        return expensiveCar;
    }



    public Car cheapest() {
        double minPrice = 0;
        Car cheap = null;
        for (Car car : carList) {
            if (minPrice < car.getPrice()) {
                minPrice = car.getPrice();
                cheap = car;
            }
        }
        return cheap;
    }

    public List<Car> searchFromManufacturer(String manufacturer) {
        return carList
                .stream().filter((Car car) -> car.getManufacturer().equalsIgnoreCase(manufacturer))
                .collect(Collectors.toList());

    }

    public List<Car> sortList(boolean isAscending) {
        if (isAscending) {
            return carList
                    .stream().sorted(Comparator.comparing(Car::getPrice))
                    .collect(Collectors.toList());
        } else {
            return carList
                    .stream().sorted(Comparator.comparing(Car::getPrice).reversed())
                    .collect(Collectors.toList());
        }


    }

    public boolean checkSpecificCar(Car car) {
        return carList.stream().allMatch((Car carFromList) -> carFromList.getManufacturer()
                .equals(car.getManufacturer()) && carFromList.getYearManufacturer() == car.getYearManufacturer()
                && carFromList.getEngine().equals(car.getEngine())
                && carFromList.getPrice() == car.getPrice());
    }

    public List<Car> sortByManufacturerYear(int year, String condition) {

        switch (condition) {
            case "<":
                return carList.stream().filter((Car car) -> car.getYearManufacturer() < year)
                        .collect(Collectors.toList());
            case ">":
                return carList.stream().filter((Car car) -> car.getYearManufacturer() > year)
                        .collect(Collectors.toList());
            case "<=":
                return carList.stream().filter((Car car) -> car.getYearManufacturer() <= year)
                        .collect(Collectors.toList());
            case">=":
                return carList.stream().filter((Car car)-> car.getYearManufacturer() >= year)
                        .collect(Collectors.toList());
            case"!=":
                return carList.stream().filter((Car car)-> car.getYearManufacturer() != year)
                        .collect(Collectors.toList());
            case"=":
                return carList.stream().filter((Car car)-> car.getYearManufacturer() == year)
                        .collect(Collectors.toList());
            default:
                return carList;
        }
    }
}
