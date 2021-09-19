package ru.mirea.gibo01.pr1;

public class Vehicle {
    private String name;
    private double mileage;

    public Vehicle(String n, double m) {
        name = n;
        mileage = m;
    }
    public Vehicle(String n) {
        name = n;
        mileage = 0;
    }
    public Vehicle() {
        name = "Tesla";
        mileage = 3200;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String toString() {
        return this.name+"'s mileage is "+this.mileage;
    }

    public void intoKilometers(){
        System.out.println(name+"'s mileage in kilometers is " + mileage * 1.6 + " kilometers");
    }
}
