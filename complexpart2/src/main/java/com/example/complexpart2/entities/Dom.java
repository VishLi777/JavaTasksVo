package com.example.complexpart2.entities;

import java.util.List;
import java.util.Map;

public class Dom{
    private Map<String, List<Human>> apartments;
    private String address;

    public Dom() {
    }

    public Dom(Map<String, List<Human>> apartments, String address) {
        this.apartments = apartments;
        this.address = address;
    }

    public void setApartments(Map<String, List<Human>> apartments) {
        this.apartments = apartments;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Map<String, List<Human>> getApartments() {
        return apartments;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Dom{" +
                "apartments=" + apartments +
                ", address='" + address + '\'' +
                '}';
    }
}
