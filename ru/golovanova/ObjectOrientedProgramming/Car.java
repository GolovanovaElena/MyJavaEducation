package ru.golovanova.ObjectOrientedProgramming;

public class Car {
    private double distance = 0;
    private double gallon = 0;
    private double effeciency = 0;

    public Car (double distance, double gallon, double effeciency){
        this.gallon = gallon;
        this.distance = distance;
        this.effeciency = effeciency;
    }

    public double getDistance() {
        return distance;
    }

    public double getGallon() {
        return gallon;
    }

    public double getEffeciency() {
        return effeciency;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setGallon(double gallon) {
        this.gallon = gallon;
    }

    public void setEffeciency(double effeciency) {
        this.effeciency = effeciency;
    }

    public void drive (double miles){
        if(effeciency * gallon < miles)
            System.out.println("\"Not enough gas!");
        distance = distance + miles;
        gallon = gallon - miles/effeciency;
    }

    public void addGas (double gas) {
        this.gallon = gas + this.gallon;
    }
}
