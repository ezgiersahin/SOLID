package com.solid.solidprensipleri.interfacesegregation;

public interface ISuperHero {

        String Costume();
        String Power();

    public interface IBatMobile{
        default void UseBatMobile() {
        }
    }
    public interface IFly{
        String FlyToSomeWhere();}
    }
