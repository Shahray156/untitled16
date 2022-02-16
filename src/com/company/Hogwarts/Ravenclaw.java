package com.company.Hogwarts;

public class Ravenclaw extends Hogwarts {

    private final int wisdom;
    private final int mind;
    private final int wit;
    private final int creation;

    public Ravenclaw(String name, int power, int transgression, int wisdom, int mind, int wit, int creation) {
        super(name, power,transgression);
        this.wisdom = wisdom;
        this.mind = mind;
        this.wit = wit;
        this.creation = creation;
    }

    public int getWisdom() {
        return wisdom;
    }
    public int getMind() {
        return mind;
    }
    public int getWit () {
        return wit;
    }
    public int getCreation() {
        return creation;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Мудрость студента:" + wisdom + ". Ум: " + mind + ". Остроумие: " + wit + ". Креативность: " + creation;
    }

    public void comparsionRavenclawStudents(Ravenclaw  student) {
        super.comparsionStudents(student);

        if(this.wisdom > student.getWisdom()) {
            System.out.println(this.getName() + " обладает большей мудростью, чем " + student.getName());
        }
        else if (this.wisdom == student.getWisdom()) {
            System.out.println("Мудрость у " + this.getName() + " и у " + student.getName() + " равная");
        } else {
            System.out.println("Мудрость у " + this.getName() + " ниже, чем у " + student.getName());
        }

        if(this.mind > student.getMind()) {
            System.out.println(this.getName() + " обладает большим умом, чем " + student.getName());
        }
        else if (this.mind == student.getMind()) {
            System.out.println("Ум у " + this.getName() + " и у " + student.getName() + " равный");
        } else {
            System.out.println("Ум у " + this.getName() + " ниже, чем у " + student.getName());
        }

        if(this.wit > student.getWit()) {
            System.out.println(this.getName() + " обладает большим остроумием, чем " + student.getName());
        }
        else if (this.wit == student.getWit()) {
            System.out.println("Остроумие у " + this.getName() + " и у " + student.getName() + " равное");
        } else {
            System.out.println("Остроумие у " + this.getName() + " ниже, чем у " + student.getName());
        }
        if(this.creation > student.getCreation()) {
            System.out.println(this.getName() + " обладает большей креативностью, чем " + student.getName());
        }
        else if (this.creation == student.getCreation()) {
            System.out.println("Креативность у " + this.getName() + " и у " + student.getName() + " равная");
        } else {
            System.out.println("Креативность у " + this.getName() + " ниже, чем у " + student.getName());
        }

        }
    }
