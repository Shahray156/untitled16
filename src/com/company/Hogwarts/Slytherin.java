package com.company.Hogwarts;

public class Slytherin extends Hogwarts {

    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int lustOfPower;

    public Slytherin(String name, int power, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustOfPower) {
        super(name, power,transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustOfPower = lustOfPower;
    }

    public int getCunning() {
        return cunning;
    }
    public int getDetermination() {
        return determination;
    }
    public int getAmbition() {
        return ambition;
    }
    public int getResourcefulness() {
        return resourcefulness;
    }
    public int getLustOfPower() {
        return lustOfPower;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Хитрость студента:" + cunning + ". Решительность: " + determination + ". Амбициозность: " + ambition + ". Находчивость: " + resourcefulness + ". Жажда власти: " + lustOfPower;
    }

    public void comparsionSlytherinStudents(Slytherin student) {
        super.comparsionStudents(student);

        if(this.cunning > student.getCunning()) {
            System.out.println(this.getName() + " обладает большей хитростью, чем " + student.getName());
        }
        else if (this.cunning == student.getCunning()) {
            System.out.println("Хитрость у " + this.getName() + " и у " + student.getName() + " равная");
        } else {
            System.out.println("Хитрость у " + this.getName() + " ниже, чем у " + student.getName());
        }

        if(this.determination > student.getDetermination()) {
            System.out.println(this.getName() + " обладает большей решительностью, чем " + student.getName());
        }
        else if (this.determination == student.getDetermination()) {
            System.out.println("Решительность у " + this.getName() + " и у " + student.getName() + " равная");
        } else {
            System.out.println("Решительность у " + this.getName() + " ниже, чем у " + student.getName());
        }

        if(this.ambition > student.getAmbition()) {
            System.out.println(this.getName() + " обладает большей амбициозностью, чем " + student.getName());
        }
        else if (this.ambition == student.getAmbition()) {
            System.out.println("Амбициозность у " + this.getName() + " и у " + student.getName() + " равная");
        } else {
            System.out.println("Амбициозность у " + this.getName() + " ниже, чем у " + student.getName());
        }
        if(this.resourcefulness > student.getResourcefulness()) {
            System.out.println(this.getName() + " обладает большей находчивостью, чем " + student.getName());
        }
        else if (this.resourcefulness == student.getResourcefulness()) {
            System.out.println("Находчивость у " + this.getName() + " и у " + student.getName() + " равная");
        } else {
            System.out.println("Находчивость у " + this.getName() + " ниже, чем у " + student.getName());
        }
        if(this.lustOfPower > student.getLustOfPower()) {
            System.out.println(this.getName() + " обладает большей жаждой власти, чем " + student.getName());
        }
        else if (this.lustOfPower == student.getLustOfPower()) {
            System.out.println("Жажда власти у " + this.getName() + " и у " + student.getName() + " равная");
        } else {
            System.out.println("Жажда власти у " + this.getName() + " ниже, чем у " + student.getName());
        }
    }
}
