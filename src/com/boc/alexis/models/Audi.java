package com.boc.alexis.models;
import java.util.List;

public class Audi extends Car{
    private String model;
    private int size;
    private List<String> options;
    private boolean isCarSunRoof;
    private int motorization;

    public Audi() {
    }

    public Audi(String color, String rims, MotorType motor, GearBoxType gearbox, CarType cartype, String model, int size, List<String> options, boolean iscarSunRoof, int motorization) {
        super(color, rims, motor, gearbox, cartype);
        this.model = model;
        this.size = size;
        this.options = options;
        this.isCarSunRoof = isCarSunRoof;
        this.motorization = motorization;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public boolean isCarSunRoof() {
        return isCarSunRoof;
    }

    public void setCarSunRoof(boolean iscarSunRoof) {
        this.isCarSunRoof = iscarSunRoof;
    }

    public int getMotorization() {
        return motorization;
    }

    public void setMotorization(int motorization) {
        this.motorization = motorization;
    }

    public void honk(){
        System.out.println("co co co co");
    }

    @Override
    public String toString() {
        return "Audi{" +
                "model='" + model + '\'' +
                ", size=" + size +
                ", options=" + options +
                ", iscarSunRoof=" + isCarSunRoof +
                ", motorization=" + motorization +
                "} " + super.toString();
    }
}
