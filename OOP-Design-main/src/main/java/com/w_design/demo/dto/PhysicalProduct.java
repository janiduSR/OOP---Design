package com.w_design.demo.dto;

public class PhysicalProduct extends Product{

    private double weightKg;
    private String dimensions;

    public PhysicalProduct(Integer id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public PhysicalProduct() {}

    public double getWeightKg() {return weightKg;}

    public void setWeightKg(double weightKg) {this.weightKg = weightKg;}

    public String getDimensions() {return dimensions;}

    public void setDimensions(String dimensions) {this.dimensions = dimensions;}
}
