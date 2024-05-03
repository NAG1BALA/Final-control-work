package model.animals.pets;

import model.animals.Animal;

import java.time.LocalDate;

public abstract class Pets extends Animal {

    public Pets(String name, LocalDate birthdate) {
        super(name, birthdate);
        this.type = "Домашнее животное";
    }
}