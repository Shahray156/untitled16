package com.company.Hogwarts;

public class Hufflepuff extends Hogwarts {

    private final int industriousness;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String name, int power, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, power,transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }
    public int getLoyalty() {
        return loyalty;
    }
    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Трудолюбие студента:" + industriousness + ". Верность: " + loyalty + ". Честность: " + honesty;
    }

    public void comparsionHufflepuffStudents(Hufflepuff  student) {
        super.comparsionStudents(student);

        if(this.industriousness > student.getIndustriousness()) {
            System.out.println(this.getName() + " обладает большим трудолюбием, чем " + student.getName());
        }
        else if (this.industriousness == student.getIndustriousness()) {
            System.out.println("Трудолюбие у " + this.getName() + " и у " + student.getName() + " равное");
        } else {
            System.out.println("Трудолюбие у " + this.getName() + " ниже, чем у " + student.getName());
        }

        if(this.loyalty > student.getLoyalty()) {
            System.out.println(this.getName() + " обладает большей верностью, чем " + student.getName());
        }
        else if (this.loyalty == student.getLoyalty()) {
            System.out.println("Верность у " + this.getName() + " и у " + student.getName() + " равная");
        } else {
            System.out.println("Верность у " + this.getName() + " ниже, чем у " + student.getName());
        }

        if(this.honesty > student.getHonesty()) {
            System.out.println(this.getName() + " обладает большей частностью, чем " + student.getName());
        }
        else if (this.honesty == student.getHonesty()) {
            System.out.println("Честность у " + this.getName() + " и у " + student.getName() + " равная");
        } else {
            System.out.println("Честность у " + this.getName() + " ниже, чем у " + student.getName());
        }

    }
}
