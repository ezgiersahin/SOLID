package com.solid.solidprensipleri.openclosed;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Circle implements Shape{
    private double radius;

    @Override
    public double getArea() {
        return (radius * radius * Math.PI);
    }
}
