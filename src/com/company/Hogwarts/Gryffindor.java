package com.company.Hogwarts;

public class Gryffindor extends Hogwarts {

    private final int honour;
    private final int bravery;
    private final int nobility;

    public Gryffindor(String name, int power, int transgression, int honour, int bravery, int nobility) {
        super(name, power,transgression);
        this.honour = honour;
        this.bravery = bravery;
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }
    public int getBravery() {
        return bravery;
    }
    public int getNobility() {
        return nobility;
    }
    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Честь студента: " + honour + ". Храбрость студента: " + bravery + ". Благородство студента: " + nobility;
    }

    public void comparsionGryffindorStudents(Gryffindor student) {
        super.comparsionStudents(student);

        if(this.nobility > student.getNobility()) {
            System.out.println(this.getName() + " обладает большим благородством, чем " + student.getName());
        }
        else if (this.nobility == student.getNobility()) {
            System.out.println("Благородство у " + this.getName() + " и у " + student.getName() + " равное");
        } else {
            System.out.println("Благородство у " + this.getName() + " ниже, чем у " + student.getName());
        }

        if(this.bravery > student.getBravery()) {
            System.out.println(this.getName() + " обладает большей храбростью, чем " + student.getName());
        }
        else if (this.bravery == student.getBravery()) {
            System.out.println("Храбрость у " + this.getName() + " и у " + student.getName() + " равная");
        } else {
            System.out.println("Храбрость у " + this.getName() + " ниже, чем у " + student.getName());
        }

        if(this.honour > student.getHonour()) {
            System.out.println(this.getName() + " обладает большей честью, чем " + student.getName());
        }
        else if (this.honour == student.getHonour()) {
            System.out.println("Честь у " + this.getName() + " и у " + student.getName() + " равная");
        } else {
            System.out.println("Честь у " + this.getName() + " ниже, чем у " + student.getName());
        }
    }
}
