package com.company;

public class OS {
    private String name;
    private String version;
    private OSType osType;

    public OS(String name, String version, OSType osType) {
        this.name = name;
        this.version = version;
        this.osType = osType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public OSType getOsType() {
        return osType;
    }

    public void setOsType(OSType osType) {
        this.osType = osType;
    }
}
