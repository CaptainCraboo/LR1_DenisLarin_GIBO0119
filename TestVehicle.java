package ru.mirea.gibo01.pr1;

public class TestVehicle {
    public static void main(String[] args){
        Vehicle Ford = new Vehicle("Ford", 3200);
        Vehicle Mercedes = new Vehicle("Mercedes-Benz", 13235);
        Vehicle Hyundai = new Vehicle("Hyundai");
        Hyundai.setMileage(125000);
        System.out.println(Ford);
        Ford.intoKilometers();
        Mercedes.intoKilometers();
        Hyundai.intoKilometers();
    }
}
