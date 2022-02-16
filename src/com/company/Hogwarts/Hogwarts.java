package com.company.Hogwarts;

public class Hogwarts {

    private final String name;
    private final int power;
    private final int transgression;

    public Hogwarts(String name, int power, int transgression) {
        this.name = name;
        this.power = power;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getTransgression() {
        return transgression;
    }

    @Override
    public String toString() {
        return "Студент " + name + " обладает силой магии " + power + " и может трансгрессировать на расстояние " + transgression;
    }
    public void comparsionStudents(Hogwarts student) {
        if (this.power > student.getPower()) {
            System.out.println("Сила магии " + this.name + " больше, чем у " + student.getName());
        } else if (this.power == student.getPower()) {
            System.out.println("Сила магии y " + this.getName() + " и у " + student.getName() + " равная");
            {
            }
        } else {
            System.out.println("Сила магии у " + this.name + " ниже, чем у " + student.getName());
        }
        if(this.transgression > student.getTransgression()) {
            System.out.println(this.name + " может трансгрессировать на большее расстояние, чем " + student.getName());
        } else if (this.transgression == student.getTransgression()) {
            System.out.println(this.getName() + " может трансгрессировать на то же расстояние, что и " + student.getName());
        } else {
            System.out.println(this.name + " может трансгрессировать на меньшее расстояние, чем " + student.getName());
        }
    }
}