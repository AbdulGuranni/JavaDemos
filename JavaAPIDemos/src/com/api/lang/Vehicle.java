package com.api.lang;

import java.util.Objects;

public class Vehicle {
    private String brand;
    private String colour;
    private String model;

    public Vehicle(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return brand.equals(vehicle.brand) && colour.equals(vehicle.colour) && model.equals(vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }

    public Vehicle(String brand, String colour, String model) {
        this.brand = brand;
        this.colour = colour;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
