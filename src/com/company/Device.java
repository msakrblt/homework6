package com.company;

public class Device {
    private String brand;
    private String deviceModel;
    private OS os;
    private String osVersion;

    public Device(String brand, String deviceModel, OS os, String osVersion) {
        this.brand = brand;
        this.deviceModel = deviceModel;
        this.os = os;
        this.osVersion = osVersion;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }
}
