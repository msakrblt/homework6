package com.company;

import com.company.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AndroidOS android = new AndroidOS("android","11",OSType.ANDROID);
        IOS ios = new IOS("ios","15.0.1", OSType.IOS);
        WebOS web = new WebOS("user3","web123",OSType.WINDOWS);
        Device device1 = new Device("samsung", "s12",android,"12.3.2" );
        Device device2 = new Device("iphone", "iphone 13 pro max",ios,"12.3.2" );
        Device device3 = new Device("huawei", "p20",android,"8.3.2" );
        Device device4 = new Device("oppo", "reno",android,"2.3.1" );
        Device device5 = new Device("webBrand", "firefox",web,"8.8.8" );

        List<Device> deviceList = new ArrayList<Device>();
        deviceList.add(device1);
        deviceList.add(device2);
        deviceList.add(device3);
        deviceList.add(device4);
        deviceList.add(device5);
        System.out.println("Brand   |    com.company.Device Model");
        System.out.println("-------------------------");
        deviceList.stream().forEach(device -> {
            System.out.println(device.getBrand() + " - " + device.getDeviceModel());
        });
    }
}
