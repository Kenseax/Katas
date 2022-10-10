package com.example.demo.javacode.auto_service;

public abstract class Auto {
    private String dateOfCreation;

    private int seriesAndNumber;

    private int mileage;

    public Auto() {
    }

    public Auto(String dateOfCreation, int seriesAndNumber, int mileage) {
        this.dateOfCreation = dateOfCreation;
        this.seriesAndNumber = seriesAndNumber;
        this.mileage = mileage;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public int getSeriesAndNumber() {
        return seriesAndNumber;
    }

    public void setSeriesAndNumber(int seriesAndNumber) {
        this.seriesAndNumber = seriesAndNumber;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
