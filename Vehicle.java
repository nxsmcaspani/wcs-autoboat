package main.java;

public abstract class Vehicle {
    private String brand;
    private int kilometers;

    public Vehicle(String brand) {
        this.brand = brand;
        this.kilometers = 0;
    }

    public abstract String doStuff();

    public String getBrand(){
        return this.brand;
    }
}
