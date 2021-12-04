package com.solid.solidprensipleri.interfacesegregation;

public interface ISuperHero {

        string Costume();
        string Power();

    public interface IBatMobile{
        default void UseBatMobile() {
        }
    }
    public interface IFly{
        string FlyToSomeWhere();}
    }
