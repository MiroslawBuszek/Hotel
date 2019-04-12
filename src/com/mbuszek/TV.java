package com.mbuszek;

public class TV {

    private String refNumber;
    private String model;
    private String resolution;
    private int size;

    public TV(String refNumber, String model, String resolution, int size) {
        this.refNumber = refNumber;
        this.model = model;
        this.resolution = resolution;
        this.size = size;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getsize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return refNumber;
    }
}


