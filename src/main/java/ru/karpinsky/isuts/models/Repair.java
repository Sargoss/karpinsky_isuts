package ru.karpinsky.isuts.models;

import java.util.ArrayList;

public class Repair {
    private String vinCode; // Нужна проверка на соответсвие с вином ТС
    private Owner costumer; // Привязка к конкретному заказчику - нужна ли?
    private ArrayList<String> workList; // Нужно сооответсвие с costList
    private ArrayList<String> costList; // Нужно сооответсвие с workList
    private double totalCost;
    private ArrayList<String> recommend; // Рекомендации по дальнейшей эксплуатации
}
