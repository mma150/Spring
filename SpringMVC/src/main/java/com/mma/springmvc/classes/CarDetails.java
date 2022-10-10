package com.mma.springmvc.classes;

public class CarDetails {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void carDetails(){
        car.details();
    }
}
