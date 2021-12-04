package com.solid.solidprensipleri.openclosed;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle implements Shape {
    private double length;
    private double height;

    @Override
    public double getArea() {
        return (length * height);
    }
}
