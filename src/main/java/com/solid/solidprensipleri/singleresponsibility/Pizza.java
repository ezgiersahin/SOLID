package com.solid.solidprensipleri.singleresponsibility;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pizza {

    private String Ad;

    private String Boyut;

    private Double Fiyat;

    private MalzemeIslemleri Malzeme;
}
