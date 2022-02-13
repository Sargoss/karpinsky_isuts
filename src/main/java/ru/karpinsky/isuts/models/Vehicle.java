package ru.karpinsky.isuts.models;


public abstract class Vehicle {
    // Common
    protected String brand;
    protected String model;
    protected String gen;
    protected int year;
    protected String country;
    protected String color;
    protected int seatsNumb;
    // Engine
    protected String engType;
    protected String engConfig;
    protected int engDisplacement;   // в куб. см
    protected int engPower;          // в л.с.
    protected int engTorque;         // в Нм
    // Transmission
    protected String transmissionType;
    protected int gearsNumb;
    // Size
    protected int length;
    protected int width;
    protected int height;
    // Weight & volume
    protected int weight;
    protected int weightFull;
    protected int fuelTankCap;
    // Suspension & brake
    protected String frontSuspType;
    protected String rearSuspType;
    protected String frontBrakesType;
    protected String rearBrakesType;
    // Performance Characteristics
    protected int maxSpeed;
    protected double acceleration;  // sec. to 100 kph
    protected double cityFuelFlow;
    protected double highwayFuelFlow;
    protected double mixFuelFlow;
    protected String ecoClass;



}
