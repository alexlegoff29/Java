package com.boc.alexis.models;

public class Car {
    private String brand;
    private String color;
    private String rims;
    private MotorType motor;
    private GearBoxType gearbox;
    private CarType type;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, String rims, MotorType motor, GearBoxType gearbox, CarType Type) {
        this.color = color;
        this.rims = rims;
        this.motor = motor;
        this.gearbox = gearbox;
        this.type = type;
    }

    public Car() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRims() {
        return rims;
    }

    public void setRims(String rims) {
        this.rims = rims;
    }

    public MotorType getMotor() {
        return motor;
    }

    public void setMotor(MotorType motor) {
        this.motor = motor;
    }

    public GearBoxType getGearbox() {
        return gearbox;
    }

    public void setGearbox(GearBoxType gearbox) {
        this.gearbox = gearbox;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType cartype) {
        this.type = cartype;
    }


    public void honk(){
        System.out.println("Pip pip pip");
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", rims='" + rims + '\'' +
                ", motor=" + motor +
                ", gearbox=" + gearbox +
                ", type=" + type +
                '}';
    }
}
