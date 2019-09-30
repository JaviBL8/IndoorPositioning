package com.example.indoorpositioning.DB;

public class AP {

    private String mac;
    private String lugar;

    AP(String mac, String lugar) {
        this.mac = mac;
        this.lugar = lugar;
    }

    public String getMAC() {
        return mac;
    }

    public String getLugar() {
        return lugar;
    }
}
